/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;
import java.util.Date;

/**
* @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public final class Auspisiante extends Socio implements Interfaz{
private int codigo;
private String nombreAuspiciante;
private double aportacion;
private String materiaDeportivo; 

    public Auspisiante(int codigo, String nombreAuspiciante, double aportacion, String materiaDeportivo, String tipo, int codigoSocio, String tiempoSocio, Date fechaSocio) {
        super(tipo, codigoSocio, tiempoSocio, fechaSocio);
        this.codigo = codigo;
        this.nombreAuspiciante = nombreAuspiciante;
        this.aportacion = aportacion;
        this.materiaDeportivo = materiaDeportivo;
    }

    public Auspisiante(int codigo, String nombreAuspiciante, double aportacion, String materiaDeportivo, String tipo,int codigoSocio, String tiempoSocio, Date fechaSocio, String nombre, String cargo) {
        super(tipo, codigoSocio, tiempoSocio, fechaSocio, nombre, cargo);
        this.codigo = codigo;
        this.nombreAuspiciante = nombreAuspiciante;
        this.aportacion = aportacion;
        this.materiaDeportivo = materiaDeportivo;
    }

    public Auspisiante(int codigo, String nombreAuspiciante, double aportacion, String materiaDeportivo, String tipo, int codigoSocio, String tiempoSocio, Date fechaSocio, String nombre, String cargo, String Apellido, int edad) {
        super(tipo, codigoSocio, tiempoSocio, fechaSocio, nombre, cargo, Apellido, edad);
        this.codigo = codigo;
        this.nombreAuspiciante = nombreAuspiciante;
        this.aportacion = aportacion;
        this.materiaDeportivo = materiaDeportivo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreAuspiciante() {
        return nombreAuspiciante;
    }

    public double getAportacion() {
        return aportacion;
    }

    public String getMateriaDeportivo() {
        return materiaDeportivo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombreAuspiciante) {
        this.nombreAuspiciante = nombreAuspiciante;
    }

    public void setAportacion(double aportacion) {
        this.aportacion = aportacion;
    }

    public void setMateriaDeportivo(String materiaDeportivo) {
        this.materiaDeportivo = materiaDeportivo;
    }

    @Override
    public String toString() {
        return super.toString()+"Auspisiante{" + "codigo=" + codigo + ", nombreAuspiciante=" + nombreAuspiciante + ", aportacion=" + aportacion + ", materiaDeportivo=" + materiaDeportivo + '}';
    }

    @Override
    public String estadio() {
        return "Nombre estadio";
    }

    @Override
    public String bolones() {
       return "Nombre balones" ;
    }

    @Override
    public String cuentas() {
        return "Gastos";
    }

}
