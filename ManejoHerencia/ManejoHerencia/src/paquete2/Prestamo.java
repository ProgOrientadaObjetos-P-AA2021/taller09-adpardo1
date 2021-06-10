/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo extends Persona{
    private double tiempo;
    private String ciudad;
    public Prestamo(String nom, String ap,double temp, String ciu){
        super(nom, ap);
        tiempo=temp;
        ciudad=ciu;
    }
    public void setTiempo(double n){
        tiempo=n;
    }
    public double getTiempo(){
        return tiempo;
    }
    public void setCiudad(String n){
        ciudad=n;
    }
    public String getCiudad(){
        return ciudad;
    }
    
}
