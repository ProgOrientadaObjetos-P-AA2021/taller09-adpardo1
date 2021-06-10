/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private String nombreCentroEducativo;
    private double valorCarrera;
    private double valorMensual;
    
    public PrestamoEducativo(String nom, String ap, String ciu, double temp, 
            String nvl, String nCentro, double valor){
        super(nom, ap, temp, ciu);
        nivelEstudio= nvl;
        nombreCentroEducativo=nCentro;
        valorCarrera= valor;
    }
    public void setNivelEstudio(String n){
        nivelEstudio=n;
    }
    public String getNivelEstudio(){
        return nivelEstudio;
    }
    public void setNombreCentroEducativo(String n){
        nombreCentroEducativo=n;
    }
    public String getNombreCentroEducativo(){
        return nombreCentroEducativo;
    }
    public void setValorCarrera(double n){
        valorCarrera=n;
    }
    public double getValorCarrera(){
        return valorCarrera;
    }
    public void setValorMensual(){
        valorMensual= valorCarrera/super.getTiempo();
        valorMensual= valorMensual-(valorMensual*10)/100;
    }
    public double getValorMensual(){
        return valorMensual;
    }
    public String toString(){
        String cadena= String.format("El beneficiario: %s %s\nAcreedor al "
                + "prestamo estudiantil\nCiudad: %s\nNivel de estudio: %s\n"
                + "Nombre del centro educativo: %s\nPor un timepo de:"
                + " %s, pagando %s\nTotal a pagar: %s", super.getNombre(), 
                super.getApellido(),super.getCiudad().toUpperCase(),getNivelEstudio(),
                getNombreCentroEducativo(), super.getTiempo(),getValorMensual()
                ,getValorCarrera());
        return cadena;
    }
    
}
