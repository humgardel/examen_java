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
public class Figura {
    private String color;
    private double tamanioLado;
    private double area;
    
    public Figura(){
        
    }
    
    public Figura(String color_, double tamanioLado_, double area_){
        this.color=color_;
        this.tamanioLado=tamanioLado_;
        this.area=area_;
    }
    
    public String toString(){
        String cadena="";
        return cadena;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public double getTamanioLado(){
        return this.tamanioLado;
    }
    
    public double getArea(){
        return this.area;
    }
}
