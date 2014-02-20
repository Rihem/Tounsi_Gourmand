/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.entities;

/**
 *
 * @author Hell
 */
public class EspaceGourmand {
    
    private int idEspaceGourmand;
    private String nomEspaceGourmand;
    private String adresse;
    private int numTel;
    private String email;
    private String type;
    private int idProprietaire, idCommentaire, idMenu;
    private boolean ok;

    public int getIdEspaceGourmand() {
        return idEspaceGourmand;
    }

    public void setIdEspaceGourmand(int idEspaceGourmand) {
        this.idEspaceGourmand = idEspaceGourmand;
    }

    public String getNomEspaceGourmand() {
        return nomEspaceGourmand;
    }

    public void setNomEspaceGourmand(String nomEspaceGourmand) {
        this.nomEspaceGourmand = nomEspaceGourmand;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(int idProprietaire) {
        this.idProprietaire = idProprietaire;
    }

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String toString() {
        if(ok==true) System.out.println("Client confirmé");
        else System.out.println("Client pas encore confirmé");
        return "idEspaceGourmand=" + idEspaceGourmand + ", nomEspaceGourmand=" + nomEspaceGourmand + ", adresse=" + adresse + ", numTel=" + numTel + ", email=" + email + ", type=" + type + ", idProprietaire=" + idProprietaire + ", idCommentaire=" + idCommentaire + ", idMenu=" + idMenu;
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EspaceGourmand e = (EspaceGourmand) obj;
        if (this.idEspaceGourmand == e.getIdEspaceGourmand()) {
            return true;
        }
        return false;
    }
}
