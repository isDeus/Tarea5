/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mauricio
 */
public class MyLinkedListTest {

    public MyLinkedList<Integer> listaPrueba;

    public MyLinkedListTest() {
        listaPrueba = new MyLinkedList();  
        listaPrueba.insertarPrimero(1);
        listaPrueba.añadirUltimo(10);
    }

    /**
     * Test of getHead method, of class MyLinkedList.
     */
    @Test
    public void testGetHead() {
        Assert.assertEquals(1, listaPrueba.getHead().getData(), 0);
    }

    /**
     * Test of getTail method, of class MyLinkedList.
     */
    @Test
    public void testGetTail() {
        Assert.assertEquals(10, listaPrueba.getTail().getData(), 0);
    }
    
    @Test
    public void testAgregar(){
        int dato = 5;
        listaPrueba.agregar(dato);
        Assert.assertEquals(dato, listaPrueba.getTail().getData(), 0);
    }
    
    @Test
    public void testGet(){
        int dato = listaPrueba.get(1);
        Assert.assertEquals(dato, 10, 0);
    }

    /**
     * Test of insertarPosicion method, of class MyLinkedList.
     */
    @Test
    public void testInsertarPosicion() {
        int data = 2;
        listaPrueba.insertarPosicion(2, data);
        Assert.assertEquals(2, listaPrueba.getHead().getNext().getData(), 0);
    }

    /**
     * Test of removerItem method, of class MyLinkedList.
     */
    @Test
    public void testRemoverItem() {
        listaPrueba.insertarPosicion(2, 10);
        int cantidad = listaPrueba.cantidad();
        listaPrueba.removerItem(2);
        int cantidad2 = listaPrueba.cantidad();
        Assert.assertNotSame(cantidad, cantidad2);
    }

    /**
     * Test of insertarPrimero method, of class MyLinkedList.
     */
    @Test
    public void testInsertarPrimero() {
        int data = 5;
        listaPrueba.insertarPrimero(data);
        MyListNode<Integer> nodoPrimero = listaPrueba.getHead();
        Assert.assertEquals(data, nodoPrimero.getData(), 0);
    }

    /**
     * Test of eliminarPrimero method, of class MyLinkedList.
     */
    @Test
    public void testEliminarPrimero() {
        listaPrueba.eliminarPrimero();
        Assert.assertEquals(10, listaPrueba.getHead().getData(), 0);
    }

    /**
     * Test of añadirUltimo method, of class MyLinkedList.
     */
    @Test
    public void testAñadirUltimo() {
        int data = 10;
        listaPrueba.añadirUltimo(data);
        Assert.assertEquals(10, listaPrueba.getTail().getData(), 0);
    }

    /**
     * Test of eliminarUltimo method, of class MyLinkedList.
     */
    @Test
    public void testEliminarUltimo() {
        int data = 10;
        listaPrueba.añadirUltimo(data);
        listaPrueba.eliminarUltimo();
        Assert.assertEquals(10, listaPrueba.getTail().getData(), 0);
    }

    /**
     * Test of mostrarElementosPrincipio method, of class MyLinkedList.
     */
    @Test
    public void testMostrarElementosPrincipio() {

    }

    /**
     * Test of mostrarElementosFinal method, of class MyLinkedList.
     */
    @Test
    public void testMostrarElementosFinal() {

    }

}
