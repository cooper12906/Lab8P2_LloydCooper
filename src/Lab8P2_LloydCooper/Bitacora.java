package Lab8P2_LloydCooper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Bitacora implements Runnable {
    private ArrayList<String[]> registros;

    public Bitacora() {
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(String accion, String tiempo, String persona) {
        String[] registro = {accion, tiempo, persona};
        registros.add(registro);
    }

    @Override
    public void run() {
        while(true){            
            try {
                File f = new File("./bitacora.txt");
                FileWriter fw = new FileWriter(f,true);
                BufferedWriter bw = new BufferedWriter(fw);
                //bw.write();
                bw.newLine();
                bw.flush();
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }

    
}
