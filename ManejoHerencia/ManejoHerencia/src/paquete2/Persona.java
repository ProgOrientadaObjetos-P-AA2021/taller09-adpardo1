/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author 0zzda
 */
public class Persona {
    private String nombre;
    private String apellido;
    public Persona(String n, String ap){
        nombre=n;
        apellido=ap;
    }
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String n){
        apellido = n;
    }
    public String getApellido(){
        return apellido;
    }
    
}
