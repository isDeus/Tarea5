/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorDato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Mauricio
 */
public class Lector {

    private ArrayList<String[]> datos;

    public Lector() {
        this.datos = new ArrayList<>();
        leerDatos();
    }

    private void leerDatos() {
        try {
            String cadena;
            FileReader fr = new FileReader("datos.csv");
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            while ((cadena = br.readLine()) != null) {
                String[] datos = cadena.split(";");
                this.datos.add(datos);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
    public ArrayList getDatos(){
        return this.datos;
    }
}
