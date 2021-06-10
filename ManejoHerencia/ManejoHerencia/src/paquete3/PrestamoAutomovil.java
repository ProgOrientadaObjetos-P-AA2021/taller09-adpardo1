package paquete3;
import paquete2.Prestamo;
/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoAutomovil;
    private String marcaAutomovil;
    private double valorAutomovil;
    private double ValorMensual;
    
    public PrestamoAutomovil(String nom, String ap, String ciu,double temp, 
            String tipo, String marca, double valor){
        super(nom, ap, temp, ciu);
        tipoAutomovil= tipo;
        marcaAutomovil=marca;
        valorAutomovil= valor;
    }
    public void setTipoAutomovil(String n){
        tipoAutomovil=n;
    }
    public String getTipoAutomovil(){
        return tipoAutomovil;
    }
    public void setMarcaAutomovil(String n){
        marcaAutomovil=n;
    }
    public String getMarcaAutomovil(){
        return marcaAutomovil;
    }
    public void setValorAutomovil(double n){
        valorAutomovil=n;
    }
    public double getValorAutomovil(){
        return valorAutomovil;
    }
    public void setValorMensual(){
        ValorMensual= valorAutomovil/super.getTiempo();
    }
    public double getValorMensual(){
        return ValorMensual;
    }
    public String toString(){
        String cadena= String.format("El beneficiario: %s %s\nAcreedor al "
                + "prestamo por la compra de un automovil\nCiudad: %s\nTipo "
                + "del automovil: %s\nMarca del automovil: %s\nPor un timepo de:"
                + " %s, pagando %s\nTotal a pagar: %s", super.getNombre(), 
                super.getApellido(),super.getCiudad().toLowerCase(),getTipoAutomovil(),
                getMarcaAutomovil(), super.getTiempo(),getValorMensual()
                ,getValorAutomovil());
        return cadena;
    }
}
