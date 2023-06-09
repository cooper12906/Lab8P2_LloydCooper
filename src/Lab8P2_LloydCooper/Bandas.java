package Lab8P2_LloydCooper;

public class Bandas extends Artistas {
    private int numeroIntegrantes;

    public Bandas(String usuario, String contraseña, String nombre, int edad, String generoMusical, int numeroIntegrantes) {
        super(usuario, contraseña, nombre, edad, generoMusical);
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    @Override
    public String toString() {
        return "Bandas{" + "numeroIntegrantes=" + numeroIntegrantes + '}';
    }

    
    
}
