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
public class Autor extends Persona {

    private String nacionalidad;

    private Fecha fechaNacimiento;

    public Autor() {
    }

    public Autor(String unaNacionalidad, Fecha FNacimiento) {
        nacionalidad = unaNacionalidad;
        fechaNacimiento = FNacimiento;
    }

    public Autor(String unNombre, String unApellido, String unaIdentificacion, String unaNacionalidad, Fecha FNacimiento) {
        super(unNombre, unApellido, unaIdentificacion);
        nacionalidad = unaNacionalidad;
        fechaNacimiento = FNacimiento;
    }

    public void cambiarNacionalidad(String unaNacionalidad) {
        nacionalidad = unaNacionalidad;
    }

    public String darNacionalidad() {
        return nacionalidad;
    }

    public void cambiarFechaNacimiento(Fecha FNacimietno) {
        fechaNacimiento = FNacimietno;
    }

    public Fecha darFecha() {
        return fechaNacimiento;
    }
}
