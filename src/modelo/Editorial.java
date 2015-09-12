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
public class Editorial {
    
    private String nombre;

    public Editorial() {
    }
    
    public Editorial(String unNombre){
        nombre = unNombre;
    }
    
    public void cmabiarNombre(String unNombre){
        nombre = unNombre;
    }
    public String darNombre(){
        return nombre;
    }
}
