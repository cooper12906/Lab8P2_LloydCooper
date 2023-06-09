package Lab8P2_LloydCooper;

import java.io.Serializable;
import java.util.ArrayList;

public class Artistas implements Serializable {
    private String usuario;
    private String contraseña;
    private String nombre;
    private int edad;
    private String generoMusical;
    private ArrayList<Cancion> canciones = new ArrayList();

    public Artistas(String usuario, String contraseña, String nombre, int edad, String generoMusical) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.edad = edad;
        this.generoMusical = generoMusical;
        this.canciones = new ArrayList<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Artistas{" + "usuario=" + usuario + ", contrasena=" + contraseña + ", nombre=" + nombre + ", edad=" + edad + ", generoMusical=" + generoMusical + ", canciones=" + canciones + '}';
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    // Otros métodos de la clase Artista
}
