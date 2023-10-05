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
public class PoligonoRegular extends Figura {
    private int numLados;
    private double apotema;
    
    public PoligonoRegular(){
        
    }
    
    public PoligonoRegular(int numLados_, double apotema_){
        super();
        this.numLados=numLados_;
        this.apotema=apotema_;
    }
    
    public PoligonoRegular(String color_, double tamanioLado_, double area_, int numLados_, double apotema_){
        super();
        this.numLados=numLados_;
        this.apotema=apotema_;
    }
    
    public String toString(){
        String cadena="";
        return cadena;
    }
    
    public int getNumLados(){
        return this.numLados;
    }
    
    public double getApotema(){
        return this.apotema;
    }
}
