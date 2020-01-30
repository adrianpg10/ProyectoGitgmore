/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.adrian;

import java.time.LocalDate;

/**
 *
 * @author adrianpg
 */
public class ProyectoGmore {

    private String nombre;
    private String ape1nom;
    private LocalDate fecnacim;

    public ProyectoGmore(String nombre, String ape1nom, LocalDate fecnacim) {
        this.nombre = nombre;
        this.ape1nom = ape1nom;
        this.fecnacim = fecnacim;
    }

    public ProyectoGmore() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1nom() {
        return ape1nom;
    }

    public void setApe1nom(String ape1nom) {
        this.ape1nom = ape1nom;
    }

    public LocalDate getFecnacim() {
        return fecnacim;
    }

    public void setFecnacim(LocalDate fecnacim) {
        this.fecnacim = fecnacim;
    }

    @Override
    public String toString() {
        return "ProyectoGmore{" + "nombre=" + nombre + ", ape1nom=" + ape1nom + ", fecnacim=" + fecnacim + '}';
    }
    
    public void saludar(){
        System.out.println("Hola");
    }
    
}
