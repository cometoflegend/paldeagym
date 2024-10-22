package cifp.p13.dto;

public class Entrenador {

    private long id;
    private String nombre;
    private String nacionalidad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador() {
    }

    public Entrenador(long id, String nacionalidad, String nombre) {
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }
}
