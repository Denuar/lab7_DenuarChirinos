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
public class Playlist {
    private String nombre, genero;
    private Date fechaC;
    private ArrayList <Cancion> canciones = new ArrayList();
    private int duracion=0;

    public Playlist() {
    }

    public Playlist(String nombre, String genero, Date fechaC, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaC = fechaC;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Playlist{" + "nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + '}';
    }
    
    public void duracionTotal (){
        for (int i = 0; i < canciones.size(); i++) {
            duracion += canciones.get(i).getDuracion();
        }
    }
}
