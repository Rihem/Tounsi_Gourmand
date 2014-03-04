/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.entities;

import java.util.Objects;

/**
 *
 * @author Mahdouch
 */
public class Desserts {
    private int idDesserts,idMenu;
    private String libelleDessert;
    private int prix;

    public Desserts() {
    }

    public Desserts(int idDesserts, String libelleDessert, int prix, int idMenu) {
        this.idDesserts = idDesserts;
        this.libelleDessert = libelleDessert;
        this.prix = prix;
        this.idMenu = idMenu;
    }

    public int getIdDesserts() {
        return idDesserts;
    }

    public String getLibelleDessert() {
        return libelleDessert;
    }

    public int getPrix() {
        return prix;
    }

    public void setLibelleDessert(String libelleDessert) {
        this.libelleDessert = libelleDessert;
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
        return "Desserts{" + "idDesserts=" + idDesserts + ", libelleDessert=" + libelleDessert + ", prix=" + prix + ", idMenu=" + idMenu +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Desserts other = (Desserts) obj;
        if (this.idDesserts != other.idDesserts) {
            return false;
        }
        return true;
    }


    
}
