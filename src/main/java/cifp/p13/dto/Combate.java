package cifp.p13.dto;

import java.time.LocalDate;

public class Combate {

    LocalDate fecha;
    long id;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Combate() {
    }

    public Combate(LocalDate fecha, long id) {
        this.fecha = fecha;
        this.id = id;
    }
}
