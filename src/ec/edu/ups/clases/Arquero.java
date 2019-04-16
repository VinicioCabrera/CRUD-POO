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
public final class Arquero extends Jugador implements Interfaz{
private int porcentajeTapadas;
private int saqueArco;
private int GuantesColocados;
private double longitudDeMano;

    public Arquero(int porcentajeTapadas, int saqueArco, int GuantesColocados, double longitudDeMano, int codigoJgador, String cedula, Date fechaContratacion, String Posicion) {
        super(codigoJgador, cedula, fechaContratacion, Posicion);
        this.porcentajeTapadas = porcentajeTapadas;
        this.saqueArco = saqueArco;
        this.GuantesColocados = GuantesColocados;
        this.longitudDeMano = longitudDeMano;
    }

    public Arquero(int porcentajeTapadas, int saqueArco, int GuantesColocados, double longitudDeMano, int codigoJgador, String cedula, Date fechaContratacion, String Posicion, String nombre, String cargo) {
        super(codigoJgador, cedula, fechaContratacion, Posicion, nombre, cargo);
        this.porcentajeTapadas = porcentajeTapadas;
        this.saqueArco = saqueArco;
        this.GuantesColocados = GuantesColocados;
        this.longitudDeMano = longitudDeMano;
    }

    public Arquero(int porcentajeTapadas, int saqueArco, int GuantesColocados, double longitudDeMano, int codigoJgador, String cedula, Date fechaContratacion, String Posicion, String nombre, String cargo, String Apellido, int edad) {
        super(codigoJgador, cedula, fechaContratacion, Posicion, nombre, cargo, Apellido, edad);
        this.porcentajeTapadas = porcentajeTapadas;
        this.saqueArco = saqueArco;
        this.GuantesColocados = GuantesColocados;
        this.longitudDeMano = longitudDeMano;
    }

  

    public int getPorcentajeTapadas() {
        return porcentajeTapadas;
    }

    public int getSaqueArco() {
        return saqueArco;
    }

    public int getGuantesColocados() {
        return GuantesColocados;
    }

    public double getLongitudDeMano() {
        return longitudDeMano;
    }

    public void setPorcentajeTapadas(int porcentajeTapadas) {
        this.porcentajeTapadas = porcentajeTapadas;
    }

    public void setSaqueArco(int saqueArco) {
        this.saqueArco = saqueArco;
    }

    public void setGuantesColocados(int GuantesColocados) {
        this.GuantesColocados = GuantesColocados;
    }

    public void setLongitudDeMano(double longitudDeMano) {
        this.longitudDeMano = longitudDeMano;
    }

    @Override
    public String toString() {
        return super.toString()+ "Arquero{" + "porcentajeTapadas=" + porcentajeTapadas + ", saqueArco=" + saqueArco + ", GuantesColocados=" + GuantesColocados + ", longitudDeMano=" + longitudDeMano + '}';
    }

    @Override
    public String estadio() {
        return "Acientos disponibles";
    }

    @Override
    public String bolones() {
        return "Balones usados";
    }

    @Override
    public String goles() {
    return "Cantidad de tapadas";
    }

}
