package Lab8P2_LloydCooper;

import java.io.Serializable;

public class Cancion implements Serializable {
    private String nombre;
    private int duracionSegundos;

    public Cancion(String nombre, int duracionSegundos) {
        this.nombre = nombre;
        this.duracionSegundos = duracionSegundos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", duracionSegundos=" + duracionSegundos + '}';
    }

    
}