/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.cotrolador.controladorDelantero;

import ec.edu.ups.clases.Delantero;
import ec.edu.ups.clases.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorDelantero {
    private int contador=0;
    private List<Delantero> lista;

    public ControladorDelantero( ) {
       
        lista = new ArrayList<>();
    }
    
    public void create(Delantero objeto){
        lista.set(contador, objeto);
        contador = contador+1;
       // lista.add(objeto);
    }
    
    public Delantero read(int codigo){
        for (Delantero delantero : lista) {
            if(delantero.getCodigoJgador() == codigo){
                return delantero;
            }
        }
        return null;
    }
    
    public void update(Delantero objeto){
        for (int i = 0; i < lista.size(); i++) {
            Delantero elemento = lista.get(i);
            if(elemento.getCodigoJgador() == objeto.getCodigoJgador()){
                lista.set(i, objeto);
                break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Delantero elemento = lista.get(i);
            if(elemento.getCodigoJgador() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }   
}

