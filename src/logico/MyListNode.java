/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

/**
 *
 * @author Mauricio
 */
public class MyListNode<E> {
    MyListNode<E> next;
    MyListNode<E> prev;
    E data;
    
    public MyListNode(E theData){
        this.data = theData;
    }
    
    public E getData(){
        return data;
    }
    
    public MyListNode<E> getNext(){
        return next;
    }
    
    public MyListNode<E> getPrev(){
        return prev;
    }
    
    public void setData(E theData){
        data = theData;
    }
    
    public void setNext(MyListNode<E> newNext){
        next = newNext;
    }
    
    public void setPrev(MyListNode<E> newPrev){
        prev = newPrev;
    }
}
