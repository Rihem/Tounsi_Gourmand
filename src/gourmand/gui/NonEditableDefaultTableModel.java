/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hell
 */
public class NonEditableDefaultTableModel extends DefaultTableModel{
    public boolean isCellEditable(int iRowIndex, int iColumnIndex) { 
 
		return false; 
    } 
    
}
