/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

    private FileInputStream entrada;

    private FileOutputStream salida;

    private String archivo;

    public Imagen() {
    }

    public Imagen(String unArchivo) throws IOException {
        archivo = unArchivo;

        cargarImagen(archivo);
    }

    public void cambiarArchivo(String unArchivo) {
        archivo = unArchivo;
    }

    public String darArcivo() {
        return archivo;
    }

    public int darAncho() {
        return ancho;
    }

    public int darAlto() {
        return alto;
    }

    public byte[] cargarImagen(String nombreArchivo) {
        byte[] bytesImg = new byte[1024 * 100];
        File archivo = new File(nombreArchivo);
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (IOException e) {
            System.out.println("No se pudo leer la imagen");
        }
        return bytesImg;
    }

    public String guardarImagen(File unArchivo, byte[] bytesImg) {
        String rta = null;
        try {
            if (!unArchivo.exists()) {
                unArchivo.canWrite();
//                salida = new FileOutputStream(unArchivo);
//                salida.write(bytesImg);
                rta = "La imagen se guardo correctamente";
            }

        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return rta;
    }

}
