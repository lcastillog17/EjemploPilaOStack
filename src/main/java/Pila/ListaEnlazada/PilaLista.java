/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila.ListaEnlazada;

/**
 *
 * @author linda
 */
public class PilaLista {

    private NodoPila cima;

    public PilaLista() {
        cima = null;
    }

    public boolean pilaVacia() {
        return cima == null;
    }

    public void insertar(Object elemento) {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Object quitar() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede leer cima.");
        }
        return cima.elemento;
    }

    public void limpiarPila() {
        NodoPila t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
}
