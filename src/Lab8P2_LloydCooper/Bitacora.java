package Lab8P2_LloydCooper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Bitacora extends Thread implements Serializable {
    private ArrayList<String[]> registros;
    private framePrincipal dialogAdmin; // Referencia al diálogo del administrador

    public Bitacora(framePrincipal dialogAdmin) {
        this.registros = new ArrayList<>();
        this.dialogAdmin = dialogAdmin;
    }

    //public void agregarRegistro(String accion, String tiempo, String persona) {
      //  String[] registro = { accion, tiempo, persona };
        //registros.add(registro);
        //dialogAdmin.agregarRegistroTabla(registro); // Agregar registro a la tabla del dialogAdmin
    //}
    
     

    public void guardarBitacoraEnArchivoBinario() {
        String directorioProyecto = System.getProperty("user.dir");
        String rutaBitacora = directorioProyecto + "/src/bitacora.dat";
        File archivoBitacora = new File(rutaBitacora);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoBitacora))) {
            oos.writeObject(this);
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Bitacora cargarBitacoraDesdeArchivoBinario() {
        String directorioProyecto = System.getProperty("user.dir");
        String rutaBitacora = directorioProyecto + "/src/bitacora.dat";
        File archivoBitacora = new File(rutaBitacora);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoBitacora))) {
            Bitacora bitacora = (Bitacora) ois.readObject();
            ois.close();
            return bitacora;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void run() {
        while (true) {
            // Realizar tareas de la bitácora

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}


