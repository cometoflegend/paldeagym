package cifp.p13.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class Carnet implements Serializable {

    private long idEntrenador;
    private LocalDate fechaExpedicion;
    private float puntos;
    private int numVictorias;

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public long getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(long idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public int getNumVictorias() {
        return numVictorias;
    }

    public void setNumVictorias(int numVictorias) {
        this.numVictorias = numVictorias;
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    public Carnet() {
    }

    public Carnet(LocalDate fechaExpedicion, long idEntrenador, int numVictorias, float puntos) {
        this.fechaExpedicion = fechaExpedicion;
        this.idEntrenador = idEntrenador;
        this.numVictorias = numVictorias;
        this.puntos = puntos;
    }
}
