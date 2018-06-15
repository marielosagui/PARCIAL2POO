/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author karla
 */
public class centroMando implements Estructuras {

    int vida=100;
    
     public int nivel= 1 ;
    
    public void Subirnivel(int a){
        int nivel = a +1;
    }
    @Override
    public void construir() {
       System.out.println("Centro de mando construido");
    }
}
