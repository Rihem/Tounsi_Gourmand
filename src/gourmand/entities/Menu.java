/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.entities;

import java.util.Date;

/**
 *
 * @author Hell
 */
public class Menu {
    private int idEntrees, idPlats, idBoissons, idDesserts;
    private int idMenu;

    private String date;

    public Menu() {
    }

    public Menu(int idMenu,String date) {
        this.idMenu = idMenu;
        this.date = date;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public int getIdEntrees() {
        return idEntrees;
    }

    public int getIdPlats() {
        return idPlats;
    }

    public int getIdBoissons() {
        return idBoissons;
    }

    public int getIdDesserts() {
        return idDesserts;
    }

    public void setIdEntrees(int idEntrees) {
        this.idEntrees = idEntrees;
    }

    public void setIdPlats(int idPlats) {
        this.idPlats = idPlats;
    }

    public void setIdBoissons(int idBoissons) {
        this.idBoissons = idBoissons;
    }

    public void setIdDesserts(int idDesserts) {
        this.idDesserts = idDesserts;
    }
    
    

    @Override
    public String toString() {
        return "Menu{" + "idMenu=" + idMenu + ", date=" + date + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        if (this.idMenu != other.idMenu) {
            return false;
        }
        return true;
    }

   

    
    
}
