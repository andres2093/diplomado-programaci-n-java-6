package r2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class R2 {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(Files.newInputStream(Paths.get("beto.png")));
        BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(Paths.get("beto_copia.png")));

        byte[] buffer = new byte[1024];

        int bytesLeidos;

        while ((bytesLeidos = bis.read(buffer)) > 0){
            bos.write(buffer, 0, bytesLeidos);
        }

        bos.close();
        bis.close();
    }
}
