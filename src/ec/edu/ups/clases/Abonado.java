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
public final class Abonado extends Socio implements Interfaz {
private int codigoAbonado;
private double costo;
private int NumeroAbono;
private Date fechaAbono;

    public Abonado(int codigoAbonado, double costo, int NumeroAbono, Date fechaAbono, String tipo, int codigoSocio, String tiempoSocio, Date fechaSocio) {
        super(tipo, codigoSocio, tiempoSocio, fechaSocio);
        this.codigoAbonado = codigoAbonado;
        this.costo = costo;
        this.NumeroAbono = NumeroAbono;
        this.fechaAbono = fechaAbono;
    }

    public Abonado(int codigoAbonado, double costo, int NumeroAbono, Date fechaAbono, String tipo, int codigoSocio, String tiempoSocio, Date fechaSocio, String nombre, String cargo) {
        super(tipo, codigoSocio, tiempoSocio, fechaSocio, nombre, cargo);
        this.codigoAbonado = codigoAbonado;
        this.costo = costo;
        this.NumeroAbono = NumeroAbono;
        this.fechaAbono = fechaAbono;
    }

    public Abonado(int codigoAbonado, double costo, int NumeroAbono, Date fechaAbono, String tipo, int codigoSocio, String tiempoSocio, Date fechaSocio, String nombre, String cargo, String Apellido, int edad) {
        super(tipo, codigoSocio, tiempoSocio, fechaSocio, nombre, cargo, Apellido, edad);
        this.codigoAbonado = codigoAbonado;
        this.costo = costo;
        this.NumeroAbono = NumeroAbono;
        this.fechaAbono = fechaAbono;
    }



    public int getCodigoAbonado() {
        return codigoAbonado;
    }

    public double getCosto() {
        return costo;
    }

    public int getNumeroAbono() {
        return NumeroAbono;
    }

    public Date getFechaAbono() {
        return fechaAbono;
    }

    public void setCodigoAbonado(int codigoAbonado) {
        this.codigoAbonado = codigoAbonado;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setNumeroAbono(int NumeroAbono) {
        this.NumeroAbono = NumeroAbono;
    }

    public void setFechaAbono(Date fechaAbono) {
        this.fechaAbono = fechaAbono;
    }

    @Override
    public String toString() {
        return super.toString()+"Abonado{" + "codigoAbonado=" + codigoAbonado + ", costo=" + costo + ", NumeroAbono=" + NumeroAbono + ", fechaAbono=" + fechaAbono + '}';
    }

    @Override
    public String estadio() {
    return "Capacidad del Estadio"; 
    }

    @Override
    public String bolones() {
     return "Cantidad de balones";   
    }

    @Override
    public String cuentas() {
        return "Ganancias";
    }
 
}
