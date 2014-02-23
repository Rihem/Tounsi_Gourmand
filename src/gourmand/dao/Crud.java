/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;
import java.util.List;

/**
 *
 * @author Ahmed
 */
public interface Crud {
    public abstract void ajouter(Object o);
    public abstract void supprimer(Object o);
    public abstract void modifier(Object o);
    public abstract List display();
}
