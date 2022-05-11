/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila.Lineal;

/**
 *
 * @author Ruldin
 */
public class PilaLineal {
    
    private static final int TAMPILA = 40;
    private int cima;
    private Object[] listaPila;
    
    
    public PilaLineal(){
        cima = -1;
        listaPila = new Object[TAMPILA];
    }
    
    // Operaciones que modifican la pila (PUSH)
    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()){
            throw new Exception("StackOverFlow se lleno");
        }
        cima++;
        listaPila[cima] = elemento;
    }
    
    
    //Desapilar, quitar, POP elemento de la pila
    
    public Object quitar() throws Exception {
        Integer aux;
        
        if (pilaVacia()){
             throw new Exception("underflow la pila vacia esta");
        }
        
        // guardar el elemeno de la cima
        aux = (Integer) listaPila[cima];
        
        //decrementar cima y retornar el elemento
        cima --;
        return aux;
    }
    
    
    //limpiar la pila
    public void limpiarPila() throws Exception {
        cima = -1;
    }
    
    // metodo para acceso a la cima de la pila
    public Object cimaPila() throws Exception{
        if (pilaVacia()){
            throw new Exception ("pila Vacia, no se puede");
        }
        
        return listaPila[cima];
    }
    
    
    
    //verifica estao de la pila
    public boolean pilaVacia(){
        return cima == -1;
    }
    
    
    //verificar si esta llena
    public boolean pilaLlena(){
        return cima == TAMPILA - 1;
    }
    
    
    
    
    
}
