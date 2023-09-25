package com.neyser;

import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        File dir1 = new File("carpetaDatos1");
        File file1 = new File("carpetaDatos1/datos1.txt");
        dir1.mkdirs();
        file1.createNewFile();

        if (file1.exists())
        {
            System.out.println("Nombre del fichero:" +file1.getName());
            System.out.println("Ruta Absoluta: "+file1.getAbsolutePath());
            System.out.println("Ruta Relativa: "+file1.getPath());
            System.out.println("Fichero editable: "+file1.canWrite());
            System.out.println("Fichero leible: "+file1.canRead());
            System.out.println("Tamaño del fichero(bytes): "+file1.length());
            // Nombre de directorios y ficheros
            File file2 = new File("carpetaDatos1");

            String[] pathnames;
            pathnames = file2.list();

            for (String pathname: pathnames) {
                System.out.println("Nombre de ficher: "+pathname);
            }

        }

    }
}