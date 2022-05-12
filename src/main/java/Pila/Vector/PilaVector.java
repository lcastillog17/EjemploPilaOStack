/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila.Vector;

import java.util.Vector;

/**
 *
 * @author linda
 */
public class PilaVector {
//private static final int INICIAL = 19;

    private int cima;
    private Vector listaPila;

    public PilaVector() {
        cima = -1;
        listaPila = new Vector();

    }

    public void insertar(Object elemento) throws Exception {
        cima++;
        listaPila.addElement(elemento);
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("pila vacia");
        }
        //el elementAt devuelve el elemento del indice que enviamos
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }

// metodo para acceso a la cima de la pila
    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("pila Vacia, no se puede");
        }

        return listaPila.elementAt(cima);
    }

//verifica estao de la pila
    public boolean pilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitar();
        }
    }

}
