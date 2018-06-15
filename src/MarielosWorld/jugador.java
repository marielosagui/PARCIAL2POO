/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarielosWorld;
import MarielosWorld.FProducer;
import MarielosWorld.AbstracFactory;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author karla
 */

public class jugador {
    int vida;
    private String nombre;
    private int raza;
    ArrayList Estructuras = new ArrayList();
    ArrayList Recurso = new ArrayList();
    ArrayList Vehiculo = new ArrayList();
    ArrayList Tropa = new ArrayList();
    

    public int getVida() {
        return vida;
    }

    public ArrayList<String> getEstructuras() {
        return Estructuras;
    }

    public ArrayList<String> getVehiculos() {
        return Vehiculo;
    }

    public ArrayList<String> getTropa() {
        return Tropa;
    }

    
    
    
    public jugador() {
        AbstracFactory factory1,factory2,factory3;
        factory1 = FProducer.getfactory("estructura");
        factory2 = FProducer.getfactory("ejercito");
        factory3 = FProducer.getfactory("vehiculo");
    }

    public ArrayList realizarTurno(int oro, int madera, int piedra, int ncm){
        boolean x=true;
        int menuprinc, menuedif, menuconsedif ,f=0, e, menuveh, menutropa;
        Scanner N = new Scanner(System.in);
        
        try{
        while(x == true){
            System.out.println("***" + "Turno de " + nombre + "***");
            System.out.println("Oro: " + oro + "\t" + "Madera: " + madera + "\t" + "\t" + "Piedra: " + piedra);
            System.out.print("\n");
            System.out.println("1.) Edificaciones");
            System.out.println("2.) Tropas");
            System.out.println("3.) Vehiculos");
            System.out.println("4.) Mostrar Recursos");
            System.out.println("5.) Recolectar Recursos");
            System.out.println("6.) Finalizar Turno");
            menuprinc = N.nextInt();
            
            switch(menuprinc){
                case 1: /**************************EDIFICACIONES*************************/
                    System.out.print("Elija una opcion: ");
                    System.out.println("\n");
                    System.out.println("1.) Construir Edificaciones");
                    System.out.println("2.) Mostrar Edificaciones");
                    System.out.println("3.) Mejorar Centro de Mando");
                    System.out.println("4.) Atras");
                    menuedif = N.nextInt();
                    switch(menuedif){
                        case 1: /**************************CONSTRUIR EDIFICACIONES*************************/
                            boolean w=true;
                            while(w == true){
                                System.out.println("Que edificacion desea construir: ");
                                System.out.println("\n");
                                System.out.println("1.) Mina");
                                System.out.println("2.) Aserradero");
                                System.out.println("3.) Pedrera");
                                System.out.println("4.) Cuartel");
                                System.out.println("5.) Ensambladora de Buques");
                                System.out.println("6.) Ensambladora de Trirremes");
                                System.out.println("7.) Volver al menu principal");
                                menuconsedif = N.nextInt();
                                switch(menuconsedif){
                                    case 1: /**************************MINA*************************/
                                        if (this.raza==1 && oro>300 && madera>220 && piedra>100){
                                            System.out.println("Se construira una mina");
                                            Estructuras.add("mina");
                                            oro=oro-300;
                                            madera=madera-220;
                                            piedra=piedra-100;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==2 && oro>300 && madera>220 && piedra>100){
                                            System.out.println("Se construira una mina");
                                            Estructuras.add("mina");
                                            oro=oro-300;
                                            madera=madera-220;
                                            piedra=piedra-100;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (raza==3 && oro>150 && madera>110 && piedra>50){
                                            System.out.println("Se construira una mina");
                                            Estructuras.add("mina");
                                            oro=oro-150;
                                            madera=madera-110;
                                            piedra=piedra-50;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else{
                                            System.out.println("No tienes recursos necesarios");
                                            break;
                                        }
                                    case 2: /**************************ASERRADERO*************************/
                                        if (raza==1 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira un Aserradero");
                                            Estructuras.add("Aserradero");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==2 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira un Aserradero");
                                            Estructuras.add("Aserradero");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==3 && oro>250 && madera>160 && piedra>75){
                                            System.out.println("Se construira un Aserradero");
                                            Estructuras.add("Aserradero");
                                            oro=oro-250;
                                            madera=madera-160;
                                            piedra=piedra-75;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else{
                                            System.out.println("No tienes recursos necesarios");
                                            break;
                                        }
                                    case 3: /**************************PEDRERA*************************/
                                        if (this.raza==1 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira una Pedrera");
                                            Estructuras.add("Pedrera");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==2 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira una Pedrera");
                                            Estructuras.add("Pedrera");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==3 && oro>250 && madera>160 && piedra>75){
                                            System.out.println("Se construira una Pedrera");
                                            Estructuras.add("Pedrera");
                                            oro=oro-250;
                                            madera=madera-160;
                                            piedra=piedra-75;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else{
                                            System.out.println("No tienes recursos necesarios");
                                            break;
                                        }
                                    case 4: /**************************CUARTEL*************************/
                                        if (this.raza==1 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira un Cuartel");
                                            Estructuras.add("cuartel");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==2 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira un Cuartel");
                                            Estructuras.add("cuartel");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==3 && oro>250 && madera>160 && piedra>75){
                                            System.out.println("Se construira un Cuartel");
                                            Estructuras.add("cuartel");
                                            oro=oro-300;
                                            madera=madera-220;
                                            piedra=piedra-100;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else{
                                            System.out.println("No tienes recursos necesarios");
                                            break;
                                        }
                                    case 5: /**************************ENSAMBLADORA DE BUQUES*************************/
                                        if (this.raza==1 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira una Ensambladora de Buques");
                                            Estructuras.add("Ensambladora de Buques");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==2 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira una Ensambladora de Buques");
                                            Estructuras.add("Ensambladora de Buques");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==3 && oro>250 && madera>160 && piedra>75){
                                            System.out.println("Se construira una Ensambladora de Buques");
                                            Estructuras.add("Ensambladora de Buques");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else{
                                            System.out.println("No tienes recursos necesarios");
                                            break;
                                        }
                                    case 6: /**************************TRIRREMES*************************/
                                        if (this.raza==1 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira una Ensambladora de Trirremes");
                                            Estructuras.add("Ensambladora de Trirremes");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==2 && oro>500 && madera>320 && piedra>150){
                                            System.out.println("Se construira una Ensambladora de Trirremes");
                                            Estructuras.add("Ensambladora de Trirremes");
                                            oro=oro-500;
                                            madera=madera-320;
                                            piedra=piedra-150;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else if (this.raza==3 && oro>250 && madera>160 && piedra>75){
                                            System.out.println("Se construira una Ensambladora de Trirremes");
                                            Estructuras.add("Ensambladora de Trirremes");
                                            oro=oro-300;
                                            madera=madera-220;
                                            piedra=piedra-100;
                                            x=false;
                                            w=false;
                                            break;
                                        }
                                        else{
                                            System.out.println("No tienes recursos necesarios");
                                            break;
                                        }
                                    case 7: /**************************MENU PRINCIPAL*************************/
                                        w=false;
                                        break;
                                }
                            }
                        case 2: /**************************MOSTRAR EDIFICACIONES*************************/
                            System.out.println("Nivel de Centro de Mando: "+ ncm);
                            System.out.println("Tus edificaciones son: "+ Estructuras);
                            break;
                        case 3: /**************************MEJORAR CENTRO DE MANDO*************************/
                            if (ncm<3){
                                if (ncm==0 && oro>=1500 && madera>=1500 && piedra>=1500){
                                    ncm=ncm+1;
                                    oro=oro-1500;
                                    madera=madera-1500;
                                    piedra=piedra-1500;
                                    w=false;
                                    x=false;
                                }
                                else if (ncm==1 && oro>=1650 && madera>=1650 && piedra>=1650){
                                    ncm=ncm+1;
                                    oro=oro-1650;
                                    madera=madera-1650;
                                    piedra=piedra-1650;
                                    w=false;
                                    x=false;
                                }
                                else if (ncm==2 && oro>=1950 && madera>=1950 && piedra>=1950){
                                    ncm=ncm+1;
                                    oro=oro-1950;
                                    madera=madera-1950;
                                    piedra=piedra-1950;
                                    w=false;
                                    x=false;
                                }
                            }
                            else if (ncm>=3) {
                                System.out.println("Tu centro de mando esta al maximo nivel");
                            }
                            break;
                        case 4: /**************************MENU PRINCIPAL*************************/
                            break;
/*                        case 5:
                            System.out.println("Oro: "+oro);
                            System.out.println("Madera: "+madera);
                            System.out.println("Piedra: "+piedra);
                            break;*/
                    }
                    break;
                case 2: /**************************TROPAS*************************/
                    System.out.println("Que desea hacer?");
                    System.out.println("\n");
                    System.out.println("1.) Entrenar Tropas");
                    System.out.println("2.) Mostrar Tropas");
                    System.out.println("3.) Atacar");
                    System.out.println("4.) Menu Principal");
                    menutropa = N.nextInt();
                    switch (menutropa){
                        case 1: /**************************ENTRENAR TROPAS*************************/
                            int cuarteles=0;
                            for (int n = 0; n < Estructuras.size(); n=n+1){
                                if (Estructuras.get(n)=="cuartel"){
                                    cuarteles=cuarteles+1;
                                }
                            }
                            if (cuarteles<1){
                                System.out.println("No cuentas con un cuartel");
                            }
                            else if (cuarteles>=1){
                                System.out.println("Que tropa desea entrenar?");
                                System.out.println("\n");
                                System.out.println("1.) Soldados");
                                System.out.println("2.) Caballero");
                                System.out.println("3.) Arquero");
                                
                                System.out.println("4.) Menu Principal");
                                e = N.nextInt();
                                switch (e){
                                    case 1: /**************************SOLDADOS*************************/
                                        System.out.println("Se entrenaran los soldados");
                                        Tropa.add("soldados");
                                        x=false;
                                        break;
                                    case 2:  /**************************CABALLERO*************************/
                                        System.out.println("Se entrenara al caballero");
                                        Tropa.add("caballero");
                                        x=false;
                                        break;
                                    case 3: /**************************ARQUERO*************************/
                                        System.out.println("Se entrenara al arquero");
                                        Tropa.add("arquero");
                                        x=false;
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("No es una opcion valida");
                                        break;
                                }
                            }
                        case 2: /**************************MOSTRAR TROPAS*************************/
                            System.out.println("Tus tropas son: "+Tropa);
                            break;
                        case 3: /**************************ATACAR*************************/
                            System.out.println("ESTAS ATACANDO -> -> ->");
                            break;
                        case 4: /**************************MENU PRINCIPAL*************************/
                            break;
                    }
                    break;
                case 3: /**************************VEHICULOS*************************/
                    System.out.println("Que desea hacer?");
                    System.out.println("\n");
                    System.out.println("1.) Construir Vehiculo");
                    System.out.println("2.) Mostrar Vehiculos");
                    System.out.println("3.) Atacar");
                    System.out.println("4.) Menu Principal");
                    menuveh = N.nextInt();
                    switch(menuveh){
                        case 1: /**************************CONSTRUIR VEHICULOS*************************/
                            int Ensbuque=0, Enstrirreme=0;
                            for (int n = 0; n < Estructuras.size(); n=n+1){
                                if (Estructuras.get(n)=="Ensambladora de Buques"){
                                    Ensbuque=Ensbuque+1;
                                }
                                else if (Estructuras.get(n)=="Ensambladora de Trirremes"){
                                    Enstrirreme=Enstrirreme+1;
                                }
                            }
                            boolean q =true;
                            while(q == true){
                                System.out.println("Que vehiculo desea construir? ");
                                System.out.println("\n");
                                System.out.println("1.) Buque");
                                System.out.println("2.) Trirremes");
                                System.out.println("3.) Volver al menu principal");;
                                f = N.nextInt();
                                switch(f){
                                    case 1: /**************************CONSTRUIR BUQUE*************************/
                                        if (this.raza==1 && oro>500 && madera>300 && piedra>100 && Ensbuque>=1){
                                            System.out.println("Se construira un Buque");
                                            Vehiculo.add("Buque");
                                            oro=oro-500;
                                            madera=madera-300;
                                            piedra=piedra-100;
                                            x=false;
                                            q=false;
                                            break;
                                        }
                                        else if (this.raza==2 && oro>500 && madera>300 && piedra>100 && Ensbuque>=1){
                                            System.out.println("Se construira un Buque");
                                            Vehiculo.add("Buque");
                                            oro=oro-500;
                                            madera=madera-300;
                                            piedra=piedra-100;
                                            x=false;
                                            q=false;
                                            break;
                                        }
                                        else if (raza==3 && oro>300 && madera>200 && piedra>100 && Ensbuque>=1){
                                            System.out.println("Se construira un Buque");
                                            Vehiculo.add("Buque");
                                            oro=oro-300;
                                            madera=madera-200;
                                            piedra=piedra-100;
                                            x=false;
                                            q=false;
                                            break;
                                        }
                                        else if (Ensbuque<1){
                                            System.out.println("No cuentas con una ensambladora de buques");
                                            break;
                                        }
                                        else{
                                            System.out.println("No tienes recursos necesarios");
                                            break;
                                        }
                                    case 2: /**************************CONSTRUIR TRIRREME*************************/
                                        if (this.raza==1 && oro>400 && madera>350 && piedra>200 && Enstrirreme>=1){
                                            System.out.println("Se construira un Trirreme");
                                            Vehiculo.add("Trirreme");
                                            oro=oro-400;
                                            madera=madera-350;
                                            piedra=piedra-200;
                                            x=false;
                                            q=false;
                                            break;
                                        }
                                        else if (this.raza==2 && oro>400 && madera>350 && piedra>200 && Enstrirreme>=1){
                                            System.out.println("Se construira un Trirreme");
                                            Vehiculo.add("Trirreme");
                                            oro=oro-400;
                                            madera=madera-350;
                                            piedra=piedra-200;
                                            x=false;
                                            q=false;
                                            break;
                                        }
                                        else if (raza==3 && oro>350 && madera>200 && piedra>100 && Enstrirreme>=1){
                                            System.out.println("Se construira un Trirreme");
                                            Vehiculo.add("Trirreme");
                                            oro=oro-350;
                                            madera=madera-200;
                                            piedra=piedra-100;
                                            x=false;
                                            q=false;
                                            break;
                                        }
                                        else if (Enstrirreme<1){
                                            System.out.println("No cuentas con una ensambladora de trirreme");
                                            break;
                                        }
                                        else{
                                            System.out.println("No tienes recursos necesarios");
                                            break;
                                        }
                                    case 3: /**************************MENU PRINCIPAL*************************/
                                         q = false;
                                         break;
                                }
                            }
                        case 2: /**************************MOSTRAR VEHICULOS*************************/
                            System.out.println("Tus vehiculos son: "+Vehiculo);
                            break;
                        case 3: /**************************ATACAR*************************/
                            System.out.println(" -> -> ->ATACANDO -> -> -> ->");
                            x=false;
                            break;
                        case 4: /**************************MENU PRINCIPAL*************************/
                            break;
                    }
                case 4: /**************************MOSTRAR RECURSOS*************************/
                    System.out.println("Oro:" + oro+ "\t" + "Madera:" + madera+"\t" +"Piedra:"+ piedra);
                    break;
                case 5: /**************************RECOLECTAR RECURSOS*************************/
                    
                    int minas=0,aserraderos=0,pedreras=0;

                    
                    for (int n = 0; n < Estructuras.size(); n=n+1){
                        if (Estructuras.get(n)=="mina"){
                            minas=minas+1;
                        }
                        else if (Estructuras.get(n)=="Aserradero"){
                            aserraderos=aserraderos+1;
                        }
                        else if (Estructuras.get(n)=="Pedrera"){
                            pedreras=pedreras+1;
                        }
                    }
                    
                    
                    switch (ncm){
                        case 0:
                            if (minas>0 && oro<=10000){
                                oro=oro+200*minas;
                                if (oro>10000){
                                    oro=10000;
                                }
                            }
                            if (aserraderos>0 && madera<=5000){
                                madera=madera+100*aserraderos;
                                if (madera>5000){
                                    madera=5000;
                                }
                            }
                            if (pedreras>0 && piedra<=3000){
                                piedra=piedra+50*pedreras;
                                if (piedra>3000){
                                    piedra=3000;
                                }
                            }
                            System.out.println("Tus recursos fueron recolectados");
                            x=false;
                            break;
                        case 1:
                                if (minas==0){
                                }
                                if (minas>0 && oro<=10000*1.1){
                                    oro=oro+200*minas;
                                    if (oro>10000*1.1){
                                        oro=11000;
                                    }
                                }
                                if (aserraderos>0 && madera<=5000*1.1){
                                    madera=madera+100*aserraderos;
                                    if (madera>5000*1.1){
                                        madera=5500;
                                    }
                                }
                                if (pedreras>0 && piedra <=3000*1.1){
                                    piedra=piedra+50*pedreras;
                                    if (piedra>3000*1.1){
                                        piedra=3300;
                                    }
                                }
                                System.out.println("Tus recursos fueron recolectados");
                                x=false;
                                break;
                        case 2:
                            if (minas>0 && oro<=10000*1.3){
                                oro=oro+200*minas;
                                if (oro>10000*1.3){
                                    oro=13000;
                                }
                            }
                            if (aserraderos>0 && madera<=5000*1.3){
                                madera=madera+100*aserraderos;
                                if (madera>5000*1.3){
                                    madera=6500;
                                }
                            }
                            if (pedreras>0 && piedra<=3000*1.3){
                                piedra=piedra+50*pedreras;
                                if (piedra>3000*1.3){
                                    piedra=3900;
                                }
                            }
                            System.out.println("Tus recursos fueron recolectados");
                            x=false;
                            break;
                        case 3:
                            if (minas>0 && oro<=10000*1.5){
                                oro=oro+200*minas;
                                if (oro>10000*1.5){
                                    oro=15000;
                                }
                            }
                            if (aserraderos>0 && madera<=5000*1.5){
                                madera=madera+100*aserraderos;
                                if (madera>5000*1.5){
                                    madera=7500;
                                }
                            }
                            if (pedreras>0 && piedra<=3000*1.5){
                                piedra=piedra+50*pedreras;
                                if (piedra>3000*1.5){
                                    piedra=4500;
                                }
                            }
                            System.out.println("Tus recursos fueron recolectados");
                            x=false;
                            break;       
                    }
                case 6: /**************************FINALIZAR TURNO*************************/
                    x = false;
                    break;
                    }
                }
            }
        
        catch (InputMismatchException E){
                    System.err.println("DEBES INGRESAR UN ENTERO!");
                    N.nextLine();
                }
            
        Recurso.clear();
        Recurso.add(0,oro);
        Recurso.add(1,madera);
        Recurso.add(2,piedra);
        Recurso.add(3,ncm);
        Recurso.add(4,Estructuras);
        Recurso.add(5,Vehiculo);
        Recurso.add(6,Tropa);
        //System.out.println("oro: "+oro+" madera: "+madera+" piedra: "+piedra);
        //System.out.println(this.Estructuras);
        //System.out.println(this.Vehiculo);
        
        return Recurso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getraza() {
        return raza;
    }

    public int setraza(int opc) {
        /*AbstracFactory producer;
        producer=FProducer.getfactory("raza");*/
        switch(opc){
            case 1:
                this.raza=/*producer.getraza*/1;
                break;
            case 2:
                this.raza =/*producer.getraza*/2;
                break;
            case 3:
                this.raza = /*producer.getraza*/3;
                break;
            default:
                System.out.println("Ingrese una opcion valida");       
        } 
        return raza;
    }
 
    
}
