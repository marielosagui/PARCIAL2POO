/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import MarielosWorld.AbstracFactory;
import Raza.raza;
import Vehiculos.vehiculos;
import Soldados.Soldado;

/**
 *
 * @author karla
 */
public class FactoryEstructuras implements AbstracFactory {

    @Override
    public raza getraza(String type) {
       return null;
    }

    @Override
    public Soldado getSoldados(String type) {
       return null;
    }

    @Override
    public Estructuras getEstructuras(String type) {
         switch(type){
           
            case "Ensambladora Toyota":
                return new EnsambladoraTrirremes();
            case "Ensambladora Nissan":
                return new EnsambladoraBuques();
            case "centro mando":
                return new centroMando();
            case "Edificio Entrenamiento":
                return new Cuartel();
            case "Milicia":
                return new Milicia();
            case "Milicia especial":
                return new MiliciaEspecial();    
            case "Recolector 1":
                return new Mina();
            case "Recolector 2":
                return new Aserradero();
            case "Recolector 3":
                return new Pedrera();
                  
        }
        return null;
    }


    @Override
    public vehiculos getVehiculos(String type) {
       return null;
    }

    
}
