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
public class Boissons {
    private int idBoissons;
    private String libelleBoisson;
    private int prix;

    public Boissons(int idBoissons, String libelleBoisson, int prix) {
        this.idBoissons = idBoissons;
        this.libelleBoisson = libelleBoisson;
        this.prix = prix;
    }

    public int getIdBoissons() {
        return idBoissons;
    }

    public String getLibelleBoisson() {
        return libelleBoisson;
    }

    public int getPrix() {
        return prix;
    }

    public void setLibelleBoisson(String libelleBoisson) {
        this.libelleBoisson = libelleBoisson;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Boissons{" + "idBoissons=" + idBoissons + ", libelleBoisson=" + libelleBoisson + ", prix=" + prix + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Boissons other = (Boissons) obj;
        if (this.idBoissons != other.idBoissons) {
            return false;
        }
        return true;
    }
    
    
}
