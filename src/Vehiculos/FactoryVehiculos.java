/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Estructuras.Estructuras;
import MarielosWorld.AbstracFactory;
import Raza.raza;
import Soldados.Soldado;

/**
 *
 * @author karla
 */
public class FactoryVehiculos  implements AbstracFactory{

  
    @Override
    public Estructuras getEstructuras(String type) {
        return null;
    }

    @Override
    public vehiculos getVehiculos(String type) {
        switch (type){
            case "Buque":
                return new Buques();
            case "Trirremes":
                return new Trirremes();
        }
        return null;
    }

    @Override
    public raza getraza(String type) {
        return null;
    }

    @Override
    public Soldado getSoldados(String type) {
        return null;
    }

    
}
