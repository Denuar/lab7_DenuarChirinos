/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_denuarchirinos;

import java.util.Date;

/**
 *
 * @author Denuar
 */
public class Cancion {
    private String nombreCancion, NombreArtista;
    private Date año;
    private int duracion;

    public Cancion() {
    }

    public Cancion(String nombreCancion, String NombreArtista, Date año, int duracion) {
        this.nombreCancion = nombreCancion;
        this.NombreArtista = NombreArtista;
        this.año = año;
        this.duracion = duracion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getNombreArtista() {
        return NombreArtista;
    }

    public void setNombreArtista(String NombreArtista) {
        this.NombreArtista = NombreArtista;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombreCancion=" + nombreCancion + ", NombreArtista=" + NombreArtista + ", duracion=" + duracion + '}';
    }
    
}
