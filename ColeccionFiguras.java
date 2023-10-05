/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author HUMGARDEL
 */
public class ColeccionFiguras {
    private ArrayList<Figura> figuras;
    private int contador;
    private static Scanner sc= new Scanner(System.in);
    
    public ColeccionFiguras(){
        this.figuras=new ArrayList<Figura>();
    }
    
    public void ejecutar(){
        int op=0;
        System.out.println("Introducir una opcion: ");
        System.out.println("\t1: Agregar una figura a la coleccion");
        System.out.println("\t2: Mostrar todas las figuras de la coleccion");
        System.out.println("\t3: Mostrar todas las figuras compatibles a la primera");
        System.out.println("\t4: Mostrar todas las coordinadas con la ultima de la coleccion");
        System.out.println("\t5: Mostrar la figura de mayor area");
        System.out.println("\t6: Salir de la aplicacion");
        System.out.println("\t7: Guardar datos en un archivo");
        op = sc.nextInt();
        switch(op){
            case 1:
                int tipo=0;
                System.out.println("Introducir una opcion: ");
                System.out.println("\t1: Poligono Regular");
                System.out.println("\t2: Rombo");
                tipo=sc.nextInt();
                agregarFigura(tipo);
                break;
            
            case 2:
                mostrarFiguras();
                break;
                
            case 3:
                mostrarCompatiblesPrimera();
                break;
                
            case 4:
                mostrarCoordinadasUltima();
                break;
                
            case 5:
                escribirMayorArea();
                break;
                
            case 6:
                salir();
                
            case 7:
                guardarEnArchivo();
                break;
                
            default:
                System.out.println("Opcion no valida");
                break;
                
        }
    }
    
    private void agregarFigura(int tipo_){
        if(tipo_==1){
            System.out.println("Introduzca el color: ");
            String color=sc.next();
            System.out.println("Introduzca el numero de lados: ");
            int lados=sc.nextInt();
            System.out.println("Introduzca el tamanio de los lados: ");
            double tamanio=sc.nextDouble();
            System.out.println("Introduzca el apotema: ");
            double apotema=sc.nextDouble();
            double area=((lados*tamanio)*apotema)/2;
            PoligonoRegular fig= new PoligonoRegular(color, tamanio, area, lados, apotema);
        }
        else if(tipo_==2){
            System.out.println("Introduzca el color: ");
            String color=sc.next();
            System.out.println("Introduzca el tamanio de la diagonal 1: ");
            double diagonal1=sc.nextDouble();
            System.out.println("Introduzca el tamanio de la diagonal 2: ");
            double diagonal2=sc.nextDouble();
            double area=(diagonal1*diagonal2)/2;
            Rombo fig= new Rombo(color, diagonal1, area, diagonal2);
        }
    }
    
    private ArrayList<Figura> mostrarFiguras(){
        return this.figuras;
    }
    
    private void mostrarCompatiblesPrimera(){//color sea igual a la primera
        
    }
    
    private void mostrarCoordinadasUltima(){//color y a rea igual a la ultima
        
    }
    
    private void escribirMayorArea(){
        
    }
    
    private void salir(){
       System.out.println("Proceso finalizado"); 
    }
    
    private void guardarEnArchivo(){
        File archivo;
        System.out.println("Datos guardados satisfactoriamente");
    }
    
    public String toString(){
        String cadena="";
        return cadena;
    }
}
