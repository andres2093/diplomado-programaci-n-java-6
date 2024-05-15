package e2;

import java.io.*;

public class E2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/archivo.txt"));

        bw.write("Está es la primer línea del documento");
        bw.newLine();
        bw.write("Está es la segunda línea\n");
        bw.write("Está será la última línea");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + "/archivo.txt"));

        String linea;

        while((linea = br.readLine()) != null){
            System.out.println(linea);
        }
    }
}
