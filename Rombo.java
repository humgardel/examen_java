/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author HUMGARDEL
 */
public class Rombo extends Figura {
    private double tamanioLado2;
    
    public Rombo(){
        
    }
    
    public Rombo(double tamanioLado2_){
        super();
        this.tamanioLado2=tamanioLado2_;
    }
    
    public Rombo(String color_, double tamanioLado_, double area_, double tamanioLado2_){
        super();
        this.tamanioLado2=tamanioLado2_;
    }
    
    public String toString(){
        String cadena="";
        return cadena;
    }
    
    public double getTamanioLado2(){
        return this.tamanioLado2;
    }
}
