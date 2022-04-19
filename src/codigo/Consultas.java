/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import database.DBConsultas;
import objetos.*;

/**
 *
 * @author gara8
 */
public class Consultas {
    
    DBConsultas consulta = new DBConsultas();
    
    public DefaultComboBoxModel cargarNombresCasasPublicacion() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaCasas = consulta.cargarNombresCasasPublicacion();
        for (String casa : listaCasas) {
            modelo.addElement(casa);
        }
        return modelo;
    }
    
    public ArrayList<GraficaPastel> cargarGrafico(String casa) {
        ArrayList<GraficaPastel> listaGrafico = consulta.cargarGrafico(casa);
        return listaGrafico;
    }
    
    public ArrayList<Graficos> cargarGraficoPorcentajexCasa() {
        ArrayList<Graficos> listaGrafico = consulta.cargarGraficoPorcentajexCasa();
        return listaGrafico;
    }
    
    public ArrayList<Graficos> cargarGraficoPorGenero() {
        ArrayList<Graficos> listaGrafico = consulta.cargarGraficoPorGenero();
        return listaGrafico;
    }
    
    public ArrayList<Graficos> cargarGraficoAlturaGenero() {
        ArrayList<Graficos> listaGrafico = consulta.cargarGraficoAlturaGenero();
        return listaGrafico;
    }
    
    public ArrayList<Graficos> cargarGraficoAlineacionF() {
        ArrayList<Graficos> listaGrafico = consulta.cargarGraficoAlineacionF();
        return listaGrafico;
    }
    
    public ArrayList<Graficos> cargarGraficoColorPiel() {
        ArrayList<Graficos> listaGrafico = consulta.cargarGraficoColorPiel();
        return listaGrafico;
    }
    
    public ArrayList<Graficos> cargarGraficoCalvos() {
        ArrayList<Graficos> listaGrafico = consulta.cargarGraficoCalvos();
        return listaGrafico;
    }
    
    public ArrayList<Top10xAltura> cargarTop10xAltura() {
        ArrayList<Top10xAltura> listaDatos = consulta.cargarTop10xAltura();
        return listaDatos;
    }
    
    public ArrayList<Calvos> cargarCalvos() {
        ArrayList<Calvos> listaDatos = consulta.cargarCalvos();
        return listaDatos;
    }
    
    public DefaultComboBoxModel cargarNombresHeroes() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaNombres = consulta.cargarNombresHeroes();
        for (String nombre : listaNombres) {
            modelo.addElement(nombre);
        }
        return modelo;
    }
    
    public SuperHeroes cargarUnSuperHeroe(String nombre) {
        SuperHeroes datos = consulta.cargarUnSuperHeroe(nombre);
        return datos;
    }
    
    public DefaultComboBoxModel cargarNombresHeroes1() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaNombres = consulta.cargarNombresHeroes1();
        for (String nombre : listaNombres) {
            modelo.addElement(nombre);
        }
        return modelo;
    }
    
    public DefaultComboBoxModel cargarNombresHeroes2() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaNombres = consulta.cargarNombresHeroes2();
        for (String nombre : listaNombres) {
            modelo.addElement(nombre);
        }
        return modelo;
    }
    
    public DefaultComboBoxModel cargarNombresHeroes3() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaNombres = consulta.cargarNombresHeroes3();
        for (String nombre : listaNombres) {
            modelo.addElement(nombre);
        }
        return modelo;
    }
    
    public DefaultComboBoxModel cargarNombresHeroes4() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaNombres = consulta.cargarNombresHeroes4();
        for (String nombre : listaNombres) {
            modelo.addElement(nombre);
        }
        return modelo;
    }
    
    public DefaultComboBoxModel cargarNombresHeroes5() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaNombres = consulta.cargarNombresHeroes5();
        for (String nombre : listaNombres) {
            modelo.addElement(nombre);
        }
        return modelo;
    }
    
    public DefaultComboBoxModel cargarNombresHeroesPoderes() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaNombres = consulta.cargarNombresHeroesPoderes();
        for (String nombre : listaNombres) {
            modelo.addElement(nombre);
        }
        return modelo;
    }
    
    public Poderes cargarUnSuperHeroePoder(String nombre) {
        Poderes datos = consulta.cargarUnSuperHeroePoder(nombre);
        return datos;
    }
    
    public qr cargarUnQr(String nombre) {
        qr datos = consulta.cargarUnQr(nombre);
        return datos;
    }
}
