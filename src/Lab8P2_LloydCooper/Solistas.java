package Lab8P2_LloydCooper;

import java.util.ArrayList;

public class Solistas extends Artistas {
    private ArrayList<String> listaCanciones;

    public Solistas(String usuario, String contraseña, String nombre, int edad, String generoMusical) {
        super(usuario, contraseña, nombre, edad, generoMusical);
        this.listaCanciones = new ArrayList<>();
    }

    public ArrayList<String> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<String> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    
}

