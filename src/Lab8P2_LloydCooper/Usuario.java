package Lab8P2_LloydCooper;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {
    private String usuario;
    private String contraseña;
    private String nombre;
    private int edad;
    private ArrayList<Evento> eventos;
    private ArrayList<Artistas> artistasSeguidos;

    public Usuario(String usuario, String contraseña, String nombre, int edad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.edad = edad;
        this.eventos = new ArrayList<>();
        this.artistasSeguidos = new ArrayList<>();
    }

    Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
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

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public void setArtistasSeguidos(ArrayList<Artistas> artistasSeguidos) {    
        this.artistasSeguidos = artistasSeguidos;
    }

    public void seguirArtista(Artistas artista) {
        artistasSeguidos.add(artista);
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Otros métodos de la clase Usuario
}
