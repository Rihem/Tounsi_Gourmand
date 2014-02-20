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
    
    
}
