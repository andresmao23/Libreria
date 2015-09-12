/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author yesid caicedo
 */
public class Imagen {
    
    public static final int ANCHO_MAXIMO = 200;
    
    public static final int ALTO_MAXIMO = 200;
    
    private int ancho;
    
    private int alto;
    
    private Color bitMap[][];
    
    private String archivo;

    public Imagen() {
    }
    
    public Imagen (String unArchivo) throws IOException{
        archivo = unArchivo;
        bitMap = new Color[ANCHO_MAXIMO][ALTO_MAXIMO];
        cargarImagen(archivo);
    }
    
    public void cambiarArchivo(String unArchivo){
        archivo = unArchivo;
    }
    
    public String darArcivo(){
        return archivo;
    }
    
    public int darAncho(){
        return ancho;
    }
    
    public int darAlto(){
        return alto;
    }
    public void cargarImagen(String nombreArchivo) throws IOException{
        File archivo = new File(nombreArchivo);
        BufferedImage bmp;
        try {
            bmp = ImageIO.read(archivo);
        } catch (IOException e) {
            throw new IOException("No se encuentra la imagen");
        }
        if (bmp.getWidth()<ANCHO_MAXIMO) {
            ancho = bmp.getWidth();
        } else {
            ancho = ANCHO_MAXIMO;
        }
        if (bmp.getHeight()<ALTO_MAXIMO) {
            alto = bmp.getHeight();
        }else{
            alto = ALTO_MAXIMO;
        }
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                bitMap[i][j] = new Color(bmp.getRGB(j, i));
            }
        }
    }
    public BufferedImage darImagen(){
        BufferedImage imagen = new BufferedImage(ancho, ancho, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                imagen.setRGB(j, i, bitMap[i][j].getRGB());
            }
        }
        return imagen;
    }
    
}
