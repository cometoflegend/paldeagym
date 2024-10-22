package cifp.p13.dto;

public class LoginCreds {

    String un;
    String pw;

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public LoginCreds() {
    }

    public LoginCreds(String un, String pw) {
        this.un = un;
        this.pw = pw;
    }
}
