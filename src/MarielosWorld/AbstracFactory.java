/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarielosWorld;

import Estructuras.Estructuras;
import Raza.raza;
import Vehiculos.vehiculos;
import Soldados.Soldado;

/**
 *
 * @author karla
 */
public interface AbstracFactory {
   raza getraza (String type);
   Soldado getSoldados(String type);
   Estructuras getEstructuras(String type);
   vehiculos getVehiculos(String type);
}
