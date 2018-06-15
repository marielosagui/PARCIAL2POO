/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soldados;

/**
 *
 * @author karla
 */
public class Arqueros implements Soldado {

    public int vida;
    @Override
    public void atacar() {
        System.out.println("Atacando FLECHAS EN POSICION");
    }

    @Override
    public void defender() {
        System.out.println("DEFENSE!");
    }
    
}
