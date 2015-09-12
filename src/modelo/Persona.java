/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yesid caicedo
 */
public class Persona {

    private String nombre;

    private String apellido;

    private String identificacion;

    public Persona() {
    }

    public Persona(String unNombre, String unApellido, String unaIdentificacion) {
        nombre = unNombre;
        apellido = unApellido;
        identificacion = unaIdentificacion;
    }

    public void cambiarNombre(String unNombre) {
        nombre = unNombre;
    }

    public void cambiarApellido(String unApellido) {
        apellido = unApellido;
    }

    public void cambiarIdentificacion(String unaIdentificacion) {
        identificacion = unaIdentificacion;
    }

    public String darNombre() {
        return nombre;
    }

    public String darApellido() {
        return apellido;
    }

    public String darIdentificacion() {
        return identificacion;
    }

}
