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
public class Usuario extends Persona{    
    private ArrayList <Playlist> playlists = new ArrayList();
    private ArrayList <Artista> artistas = new ArrayList();

    public Usuario() {
        super();
    }

    public Usuario(String nombre, String apellido, String usuario, String contraseña, Date fechaN) {
        super(nombre, apellido, usuario, contraseña, fechaN);
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    //mutadores extra:
    public void setArtista(Artista a){
        artistas.add(a);
    }

    @Override
    public String toString() {
        return super.toString() + "Usuario{" + "playlists=" + playlists + ", artistas=" + artistas + '}';
    }
    
}
