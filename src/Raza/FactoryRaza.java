/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza;

import Estructuras.Estructuras;
import parcial2poo.AbstracFactory;
import Vehiculos.vehiculos;
import Soldados.Soldado;

/**
 *
 * @author karla
 */
public class FactoryRaza implements AbstracFactory{

    @Override
    public raza getraza(String type) {
        switch (type){
            case "Fenicia":
                return new Fenicia();
            case "Yamato":
                return new Yamato();
            case "Persa":
                return new Persa();
                        
        }
        return null;
    }

    @Override
    public Soldado getSoldados(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estructuras getEstructuras(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public vehiculos getVehiculos(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
