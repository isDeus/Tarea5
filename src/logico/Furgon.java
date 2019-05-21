/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import java.util.Date;

/**
 *
 * @author Mauricio
 */
public class Furgon {
    private String numeroPatente, marca,numeroProblemas,kmActual, kmUltimaMantencion;
    private int numeroChasis, ejes;
    private Date fechaCompra, fechaUltimaMantencion, fechaUltimoProblema;

    public Furgon(String nPatente, int nChasis, int ejes, String marca, String kmActual, String kmUltimaMantencion, Date fechaCompra, Date fechaUltimaMantencion, Date fechaUltimoProblema, String nProblemas) {
        this.numeroPatente = nPatente;
        this.numeroChasis = nChasis;
        this.ejes = ejes;
        this.marca = marca;
        this.kmActual = kmActual;
        this.kmUltimaMantencion = kmUltimaMantencion;
        this.fechaCompra = fechaCompra;
        this.fechaUltimaMantencion = fechaUltimaMantencion;
        this.fechaUltimoProblema = fechaUltimoProblema;
        this.numeroProblemas = nProblemas;

    }

    public String getNumeroPatente() {
        return numeroPatente;
    }

    public void setNumeroPatente(String numeroPatente) {
        this.numeroPatente = numeroPatente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public String getKmActual() {
        return kmActual;
    }

    public void setKmActual(String kmActual) {
        this.kmActual = kmActual;
    }

    public String getKmUltimaMantencion() {
        return kmUltimaMantencion;
    }

    public void setKmUltimaMantencion(String kmUltimaMantencion) {
        this.kmUltimaMantencion = kmUltimaMantencion;
    }

    public String getNumeroProblemas() {
        return numeroProblemas;
    }

    public void setNumeroProblemas(String numeroProblemas) {
        this.numeroProblemas = numeroProblemas;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaUltimaMantencion() {
        return fechaUltimaMantencion;
    }

    public void setFechaUltimaMantencion(Date fechaUltimaMantencion) {
        this.fechaUltimaMantencion = fechaUltimaMantencion;
    }

    public Date getFechaUltimoProblema() {
        return fechaUltimoProblema;
    }

    public void setFechaUltimoProblema(Date fechaUltimoProblema) {
        this.fechaUltimoProblema = fechaUltimoProblema;
    }
}
