/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila.ArrayLista;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class PilaArrayList {
    
    private ArrayList<Integer> stackDemo;
    
    //crear la pila 
    public PilaArrayList(){
        
        stackDemo = new ArrayList<Integer>();
        
    }
    
    public void Push(Integer N){
        
        stackDemo.add(N);
        
    }
    
    //para borrar
    public Integer pop(){
        
        if(stackDemo.size()==0){
            throw new IllegalStateException("La pila esta vacia");
        }
        return stackDemo.remove(stackDemo.size() - 1);
    }
    
    public Integer peek(){
        
        if(stackDemo.size()==0){
            throw new IllegalStateException("Pila vacia");
        }
        return stackDemo.get(stackDemo.size() - 1);
    }
    
    //implementar vacio
    public boolean isEmpty(){
        
        return (stackDemo.size()==0);
        
    }
    
    //metodo para size
    public int size(){
        
        return stackDemo.size();
        
    }
    
    //pasar a string
    @Override
    public String toString(){
        
        return ""+stackDemo.toString();
        
    }
    
}
