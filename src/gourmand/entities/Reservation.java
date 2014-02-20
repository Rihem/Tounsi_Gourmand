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
public class Reservation {
    
    private int numReservation, nombrePersonne, numCompte,idEspaceGourmand;
    private Date dateReservation;

    public int getNumReservation() {
        return numReservation;
    }

    public void setNumReservation(int numReservation) {
        this.numReservation = numReservation;
    }

    public int getNombrePersonne() {
        return nombrePersonne;
    }

    public void setNombrePersonne(int nombrePersonne) {
        this.nombrePersonne = nombrePersonne;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public int getIdEspaceGourmand() {
        return idEspaceGourmand;
    }

    public void setIdEspaceGourmand(int idEspaceGourmand) {
        this.idEspaceGourmand = idEspaceGourmand;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String toString() {
        return "numReservation=" + numReservation + ", nombrePersonne=" + nombrePersonne + ", numCompte=" + numCompte + ", idEspaceGourmand=" + idEspaceGourmand + ", dateReservation=" + dateReservation;
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservation r = (Reservation) obj;
        if(this.numReservation==r.getNumReservation()){
            return true;
        }
        return false;
    }
    
}
