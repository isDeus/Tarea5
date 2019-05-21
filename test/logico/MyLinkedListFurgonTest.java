/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Assert;

/**
 *
 * @author Mauricio
 */
public class MyLinkedListFurgonTest {

    private ArrayList<Furgon> furgones;

    public MyLinkedListFurgonTest() {
        GestorFurgon gestion = new GestorFurgon();
        this.furgones = gestion.getFurgones();
    }

    @Test
    public void testAgregarInicio() {
        MyLinkedList lista = new MyLinkedList();
        lista.insertarPrimero(this.furgones.get(0));
        Assert.assertEquals(this.furgones.get(0), lista.get(0));
    }

    @Test
    public void testAgregarFinal() {
        MyLinkedList lista = new MyLinkedList();
        lista.insertarPrimero(this.furgones.get(0));
        lista.añadirUltimo(this.furgones.get(this.furgones.size() -1));
        int size = lista.cantidad();
        Assert.assertEquals(this.furgones.get(this.furgones.size() -1), lista.get(size-1));
    }

}
