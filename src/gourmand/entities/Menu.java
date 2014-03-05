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
    private int idEspaceGourmand;
    private int idMenu;

    private String date;

    public Menu() {
    }

    public Menu(int idEspaceGourmand,  String date) {
        this.idEspaceGourmand=idEspaceGourmand;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Menu{" + "idEspaceGourmand=" + idEspaceGourmand + ", idMenu=" + idMenu + ", date=" + date + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
    
    

    public int getIdMenu() {
        return idMenu;
    }

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public int getIdEspaceGourmand() {
        return idEspaceGourmand;
    }

    public void setIdEspaceGourmand(int idEspaceGourmand) {
        this.idEspaceGourmand = idEspaceGourmand;
    }

    
    }
    

