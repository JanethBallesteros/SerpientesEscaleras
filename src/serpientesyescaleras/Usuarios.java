/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerpientesYEscaleras;

import javax.swing.ImageIcon;

/**
 *
 * @author KarimePamela
 */
public class Usuarios {
    private String nombre;
    private int puntuacion;
    private ImageIcon icono;
    private int posicion;

    public Usuarios(String nombre, int puntuacion, ImageIcon icono, int posicion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.icono = icono;
        this.posicion = posicion;

    }
    
    
    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public ImageIcon getIcono() {
        return icono;
    }

    public void setIcono(ImageIcon icono) {
        this.icono = icono;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

}
