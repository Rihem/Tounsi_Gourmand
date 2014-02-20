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
public class Commentaire {
    
    private int idCommentaire;
    private String libelle;

    public Commentaire() {
    }

    public Commentaire(String libelle) {
        this.libelle = libelle;
    }
    
    public int getIdCommentaire() {
        return idCommentaire;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String toString() {
        return "idCommentaire=" + idCommentaire + ", libelle=" + libelle;
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Commentaire c = (Commentaire) obj;
        if (this.idCommentaire == c.getIdCommentaire()) {
            return true;
        }
        return false;
    }
    
}
