package Lab8P2_LloydCooper;

import java.io.Serializable;
import java.util.Date;


public class Evento implements Serializable {
    private Date fecha;
    private String ciudad;
    private String lugar;
    private int capacidadPersonas;

    public Evento(Date fecha, String ciudad, String lugar, int capacidadPersonas) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidadPersonas = capacidadPersonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    @Override
    public String toString() {
        return "Evento:" 
                + "fecha=" + fecha + 
                ", ciudad=" + ciudad + 
                ", lugar=" + lugar + 
                ", capacidadPersonas=" + capacidadPersonas;
    }
}

