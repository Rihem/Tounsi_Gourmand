/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.entities;

import java.util.Objects;

/**
 *
 * @author Hell
 */
public class Messages {
    int id;
    String emetteur, destinataire, message;

    public Messages() {
    }

    public Messages(String emetteur, String destinataire, String message) {
        this.emetteur = emetteur;
        this.destinataire = destinataire;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getEmetteur() {
        return emetteur;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public String getMessage() {
        return message;
    }

    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Messages msg = (Messages) obj;
        if (this.id != msg.id) {
            return false;
        }
        return true;
    }
    
    
}
