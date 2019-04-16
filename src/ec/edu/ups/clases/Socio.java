/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 * @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public abstract class Socio extends Persona {
 private String tipo;
 private int codigoSocio;
 private String tiempoSocio;
 private Date fechaSocio;  

    
 public Socio() {
    }
 

    public Socio(String tipo, int codigoSocio, String tiempoSocio, Date fechaSocio) {
        this.tipo = tipo;
        this.codigoSocio = codigoSocio;
        this.tiempoSocio = tiempoSocio;
        this.fechaSocio = fechaSocio;
    }

    public Socio(String tipo, int codigoSocio, String tiempoSocio, Date fechaSocio, String nombre, String cargo) {
        super(nombre, cargo);
        this.tipo = tipo;
        this.codigoSocio = codigoSocio;
        this.tiempoSocio = tiempoSocio;
        this.fechaSocio = fechaSocio;
    }

    public Socio(String tipo, int codigoSocio, String tiempoSocio, Date fechaSocio, String nombre, String cargo, String Apellido, int edad) {
        super(nombre, cargo, Apellido, edad);
        this.tipo = tipo;
        this.codigoSocio = codigoSocio;
        this.tiempoSocio = tiempoSocio;
        this.fechaSocio = fechaSocio;
    }

    

 
    public String getTipo() {
        return tipo;
    }

    public int getCodigoSocio() {
        return codigoSocio;
    }

    public String getTiempoSocio() {
        return tiempoSocio;
    }

    public Date getFechaSocio() {
        return fechaSocio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCodigoSocio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public void setTiempoSocio(String tiempoSocio) {
        this.tiempoSocio = tiempoSocio;
    }

    public void setFechaSocio(Date fechaSocio) {
        this.fechaSocio = fechaSocio;
    }

    @Override
    public String toString() {
        return super.toString()+"Socio{" + "tipo=" + tipo + ", codigoSocio=" + codigoSocio + ", tiempoSocio=" + tiempoSocio + ", fechaSocio=" + fechaSocio + '}';
    }
 
  public abstract String cuentas();
}
