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
    
    private int idMenu;
    private String entrees, desserts, plats, boissons;
    private float prix;
    private Date date;

    public Menu() {
    }

    public Menu(String entrees, String desserts, String plats, String boissons, float prix, Date date) {
        this.entrees = entrees;
        this.desserts = desserts;
        this.plats = plats;
        this.boissons = boissons;
        this.prix = prix;
        this.date = date;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public String getEntrees() {
        return entrees;
    }

    public void setEntrees(String entrees) {
        this.entrees = entrees;
    }

    public String getDesserts() {
        return desserts;
    }

    public void setDesserts(String desserts) {
        this.desserts = desserts;
    }

    public String getPlats() {
        return plats;
    }

    public void setPlats(String plats) {
        this.plats = plats;
    }

    public String getBoissons() {
        return boissons;
    }

    public void setBoissons(String boissons) {
        this.boissons = boissons;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "idMenu=" + idMenu + ", entrees=" + entrees + ", desserts=" + desserts + ", plats=" + plats + ", boissons=" + boissons + ", prix=" + prix + ", date=" + date;
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu m = (Menu) obj;
        if(this.idMenu==m.getIdMenu()){
            return true;
        }
        return false;
    }
    
}
