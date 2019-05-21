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
public class MyLinkedList<E> {

    private MyListNode<E> head;
    private MyListNode<E> tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public MyListNode<E> getHead() {
        return head;
    }

    public MyListNode<E> getTail() {
        return tail;
    }

    public E get(int indice) {
        if (cantidad() > 0) {
            MyListNode nodo = this.head;
            for (int i = 0; i < indice; i++) {
                nodo = nodo.getNext();
            }
            return (E) nodo.getData();
        }
        return null;
    }
    
    public void agregar(E dato){
        añadirUltimo(dato);
    }

    public void insertarPosicion(int posicion, E data) {
        if (posicion <= cantidad() + 1) {
            MyListNode nuevoNodo = new MyListNode(data);
            if (posicion == 1) {
                nuevoNodo.next = head;
                if (head != null) {
                    head.setPrev(nuevoNodo);
                }
                head = nuevoNodo;
            } else {
                if (posicion == (cantidad() + 1)) {
                    MyListNode p = head;
                    while (p.getNext() != null) {
                        p = p.getNext();
                        p.setNext(nuevoNodo);
                        nuevoNodo.setPrev(p);
                        nuevoNodo.setNext(null);
                    }
                } else {
                    MyListNode p = head;
                    for (int i = 1; i <= posicion - 2; i++) {
                        p = p.getNext();
                    }
                    MyListNode siguiente = p.getNext();
                    p.setNext(nuevoNodo);
                    nuevoNodo.setPrev(p);
                    nuevoNodo.setNext(siguiente);
                    siguiente.setPrev(nuevoNodo);
                }
            }
        }

    }

    public void removerItem(int posicion) {
        if (posicion <= cantidad()) {
            if (posicion == 1) {
                head = head.getNext();
                if (head != null) {
                    head.setPrev(null);
                }
            } else {
                MyListNode p = head;
                for (int i = 1; i <= posicion - 2; i++) {
                    p = p.getNext();
                }
                MyListNode siguiente = p.getNext();
                siguiente = siguiente.getNext();
                p.setNext(siguiente);
                if (siguiente != null) {
                    siguiente.setPrev(p);
                }
            }
        }
    }

    public void insertarPrimero(E item) {
        MyListNode newFirst = new MyListNode(item);
        newFirst.setNext(head);
        if (head != null) {
            head.setPrev(newFirst);
        }
        head = newFirst;
    }

    public void eliminarPrimero() {
        head = head.getNext();
        if (head != null) {
            head.setPrev(null);
        }
    }

    public void añadirUltimo(E item) {
        MyListNode nuevoNodo = new MyListNode(item);
        if (head == null) {
            head = nuevoNodo;
        } else {
            MyListNode p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(nuevoNodo);
            nuevoNodo.setPrev(p);
            tail = nuevoNodo;
        }
    }

    public void eliminarUltimo() {
        MyListNode nuevo = tail.getPrev();
        tail = nuevo;
        tail.setNext(null);
    }

    public void mostrarElementosPrincipio() {
        MyListNode p = head;
        while (p != null) {
            System.out.println(p.getData());
            p = p.getNext();
        }
    }

    public void mostrarElementosFinal() {
        MyListNode p = tail;
        while (p != null) {
            System.out.println(p.getData());
            p = p.getPrev();
        }
    }

    public int cantidad() {
        int cant = 0;
        MyListNode reco = head;
        while (reco != null) {
            reco = reco.next;
            cant++;
        }
        return cant;
    }
}
