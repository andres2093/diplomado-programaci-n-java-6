package e1;

import java.io.File;

public class E1 {
    public static void main(String[] args) {
        File file = new File("/home/andres/Escritorio/cursos.txt");

        System.out.println("Nombre del archivo: " + file.getName());
        System.out.println("Ruta: " + file.getPath());
        System.out.println("Ruta relativa: " + file.getAbsoluteFile());
        System.out.println("Padre: " + file.getParent());
        System.out.println("Existe: " + file.exists());
        System.out.println("Está oculto: " + file.isHidden());

        if (file.exists()) {
            System.out.println("Se puede escribir en el: " + file.canWrite());
            System.out.println("Se puede leer: " + file.canRead());
            System.out.println("Se puede ejecutar: " + file.canExecute());
            System.out.println("Es un directorio: " + file.isDirectory());
            System.out.println("Tamaño del archivo en bytes: " + file.length());
        }
    }
}
