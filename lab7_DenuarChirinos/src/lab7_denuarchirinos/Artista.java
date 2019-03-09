/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_denuarchirinos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Denuar
 */
public class Artista extends Persona{
    private ArrayList <Usuario> seguidores = new ArrayList();
    private ArrayList <Album> albunes = new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String nombre, String apellido, String usuario, String contraseña, Date fechaN) {
        super(nombre, apellido, usuario, contraseña, fechaN);
    }

    public ArrayList<Usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<Album> getAlbunes() {
        return albunes;
    }

    public void setAlbunes(ArrayList<Album> albunes) {
        this.albunes = albunes;
    }
    
    //mutadores extra:
    public void setSeguidor(Usuario u){
        seguidores.add(u);
    }
    
    public void setAlbum (Album a){
        albunes.add(a);
    }

    @Override
    public String toString() {
        return super.toString() + "Artista{" + "seguidores=" + seguidores + ", albunes=" + albunes + '}';
    }
    
}
