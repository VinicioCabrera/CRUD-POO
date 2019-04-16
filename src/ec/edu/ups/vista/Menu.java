/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Delantero;
import ec.edu.ups.cotrolador.controladorDelantero.ControladorDelantero;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Menu {
        public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int Menu = 0;
        int MenuDelantero = 0;
        int MenuArquero = 0;
        int MenuAuspisiante = 0;
        int MenuAbonado = 0;
        
        ControladorDelantero controladorDelantero = new ControladorDelantero();
        
        do{
                    
            System.out.println("-----MENU PRINCIPAL-----");
            System.out.println("1. CRUD Delantero");
            System.out.println("2. CRUD Arquero");
            System.out.println("3. CRUD Auspiciante");
            System.out.println("4. CRUD Abonado");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            Menu = entrada.nextInt();
            
            switch(Menu){
                case 1: 
                    //opcion para el crud aire acondicionado
                    do{
                        System.out.println("----MENU Delantero----");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        MenuDelantero = entrada.nextInt();
                        
                        switch(MenuDelantero){
                            case 1:
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                            String cedu,posi,nom,car,ape;
                            int porTar,saAr,guCo,codiJuga,edad;
                            double longMa;
                            Date feCon;
                            
                            
                            System.out.print("Ingrese Porcentaje targetas: ");
                            porTar=entrada.nextInt();
                            System.out.print("ingrese Saques de arco: ");
                            saAr=entrada.nextInt();
                            System.out.print("ingersar Guantes colocados: ");
                            guCo=entrada.nextInt();
                            System.out.print("Ingresar longitud de la mano ");
                            longMa=entrada.nextDouble();
                            System.out.print("Ingresar Codigo Jugador: ");
                            codiJuga=entrada.nextInt();
                            System.out.print("Ingresar Cedula ");
                            cedu=entrada.next();
                     
                            System.out.println("Fecha: ");
                            
                            GregorianCalendar fecha=new GregorianCalendar(2009, 5, 2);
                            feCon=fecha.getGregorianChange();
                            System.out.print("Ingresar posicion:");
                            posi=entrada.next();
                            System.out.print("Ingresar Nombre:");
                            nom=entrada.next();
                            System.out.print("Ingresar Cargo: ");
                            car=entrada.next();
                            System.out.print("Ingresar Apellido ");
                            ape=entrada.next();
                            System.out.print("Ingresar Edad ");
                            edad=entrada.nextInt();
                            
                            Delantero dela=new Delantero(porTar, saAr, MenuAbonado, longMa, codiJuga, cedu, feCon, posi, nom, car, ape, edad);
                            controladorDelantero.create(dela);
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                            System.out.println("Ingrese el codigo Jugador: ");
                            codiJuga=entrada.nextInt();
                            System.out.println("Datos Jugador:\n"+controladorDelantero.read(codiJuga));
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                          
                            System.out.print("Ingrese Porcentaje targetas: ");
                            porTar=entrada.nextInt();
                            System.out.print("ingrese Saques de arco: ");
                            saAr=entrada.nextInt();
                            System.out.print("ingersar Guantes colocados: ");
                            guCo=entrada.nextInt();
                            System.out.print("Ingresar longitud de la mano ");
                            longMa=entrada.nextDouble();
                            System.out.print("Ingresar Codigo Jugador: ");
                            codiJuga=entrada.nextInt();
                            System.out.print("Ingresar Cedula ");
                            cedu=entrada.next();
                     
                            System.out.print("Fecha: ");
                            GregorianCalendar fecha2=new GregorianCalendar(2010, 0, 1);
                            feCon=fecha2.getGregorianChange();
                            
                            System.out.print("Ingresar posicion:");
                            posi=entrada.next();
                            System.out.print("Ingresar Nombre:");
                            nom=entrada.next();
                            System.out.print("Ingresar Cargo: ");
                            car=entrada.next();
                            System.out.print("Ingresar Apellido ");
                            ape=entrada.next();
                            System.out.print("Ingresar Edad ");
                            edad=entrada.nextInt();
                            
                            Delantero delantero=new Delantero(porTar, saAr, MenuAbonado, longMa, codiJuga, cedu, feCon, posi, nom, car, ape, edad);
                            controladorDelantero.update(delantero);
                            break;
                                
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                            System.out.println("ingrese el codigo a verificar: ");
                            codiJuga=entrada.nextInt();
                            controladorDelantero.delete(codiJuga);
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(MenuDelantero !=5);
                    break;
                case 2:
                    //opcion para el crud de refrigerador
                    do{
                     
                     MenuDelantero=entrada.nextInt();
               
                    }while(MenuArquero !=5);
                    break;
                case 3:
                    //opcion para el crud de computador
                    do{
                     MenuDelantero=entrada.nextInt();   
                    }while(MenuAuspisiante !=5);
                    break;
                case 4:
                    //opcion para el crud de televisor
                    do{
                     MenuDelantero=entrada.nextInt();   
                    }while(MenuAbonado !=5);
                    break;
                case 5:
                    //opcion para salir
                    System.out.println("Fin...!!!");
                    break;
            }
        }while(Menu != 5);
    }
}

