package paquete1;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
/**
 *
 * @authores
 *  Angel Pardo 
 *  Gerald Jaramillo
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int op1, op2;
        String nom, ap, ciud;
        double temp;
        boolean l=false;              
        while(l==false){
            System.out.println("1.- Prestamo de automovil\n2.- Prestamo "
                + "estudiantil\n3.- Salir"); 
            System.out.println("Ingrese el tipo de prestamo a realizar");
            op1=read.nextInt();
            switch(op1){
            case 1:
                System.out.println("Ingrese el nombre");nom=read.next();
                System.out.println("Ingrese el apellido");ap=read.next();
                System.out.println("Ingrese su ciudad");ciud=read.next();
                System.out.println("Ingrese el tiempo en meses del "
                        + "prestamo");temp=read.nextDouble();
                System.out.println("Ingrese el tipo de automovil");
                String tipo=read.next();
                System.out.println("Ingrese la marca del vehiculo");
                String marca=read.next();
                System.out.println("Ingrese el valor del vehiculo");
                double valV=read.nextDouble();
                PrestamoAutomovil prest1 = new PrestamoAutomovil(nom, ap, ciud,
                temp, tipo, marca, valV);
                prest1.setValorMensual();
                System.out.println(prest1.toString());
                break;
            case 2:
                System.out.println("Ingrese el nombre");nom=read.next();
                System.out.println("Ingrese el apellido");ap=read.next();
                System.out.println("Ingrese su ciudad");ciud=read.next();
                System.out.println("Ingrese el tiempo en meses del "
                        + "prestamo");temp=read.nextDouble();
                System.out.println("Ingrese el nivel de estudio");
                String nvl=read.next();
                System.out.println("Ingrese el nombre del centro educativo");
                String nomC=read.next();
                System.out.println("Ingrese el valor de la carrera");
                double valC=read.nextDouble();
                PrestamoEducativo prest2 = new PrestamoEducativo(nom, ap, ciud,
                temp, nvl, nomC, valC);
                prest2.setValorMensual();
                System.out.println(prest2.toString());
                break;
            case 3:
                System.out.println("Fin del ingreso de prestamos");
                l=true;
                break;
            }            
        }
        
    }
    
}
