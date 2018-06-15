/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;


/**
 *
 * @author karla
 */
public class Trirremes implements vehiculos {

    public int vida= 80;
  
    @Override
    public void atacar() {
     System.out.println("Vehiculo atacando");
    }
    
}
