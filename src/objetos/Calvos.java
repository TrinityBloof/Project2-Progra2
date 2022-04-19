/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author gara8
 */
public class Calvos {
    
    private String nombre;
    private String cabello;
    
    public static ArrayList listaDatos = new ArrayList<>();

    public Calvos(String nombre, String cabello) {
        this.nombre = nombre;
        this.cabello = cabello;
    }
    
    public Calvos() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCabello() {
        return cabello;
    }

    public void setCabello(String cabello) {
        this.cabello = cabello;
    }
    
    
}
