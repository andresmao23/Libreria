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
public class Venta {

    private Libro libroCompra;

    private Fecha fechaCompra;

    private Cliente cliente;
    
    private int cantidad;

    public Venta() {
    }

    public Venta(Libro unLibro, Fecha unaFecha, Cliente unCliente,int unaCantidad) {
        libroCompra = unLibro;
        fechaCompra = unaFecha;
        cliente = unCliente;
        cantidad = unaCantidad;
    }

    public boolean realizarVenta() {
        return libroCompra.vender(cantidad);
    }
    
    public void cambiarCantidad(int unaCantidad){
        cantidad = unaCantidad;
    }
    
    public void cambiarLibro(Libro unLibro) {
        libroCompra = unLibro;
    }

    public void cambiarCliente(Cliente unCliente) {
        cliente = unCliente;
    }

    public void cambiarFecha(Fecha unaFecha) {
        fechaCompra = unaFecha;
    }

    public Libro cambiarLibro() {
        return libroCompra;
    }

    public Cliente darCliente() {
        return cliente;
    }

    public Fecha darFecha() {
        return fechaCompra;
    }
    
    public int darCantidad(){
        return cantidad;
    }
}
