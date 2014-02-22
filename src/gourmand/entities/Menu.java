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

    private Date date;

    public Menu() {
    }

    public Menu(int idMenu,Date date) {
        this.idMenu = idMenu;
        this.date = date;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
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
