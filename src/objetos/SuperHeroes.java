/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author gara8
 */
public class SuperHeroes {
    private String nombre;
    private String genero;
    private String colorOjos;
    private String raza;
    private String colorPelo;
    private double altura;
    private String casa;
    private String colorPiel;
    private String alineacion;
    private double peso;
    private ImageIcon foto;
    
    public static ArrayList listaDatos = new ArrayList<>();

    public SuperHeroes(String nombre, String genero, String colorOjos, String raza, String colorPelo, double altura, String casa, String colorPiel, String alineacion, double peso, ImageIcon foto) {
        this.nombre = nombre;
        this.genero = genero;
        this.colorOjos = colorOjos;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.altura = altura;
        this.casa = casa;
        this.colorPiel = colorPiel;
        this.alineacion = alineacion;
        this.peso = peso;
        this.foto = foto;
    }
    
    public SuperHeroes() {
        
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

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
    
    
}
