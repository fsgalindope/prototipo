/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.list;

/**
 *
 * @author FABIa
 */
public class ListGeneric<T>{
    private Node<T> front;
    private int tamaño;
    
    public ListGeneric(){
        tamaño=0;
        front=null;
    }
    public void insertar(T data){
        Node<T> newn = new Node <T>(data);
        
        newn.setNext(front);
        front=newn;
        tamaño++;
        
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

  

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Node<T> getFront() {
        return front;
    }
    public void remove(){
        while (tamaño!=1){
        tamaño--;
        front=front.getNext();
        }
    }

 
 
    
    
}
