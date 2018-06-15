/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MarielosWorld;

import MarielosWorld.jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author karla
 */

public class menu {

    private static menu Menu;
    private menu() {
    }

    public static menu getInstance() {
        if (Menu == null) {
            Menu = new menu();
        }
        
        return Menu;
    }
    //public static int fases = 0 ;
    public static String jugador1;
    public static String jugador2;
    ArrayList Recurso = new ArrayList();
     boolean JuegoFinished= true;
     
     
    public void menu(){
         
        boolean x=true;
        jugador i= new jugador();
        jugador j = new jugador ();
        
        System.out.println("============================");
        System.out.println("*   KARLA AGUILAR'S WORLD *");
        System.out.println("============================");
      
       Scanner leer =new Scanner(System.in);
        System.out.println(" °JUGADOR 1|| Ingrese su nombre: ");
      i.setNombre(leer.nextLine());
      
      System.out.println(" °JUGADOR 2|| Ingrese su nombre: ");
      j.setNombre(leer.nextLine());
     
    
     menurazas();
        System.out.print("\n");
        System.out.print(i.getNombre() + ", ELIGE UNA RAZA: ");
        i.setraza(leer.nextInt());
        System.out.print(j.getNombre() + ", ELIGE UNA RAZA: ");
        j.setraza(leer.nextInt());
        System.out.print("\n");
        if (i.getraza()==1){
            System.out.println("Jugador 1: " + i.getNombre() + " Raza: Fenicia");
        }
        else if (i.getraza()==2){
            System.out.println("Jugador 1: " + i.getNombre() + " Raza: Persa");
        }
        else if (i.getraza()==3){
            System.out.println("Jugador 1: " + i.getNombre() + " Raza: Yamato");
        }
        if (j.getraza()==1){
            System.out.println("Jugador 2: " + j.getNombre() + " Raza: Fenicia");
        }
        else if (j.getraza()==2){
            System.out.println("Jugador 2: " + j.getNombre() + " Raza: Persa");
        }
        else if (j.getraza()==3){
            System.out.println("Jugador 2: " + j.getNombre() + " Raza: Yamato");
        }
        int oro1=10000, madera1=5000, piedra1=3000, oro2=10000, madera2=5000, piedra2=3000, fase=1;
        int ncm1=0, ncm2=0;
        
        ArrayList Recursos1 = new ArrayList();
        ArrayList Recursos2 = new ArrayList();
        ArrayList Vehiculos1 = new ArrayList();
        ArrayList Vehiculos2 = new ArrayList();
        ArrayList Tropas1 = new ArrayList();
        ArrayList Tropas2 = new ArrayList();
        
        while (x==true){
            Recurso=i.realizarTurno(oro1,madera1,piedra1,ncm1);
            oro1=(int) (Recurso.get(0));
            madera1=(int) (Recurso.get(1));
            piedra1=(int) (Recurso.get(2));
            ncm1=(int) (Recurso.get(3));
            Recursos1=(ArrayList) Recurso.get(4);
            Vehiculos1=(ArrayList) Recurso.get(5);
            Tropas1=(ArrayList) Recurso.get(6);
            //System.out.println(Recursos1);
            Recurso=j.realizarTurno(oro2,madera2,piedra2,ncm2);
            oro2=(int) (Recurso.get(0));
            madera2=(int) (Recurso.get(1));
            piedra2=(int) (Recurso.get(2));
            ncm2=(int) (Recurso.get(3));
            Recursos2=(ArrayList) Recurso.get(4);
            Vehiculos2=(ArrayList) Recurso.get(5);
            Tropas2=(ArrayList) Recurso.get(6);
            //System.out.println(Recursos2);
            fase=fase+1;
        }
    }

    public static void menurazas() {
        System.out.println("\t Razas Disponibles");
        System.out.println("1.) FENICIA");
        System.out.println("2.) PERSA");
        System.out.println("3.) YAMATO");       
    }
  
}    

    