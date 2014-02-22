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
public class ProprietaireEspaceGourmand {
    
    private int idProprietaire, tel,age;
    private String password, email, nom, prenom, login,sexe;

    public ProprietaireEspaceGourmand() {
    }

    public ProprietaireEspaceGourmand(int tel, String password, String email, String nom, String prenom, String login) {
        this.tel = tel;
        this.password = password;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.age=age;
        this.sexe=sexe;
    }
    
    public int getIdProprietaire() {
        return idProprietaire;
    }

    public int getAge() {
        return age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }


    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "ProprietaireEspaceGourmand{" + "idProprietaire=" + idProprietaire + ", tel=" + tel + ", age=" + age + ", password=" + password + ", email=" + email + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", sexe=" + sexe + '}';
    }
    
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProprietaireEspaceGourmand p = (ProprietaireEspaceGourmand) obj;
        if(this.idProprietaire==p.getIdProprietaire()){
            return true;
        }
        return false;
    }
    
    
    
}
