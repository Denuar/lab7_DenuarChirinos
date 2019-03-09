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
public class Album {
    private String nombreAlbum, nombreArtista;
    private Date año;
    private ArrayList <Cancion> canciones = new ArrayList();

    public Album() {
    }

    public Album(String nombreAlbum, String nombreArtista, Date año) {
        this.nombreAlbum = nombreAlbum;
        this.nombreArtista = nombreArtista;
        this.año = año;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    //mutador extra
    public void setCancion (Cancion c){
        canciones.add(c);
    }

    @Override
    public String toString() {
        return "Album{" + "nombreAlbum=" + nombreAlbum + ", nombreArtista=" + nombreArtista + ", canciones=" + canciones + '}';
    }
    
}
