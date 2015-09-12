/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author yesid caicedo
 */
public class Libreria {
    
    private ArrayList<Venta> venta;
    
    private ArrayList<Editorial> editorial;
    
    private ArrayList<Libro> libro;
    
    private ArrayList<Cliente> cliente;
    
    private ArrayList<Autor> autor;
    
    private String nombre;
    
    private String direccion;
    
    private String telefono;
    
    private double dineroEnCaja;

    public Libreria() {
         venta = new ArrayList<>();
        editorial = new ArrayList<>();
        libro = new ArrayList<>();
        cliente = new ArrayList<>();
        autor = new ArrayList<>();
    }
    
    public Libreria(String unNombre, String unaDireccion,String unTelefono){
        nombre = unNombre;
        direccion = unaDireccion;
        telefono = unTelefono;
        dineroEnCaja = 0.0;
        
        venta = new ArrayList<>();
        editorial = new ArrayList<>();
        libro = new ArrayList<>();
        cliente = new ArrayList<>();
        autor = new ArrayList<>();
    }
    
    public boolean agregarVenta(Venta unaVenta){
        if (venta.add(unaVenta)) {
            return true;
        }
        return false;
    }
    
    public boolean agregarEditorial(Editorial unaEditorial){
        if (editorial.add(unaEditorial)) {
            return true;
        }
        return false;
    }
    
    public boolean agregarLibro(Libro unLibro){
        if (libro.add(unLibro)) {
            return true;
        }
        return false;
    }
    
    public boolean agregarCliente(Cliente unCliente){
        if (cliente.add(unCliente)) {
            return true;
        }
        return false;
    }
    
    public boolean agregarAutor(Autor unAutor){
        if (autor.add(unAutor)) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Venta> darListaVenta(){
        return venta;
    }
    
    public ArrayList<Editorial> darListaEditorial(){
        return editorial;
    }
    
    public ArrayList<Libro> darListaLibro(){
        return libro;
    }
    
    public ArrayList<Cliente> darListaCliente(){
        return cliente;
    }
    
    public ArrayList<Autor> darListaAutor(){
        return autor;
    }
    
    public int buscarVenta(Venta unaVenta){
        return venta.indexOf(unaVenta);
    }
    
    public int buscarEditorial(Editorial unaEditorial){
        return editorial.indexOf(unaEditorial);
    }
    
    public int buscarLibro(Libro unLibro){
        return libro.indexOf(unLibro);
    }
    
    public int buscarCliente(Cliente unCliente){
        return cliente.indexOf(unCliente);
    }
    
    public int buscarAutor(Autor unAutor){
        return autor.indexOf(unAutor);
    }
    
    public boolean modificarVenta(int i,Venta unaVenta){
        if (i > 0 || i < venta.size()) {
            venta.add(i, unaVenta);
            return true;
        }
        return false;
    }
    
    public boolean modificarEditorial(int i,Editorial unaEditorial){
        if (i>=0||i<editorial.size()) {
            editorial.set(i, unaEditorial);
            return true;
        }
        return false;
    }
    
    public boolean modificarLibro(int i,Libro unLibro){
        if(i>0||i<libro.size()){
            libro.add(i, unLibro);
            return true;
        }
        return false;
    }
    
    public boolean modificarCliente(int i,Cliente unCliente){
        if(i>0||i<cliente.size()){
            cliente.add(i, unCliente);
            return true;
        }
        return false;
    }
    
    public boolean modificarAutor(int i,Autor unAutor){
        if(i>=0||i<autor.size()){
            autor.set(i, unAutor);
            return true;
        }
        return false;
    }
    
    public boolean eliminarVenta(Venta unaVenta){
        return venta.remove(unaVenta);
    }
    
    public boolean eliminarEditorial(int indice){
        editorial.remove(indice);
        return true;
    }
    
    public boolean eliminarLibro(Libro unLibro){
        return libro.remove(unLibro);
    }
    
    public boolean elimianarCliente(Cliente unCliente){
        return cliente.remove(unCliente);
    }
    
    public boolean eliminarAutor(int indice){
        autor.remove(indice);
        return true;
    }
}
