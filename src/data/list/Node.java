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
public class Node<T>{
    private T data;
    private Node<T> next;
    
    public Node(){
        this(null);
    
    }
    public Node(T data){
        this.data=data;
        next=null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    
}
