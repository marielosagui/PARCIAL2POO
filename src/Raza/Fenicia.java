/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza;

/**
 *
 * @author karla
 */
public class Fenicia implements raza {

    int vida =100;
    
    @Override
    public void atacar() {
       System.out.println("ATACANDO");
    }

    @Override
    public void defender() {
        System.out.println("DEFENDIENDO");
    }

    @Override
    public void Descripcion() {
        System.out.println("Soldados son mas fuertes, el costo de sus edificaciones es alta");
    }
    
}
