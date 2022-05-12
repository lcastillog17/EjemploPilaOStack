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
public class NodoPila {

    Object elemento;
    NodoPila siguiente;

    NodoPila(Object x) {
        elemento = x;
        siguiente = null;
    }
}
