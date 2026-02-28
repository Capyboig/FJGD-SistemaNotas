package repository;


import java.io.IOException;
import java.nio.file.*;


public class NotasRepository {
    private static final String RUTA_BASE = "src/data/usuarios/";


    public void guardarNota(String emailsanitizado, String titulo, String contenido) {
        Path carpetaUsuario = Paths.get(RUTA_BASE, emailsanitizado);
        Path archivoNotas = carpetaUsuario.resolve("notas.txt");

        try {
            if (Files.notExists(carpetaUsuario)) {
                Files.createDirectories(carpetaUsuario);
            }

            String lineaNota = titulo + ";" + contenido + System.lineSeparator();

            Files.writeString(archivoNotas, lineaNota,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);

            System.out.println("[EXITO] Nota guardada correctamente");
            System.out.println("Guardado con el email " + emailsanitizado);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
