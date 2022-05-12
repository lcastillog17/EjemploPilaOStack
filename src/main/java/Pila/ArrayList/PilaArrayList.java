/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author linda
 */
public class PilaArrayList {

    private int cima;
    private ArrayList ArrayListPila;

    public PilaArrayList() {
        cima = -1;
        ArrayListPila = new ArrayList();
    }

    public void insertar(Object elemento) throws Exception {
        cima++;
        ArrayListPila.add(elemento);
    }

    public Object quitarElemento() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("La pila está vacía");
        }
        aux=ArrayListPila.get(cima);
        ArrayListPila.remove(cima);
        cima--;
        
        return aux;
    }
    
    public Object cimaPila()throws Exception{
        if (pilaVacia()) {
            throw new Exception("La pila está vacía");
        }
        return ArrayListPila.get(cima);
    }

   public void limpiarPila() throws Exception{
       if (pilaVacia()) {
           throw new Exception("La pila está vacía");
       }
       while (!pilaVacia()) {
           quitarElemento();
       }
 
   }
   
   
    public boolean pilaVacia() {
        return cima == -1;
    }
    
    
}
