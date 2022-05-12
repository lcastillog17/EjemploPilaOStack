/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.ejemplopilaostack;

import Pila.ArrayList.PilaArrayList;
import Pila.Lineal.PilaLineal;
import Pila.ListaEnlazada.PilaLista;
import Pila.Vector.PilaVector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author linda
 */
public class Pila {

    static void ejemplo() {
        // Creating an empty Stack
        Stack<Integer> MiPila = new Stack<Integer>();

// Use add() method agrega elementos
        MiPila.push(10);
        MiPila.push(15);
        MiPila.push(30);
        MiPila.push(20);
        MiPila.push(5);

// Desplegando el stack
        System.out.println("Pila Inicial: " + MiPila);

// Quitando elements using pop() method
        System.out.println("Elemendo desapilado: "
                + MiPila.pop());
        System.out.println("Elemendo desapilado: "
                + MiPila.pop());

// Desplegando la pila despues de la operacion POP
        System.out.println("Stack after pop operation "
                + MiPila);
    }

    static void ejercicioPilasLineal() {
        PilaLineal pila;
        int x;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Teclee los elementos termina con -1");

        try {
            pila = new PilaLineal();
            do {
                x = Integer.parseInt(entrada.readLine());
            } while (x != CLAVE);
            System.out.println("Elementos en la pila: ");

            while (!pila.pilaVacia()) {
                x = (Integer) (pila.quitar());
                System.out.println("x" + " ");
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }

    }
    
    static void ListaEnlazada(){
        PilaLista pila= new PilaLista();
       String m;
        try {
            do{
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingrese un valor");
                 Double d;
                 d = Double.valueOf(entrada.readLine());
                 pila.insertar(d);  
                  System.out.println("Si desea terminar de ingresar n y si desea seguir presione cualquier letra: ");
                  m=entrada.readLine();
            }while (!m.equalsIgnoreCase("n"));
            
            System.out.println("Elementos de la Pila: ");
            while (!pila.pilaVacia()) {
                Double d;
                d = (Double) pila.quitar();
                if (d.doubleValue() > 0.0) {
                    System.out.print(d + " ");
                }
            }
 
        } catch (Exception e) {
             System.out.println("Error: " + e);
        }
    }
    
    static void vectores() {
        PilaVector pila = new PilaVector();
        int x;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Teclea número de elementos: ");
        try {
            x = Integer.parseInt(entrada.readLine());
            for (int j = 1; j <= x; j++) {
                Double d;
                d = Double.valueOf(entrada.readLine());
                pila.insertar(d);
            }
            // vaciado de la pila
            System.out.println("Elementos de la Pila: ");
            while (!pila.pilaVacia()) {
                Double d;
                d = (Double) pila.quitar();
                if (d.doubleValue() > 0.0) {
                    System.out.print(d + " ");
                }
            }
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }
    
    static void ArrayList() throws IOException{
        PilaArrayList pila = new PilaArrayList();
        String m;
        try {
            do{
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingrese un valor");
                 Double d;
                 d = Double.valueOf(entrada.readLine());
                 pila.insertar(d);  
                  System.out.println("Si desea terminar de ingresar n y si desea seguir presione cualquier letra: ");
                  m=entrada.readLine();
            }while (!m.equalsIgnoreCase("n"));
            
            
            System.out.println("Elementos de la Pila: ");
            while (!pila.pilaVacia()) {
                Double d;
                d = (Double) pila.quitarElemento();
                if (d.doubleValue() > 0.0) {
                    System.out.print(d + " ");
                }
            }
 
        } catch (Exception e) {
            System.err.println("Excepcion: " + e);
        }
    }

    public static void main(String args[]) throws IOException {
        //ArrayList();
        ListaEnlazada();
    }
}
