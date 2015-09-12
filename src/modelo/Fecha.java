/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author yesid caicedo
 */
public class Fecha {

    private int dia;

    private int mes;

    private int anio;
    
    private String fechaCompleta;

    public Fecha() {
    }
    
    public Fecha(String unaFecha){
        fechaCompleta = unaFecha;
    }

    public Fecha(int unDia, int unMes, int unAnio) {
        this.dia = unDia;
        this.mes = unMes;
        this.anio = unAnio;
    }
    
    public void cambiarFecha(String unaFecha){
        fechaCompleta = unaFecha;
    }
    
    public String darFechaCompleta(){
        return fechaCompleta;
    }

    public int darDia() {
        return dia;
    }

    public int darMes() {
        return mes;
    }
    
    public int darAnio(){
        return anio;
    }
    
    public void cambiarDia(int unDia){
        dia = unDia;
    }
    public void cambiarMes(int unMes){
        mes = unMes;
    }
    public void cambiarAnio(int unAnio){
        anio = unAnio;
    }
    
    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }

    public void fechaHoy() {
        GregorianCalendar gc = new GregorianCalendar();

        dia = gc.get(Calendar.DAY_OF_MONTH);
        mes = gc.get(Calendar.MONTH) + 1;
        anio = gc.get(Calendar.YEAR);
    }

}
