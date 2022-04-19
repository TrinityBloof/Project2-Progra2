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
public class Top10xAltura {

    private String nombre;
    private String genero;
    private String colorOjos;
    private String raza;
    private String colorPelo;
    private double altura;
    private String casa;
    
    public static ArrayList listaDatos = new ArrayList<>();

    public Top10xAltura(String nombre, String genero, String colorOjos, String raza, String colorPelo, double altura, String casa) {
        this.nombre = nombre;
        this.genero = genero;
        this.colorOjos = colorOjos;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.altura = altura;
        this.casa = casa;
    }
    
    public Top10xAltura() {
        
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

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
    
    
}
