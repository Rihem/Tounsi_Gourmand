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
public class Client {
    

    private String nom, prenom, login, password, email,sexe;
    private int tel,age,NomCompte;

    public Client() {
    }

    public Client(String nom, String prenom, String login, String password, String email, int tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.NomCompte =NomCompte;
        this.email = email;
        this.tel = tel;
        this.age = age;
        this.sexe = sexe;
    }

    public int getIdCompte() {
        return NomCompte;
    }

    public void setIdCompte(int idCompte) {
        this.NomCompte = NomCompte;
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{ nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password + ", email=" + email + ", sexe=" + sexe + ", tel=" + tel + ", age=" + age + '}';
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.sexe, other.sexe)) {
            return false;
        }
        if (this.tel != other.tel) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }




    
}
