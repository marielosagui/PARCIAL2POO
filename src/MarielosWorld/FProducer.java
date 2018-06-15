/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarielosWorld;

import MarielosWorld.AbstracFactory;
import Estructuras.Estructuras;
import Estructuras.FactoryEstructuras;
import Raza.FactoryRaza;
import Soldados.FactorySoldados;
import Vehiculos.FactoryVehiculos;

/**
 *
 * @author karla
 */
public class FProducer {
    public static AbstracFactory getfactory(String type){
        switch (type){
            case "raza":
                return new FactoryRaza();
            case "raza2":
                return new FactorySoldados();
            case "estructuras":
                return new FactoryEstructuras();
            case "Vehiculo":
                return new FactoryVehiculos();
        }
        return null;
    }
    
}
