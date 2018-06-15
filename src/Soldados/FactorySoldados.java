/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soldados;

import Estructuras.Estructuras;
import MarielosWorld.AbstracFactory;
import Raza.raza;
import Vehiculos.vehiculos;

/**
 *
 * @author karla
 */
public class FactorySoldados implements AbstracFactory {

    @Override
    public Estructuras getEstructuras(String type) {
      return null;
    }

    @Override
    public raza getraza(String type) {
        return null;
    }

    @Override
    public Soldado getSoldados(String type) {
        switch (type){
            case "Arqueros ":
                return new Arqueros();
            case "Soldados":
                return new Soldados();
            case "Caballero":
                return new Caballero();
        }
        return null;
    }


    @Override
    public vehiculos getVehiculos(String type) {
        return null;
    }
    
}
