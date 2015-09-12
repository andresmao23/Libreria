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
public class Libro {

    public static final int STOCK = 20;

    private Editorial editorial;

    private Imagen imagen;

    private Autor autor;

    private Fecha fechaPublicacion;

    private String nombre;

    private String idioma;

    private int cantidad;

    private int librosVendidos;

    public Libro() {
    }

    public Libro(String unNombre, String unIdioma, int unaCantidad, Autor unAutor, Editorial unaEditorial, Imagen unaImagen, Fecha FPublicacion) {
        nombre = unNombre;
        idioma = unIdioma;
        cantidad = unaCantidad;
        autor = unAutor;
        editorial = unaEditorial;
        imagen = unaImagen;
        fechaPublicacion = FPublicacion;
    }

    public Editorial darEditorial() {
        return editorial;
    }

    public Imagen darImagen() {
        return imagen;
    }

    public Fecha darFecha() {
        return fechaPublicacion;
    }

    public Autor darAutor() {
        return autor;
    }

    public int darLibrosVendidos() {
        return librosVendidos;
    }

    public String darNombre() {
        return nombre;
    }

    public String darIdioma() {
        return idioma;
    }

    public int darCantidad() {
        return cantidad;
    }

    public void cambiarNombre(String unNombre) {
        nombre = unNombre;
    }

    public void cambiarCantidad(int unaCantidad) {
        cantidad = unaCantidad;
    }

    public void cambiarIdioma(String unIdioma) {
        idioma = unIdioma;
    }

    public void cambiarEditorial(Editorial unaEditorial) {
        editorial = unaEditorial;
    }

    public void cambiarImagen(Imagen unaImagen) {
        imagen = unaImagen;
    }

    public void cambiarFecha(Fecha FPublicacion) {
        fechaPublicacion = FPublicacion;
    }

    public void cambiarAutor(Autor unAutor) {
        autor = unAutor;
    }

    public boolean vender(int unaCantidad) {
        if (unaCantidad > cantidad) {
            unaCantidad = cantidad;
        }
        if (unaCantidad == 0 || unaCantidad < 0) {
            return false;
        }
        librosVendidos = librosVendidos + unaCantidad;
        cantidad = cantidad - unaCantidad;
        return true;
    }

    public void hacerPedido(int unaCantidad) {
        cantidad = cantidad + unaCantidad;
    }

    public boolean esNecesarioHacerPedido() {
        return cantidad < STOCK;
    }
}
