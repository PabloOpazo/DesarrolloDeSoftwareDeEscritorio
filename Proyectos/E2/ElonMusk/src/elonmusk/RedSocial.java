package elonmusk;

public class RedSocial {
    protected String usuario;
    protected String password;

    public RedSocial() {
    }

    public RedSocial(String usuario, String password) {
        this.setUsuario(usuario);
        this.setPassword(password);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
