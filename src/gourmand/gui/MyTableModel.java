/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gourmand.gui;


import gourmand.dao.EspaceGourmandDAO;
import gourmand.entities.EspaceGourmand;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Houssem Eddine
 */
public class MyTableModel extends AbstractTableModel {

    List<EspaceGourmand> listE = new ArrayList<EspaceGourmand>();
    String []header = {"NomEspaceGourmand","Adresse","NumTel","Email","Type"};
    
    public MyTableModel() { //remplissage de la liste des stocks
        listE=new EspaceGourmandDAO().display();
    }
    //
    public int getRowCount() { //nombre de lignes de la table
        return listE.size();
    }

    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            //case 0://colonne id_Stock
                // return listE.get(rowIndex).getIdEspaceGourmand();
            case 0://colonne type_vetement
                return listE.get(rowIndex).getNomEspaceGourmand();
            case 1://colonne quantitét
                return listE.get(rowIndex).getAdresse();
            case 2://colonne adresse depot
                return listE.get(rowIndex).getNumTel();
            case 3:
                return listE.get(rowIndex).getEmail();
            case 4:
                return listE.get(rowIndex).getType();
            default:
                return null;
        }}
    
   
    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    
 
}
