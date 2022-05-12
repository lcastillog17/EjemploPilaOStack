/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila.Lineal;

/**
 *
 * @author linda
 */
public class PilaLineal {
    private static final int TAMPILA=40;
   private int cima;
   private Object[] listaPila;
   
   public PilaLineal(){
   cima=-1;
   listaPila=new Object[TAMPILA];
   }
   
   //operaciones que modifican la pila
   public void insertar(Object elemento)throws Exception{
   if (pilaLlena()){
   throw new Exception("StackOverFlow se lleno");
   }
   cima++;
   listaPila[cima]=elemento;
   }
   
   //
   public Object quitar() throws Exception{
   Integer aux;
   
   if (pilaVacia()){
          throw new Exception("Pila vacia no se puede sacar ");
   }
   //guardar el elemento de la clase
   aux=(Integer)listaPila[cima];
   
   //decrementar cima y retornar elemento
   cima --;
   return aux;         
   }
   
   //limpiar la pila
   public void limpiarPila() throws Exception{
   cima=-1;
   }
   
   //metodo para acceso a la cima pila
   public Object cimaPila() throws Exception{
   if (pilaVacia()){
   throw new Exception ("pila vacia, no se puede");
   }
   return listaPila[cima];
   }
   
    public boolean pilaVacia() {
        return cima == -1;
    }
    
    public boolean pilaLlena() {
        return cima == TAMPILA - 1;
    }
}
