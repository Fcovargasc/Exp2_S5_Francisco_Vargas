
package exp2_s4_francisco_vargas;

import java.util.Scanner;


public class Exp2_S5_Francisco_Vargas {
         static int contadorEntradas=0;
         static  double precioFinal=0;
         static double acomuladorPrecio=0;
         static String acomuladorAsientos="";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remplazo="";
        int opcion;
        String asientos="";
        int asientosDisponibles=9;
        int valorEntrada=10000;
        int tipoEntrada;
        int opcion2;
        int salir;
        String numeroAsiento=" ";
        String resultado = "";
        
        System.out.println("Bienvenidos al Teatro Moro");
        do{
            do{
        System.out.println("Para comprar entrada VIP 1 para Platea 2 Para General 3 Para conocer descuentos y promociones 4");
        opcion = scanner.nextInt();
     
        switch (opcion){
            case 1 -> {
                
               
                for (int i = 1; i <= asientosDisponibles; i++) {
                    
                System.out.print(i + "A ");
                if (i % 3 == 0) {
                    System.out.println();
                }
            }   
                
                System.out.println("");
                System.out.println("seleccione un asiento disponible ");
                 asientos=scanner.next();
                System.out.println("ingrese su edad");
                tipoEntrada=scanner.nextInt();
                
                if(tipoEntrada <18 && tipoEntrada > 5){
                    precioFinal=valorEntrada*0.90;
                    
               }else if(tipoEntrada >= 65){
                    precioFinal=valorEntrada*0.85;
               }else{
                   precioFinal=valorEntrada;
               }
                                                 
                
                }
            case 2 ->{
                for (int i = 1; i <= asientosDisponibles; i++) {
                    
                System.out.print(i + "B ");
                if (i % 3 == 0) {
                    System.out.println(); 
                }
            }
                System.out.println("");
                System.out.println("seleccione un asiento disponible ");
                asientos=scanner.next();
                System.out.println("ingrese su edad");
                tipoEntrada=scanner.nextInt();
                
                if(tipoEntrada <18 && tipoEntrada > 5){
                    precioFinal=valorEntrada*0.90;
                    
               }else if(tipoEntrada >= 65){
                    precioFinal=valorEntrada*0.85;
               }else{
                   precioFinal=valorEntrada;
               }
            }
            case 3 -> {
                for (int i = 1; i <= asientosDisponibles; i++) {
                    
                System.out.print(i + "C ");
                if (i % 3 == 0) {
                    System.out.println(); 
                }
            }
                  System.out.println("");
                System.out.println("seleccione un asiento disponible ");
                 asientos=scanner.next();
                System.out.println("ingrese su edad");
                tipoEntrada=scanner.nextInt();
                
                if(tipoEntrada <18 && tipoEntrada > 5){
                    precioFinal=valorEntrada*0.90;
                    
               }else if(tipoEntrada >= 65){
                    precioFinal=valorEntrada*0.85;
               }else{
                   precioFinal=valorEntrada;
               }}
            case 4 -> {
                System.out.println("promociones disponibles ");
                System.out.println("tercera edad 15%  , estudiantes 10% ");
                System.out.println(" comprando 5 o mas entradas 20% ");
            }
        }
               if (opcion==4){
               precioFinal=0;}
            
        acomuladorPrecio+=precioFinal;
        acomuladorAsientos+=asientos;
        
                System.out.println("¿Desea buscar informacion sobre una entrada? SI precione 1 NO precione 2");
                opcion2=scanner.nextInt();
                switch (opcion2){
                    case 1-> {
                        System.out.println("ingrese El numero y Letra de su Asiento");
                        numeroAsiento=scanner.next();
                    if (acomuladorAsientos.contains(numeroAsiento)){
                        System.out.println("Ubicacion de asiento: "+ numeroAsiento);
                        System.out.println("precio: "+ valorEntrada);
                        System.out.println("Asiento Disponible");}
               
                     System.out.println("¿Quiere eliminar entrada? 1 si 2 no");
                     opcion2=scanner.nextInt();
                  switch(opcion2){
                      case 1-> {
                          System.out.println("acomulador asientos es: "+acomuladorAsientos);
                          resultado=acomuladorAsientos.replace(numeroAsiento,remplazo);
                          contadorEntradas-=1; 
                          System.out.println("hola "+resultado);
                          acomuladorPrecio-=precioFinal;
                      }
                  }   
                    }
                }
                    System.out.println("salir 1 no 2 si");
                salir=scanner.nextInt();
                if(salir ==2 && contadorEntradas==0){
                    contadorEntradas=1;
                
                } else{
                    contadorEntradas++;
                  }
        }while (opcion<1&& opcion>4 );
            
        }while (salir !=2);
        if (contadorEntradas >=5){
            acomuladorPrecio=acomuladorPrecio*0.80;}
        
         System.out.println("total entradas "+ contadorEntradas);
             
         System.out.println("Ubicacion De Su Asiento: " +resultado);
         System.out.println("Precio General: "+ valorEntrada);
         System.out.println("Precio Final es: "+ acomuladorPrecio);
        
    }
    
}
