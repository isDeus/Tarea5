/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import gestorDato.Lector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Mauricio
 */
public class GestorFurgon {

    private ArrayList<Furgon> furgones;
    private ArrayList<String[]> datosFurgones;

    public GestorFurgon() {
        Lector lector = new Lector();
        this.datosFurgones = lector.getDatos();
        this.furgones = new ArrayList<Furgon>();
        ingresarFurgones();

    }

    private void ingresarFurgones() {
        for (int i = 0; i < this.datosFurgones.size(); i++) {
            String nPatente = this.datosFurgones.get(i)[0];
            int nChasis = Integer.parseInt(this.datosFurgones.get(i)[1]);
            int ejes = Integer.parseInt(this.datosFurgones.get(i)[2]);
            String marca = this.datosFurgones.get(i)[3];
            String kmActual = this.datosFurgones.get(i)[4];
            String kmUltimaRevision = this.datosFurgones.get(i)[5];
            Date fechaCompra = this.stringToDate(this.datosFurgones.get(i)[6]);
            Date fechaUltimaMantencion = this.stringToDate(this.datosFurgones.get(i)[7]);
            Date fechaUltimoProblema = this.stringToDate(this.datosFurgones.get(i)[8]);
            String nProblemas = this.datosFurgones.get(i)[9];
            this.furgones.add(new Furgon(nPatente, nChasis, ejes, marca, kmActual, kmUltimaRevision, fechaCompra, fechaUltimaMantencion, fechaUltimoProblema, nProblemas));

        }
    }

    public ArrayList<Furgon> getFurgones() {
        return furgones;
    }

    private Date stringToDate(String fecha) {
        String[] datosFecha = fecha.split("-");
        int[] fechas = {Integer.parseInt(datosFecha[0]), Integer.parseInt(datosFecha[1]), Integer.parseInt(datosFecha[2])};
        Date datoFecha = new Date(fechas[0] - 1900, fechas[1] - 1, fechas[2]);
        return datoFecha;
    }

    public ArrayList obtenerFurgonesConMantenimiento() {
        Comparator<Furgon> kmFurgon = (furgon1, furgon2) -> furgon1.getKmActual().compareTo(furgon2.getKmActual());
        Comparator<Furgon> mantencionFurgon = kmFurgon.thenComparing((furgon1, furgon2) -> furgon2.getFechaUltimaMantencion().compareTo(furgon1.getFechaUltimaMantencion()));
        ArrayList<Furgon> furgones = this.furgones;
        Collections.sort(furgones, mantencionFurgon);
        return furgones;
    }

    public ArrayList obtenerFurgonesSinMantenimiento() {
        Comparator<Furgon> kmFurgon = (furgon1, furgon2) -> furgon1.getKmActual().compareTo(furgon2.getKmActual());
        Comparator<Furgon> mantencionFurgon = kmFurgon.thenComparing((furgon1, furgon2) -> furgon1.getFechaUltimaMantencion().compareTo(furgon2.getFechaUltimaMantencion()));
        ArrayList<Furgon> furgones = this.furgones;
        Collections.sort(furgones, mantencionFurgon);
        return furgones;
    }

    public ArrayList obtenerMarcaFechaCompra() {
        Comparator<Furgon> marcaFurgon = (furgon1, furgon2) -> furgon1.getMarca().compareTo(furgon2.getMarca());
        Comparator<Furgon> añoFurgon = marcaFurgon.thenComparing((furgon1, furgon2) -> furgon1.getFechaCompra().compareTo(furgon2.getFechaCompra()));
        ArrayList<Furgon> furgones = this.furgones;
        Collections.sort(furgones, añoFurgon);
        return furgones;
    }

    public ArrayList encontrarPatentes(char primerDigito) {
        ArrayList<Furgon> furgones = new ArrayList<Furgon>();
        for (int i = 0; i < this.furgones.size(); i++) {
            if (this.furgones.get(i).getNumeroPatente().charAt(0) == primerDigito) {
                furgones.add(this.furgones.get(i));
            }
        }
        Comparator<Furgon> patenteFurgon = (furgon1, furgon2) -> furgon2.getNumeroPatente().compareTo(furgon1.getNumeroPatente());
        Collections.sort(furgones, patenteFurgon);
        return furgones;
    }

    public ArrayList obtenerVehiculosProblemas() {
        Comparator<Furgon> furgonProblemas = (furgon1, furgon2) -> furgon2.getNumeroProblemas().compareTo(furgon1.getNumeroProblemas());
        Comparator<Furgon> furgonAño = furgonProblemas.thenComparing((furgon1, furgon2) -> furgon2.getFechaUltimoProblema().compareTo(furgon1.getFechaUltimoProblema()));
        Collections.sort(this.furgones, furgonAño);
        ArrayList<Furgon> furgones = new ArrayList<Furgon>();
        for (int i = 0; i < 10; i++) {
            furgones.add(this.furgones.get(i));
        }
        return furgones;
    }
}
