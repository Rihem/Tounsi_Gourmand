/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.entities;

/**
 *
 * @author Mahdouch
 */
public class Entrees {
    private int idEntrees, idMenu;
    private String libelleEntree;
    private int prix;

    public Entrees(int idEntrees, String libelleEntree, int prix, int idMenu) {
        this.idEntrees = idEntrees;
        this.libelleEntree = libelleEntree;
        this.prix = prix;
        this.idMenu = idMenu;
    }

    public int getIdEntrees() {
        return idEntrees;
    }

    public String getLibelleEntree() {
        return libelleEntree;
    }

    public int getPrix() {
        return prix;
    }

    public void setLibelleEntree(String libelleEntree) {
        this.libelleEntree = libelleEntree;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }
    
    @Override
    public String toString() {
        return "Entrees{" + "idEntrees=" + idEntrees + ", libelleEntree=" + libelleEntree + ", prix=" + prix + ", idMenu=" + idMenu +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entrees other = (Entrees) obj;
        if (this.idEntrees != other.idEntrees) {
            return false;
        }
        return true;
    }
    
    
}
