public class OrientadoObjetos {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNombre("Beto");
        autor.setEdad(9);
        autor.setApellido("Bedu");

        Libro libro = new Libro();
        libro.setTitulo("JavaSE");
        libro.setAutor(autor);
        libro.setNumeroPaginas(500);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
    }
}
