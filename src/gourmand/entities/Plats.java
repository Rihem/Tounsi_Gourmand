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
public class Plats {
    private int idPlats,idMenu;
    private String libellePlat;
    private int prix;

    public Plats(int idPlats, String libellePlat, int prix, int idMenu) {
        this.idPlats = idPlats;
        this.libellePlat = libellePlat;
        this.prix = prix;
        this.idMenu= idMenu;
    }

    public Plats() {
        
    }

    public int getIdPlats() {
        return idPlats;
    }

    public String getLibellePlat() {
        return libellePlat;
    }

    public int getPrix() {
        return prix;
    }

    public void setLibellePlat(String libellePlat) {
        this.libellePlat = libellePlat;
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
        return "Plats{" + "idPlats=" + idPlats + ", libelleDessert=" + libellePlat + ", prix=" + prix + "idMenu=" + idMenu +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plats other = (Plats) obj;
        if (this.idPlats != other.idPlats) {
            return false;
        }
        return true;
    }
}
