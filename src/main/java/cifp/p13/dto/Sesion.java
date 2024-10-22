package cifp.p13.dto;

public class Sesion {

    long id;
    Perfil perfil;
    LoginCreds credenciales;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public LoginCreds getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(LoginCreds credenciales) {
        this.credenciales = credenciales;
    }


    //constructores
    public Sesion() {
    }

    public Sesion(long id, Perfil perfil, LoginCreds credenciales) {
        super();
        this.id = id;
        this.perfil = perfil;
        this.credenciales = credenciales;
    }

}
