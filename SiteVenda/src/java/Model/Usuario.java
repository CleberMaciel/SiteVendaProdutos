package Model;

import java.util.Objects;

public class Usuario {

    private String login;
    private String senha;

    private boolean admin;

    public Usuario() {
    }

    public Usuario(String login, String senha) {

        this.login = login;
        this.senha = senha;
        this.admin = true;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getAdminString() {
        if (admin) {
            return "SIM";
        } else {
            return "NAO";
        }
    }

    
    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean verificaLogin(String login, String senha) {
        return (this.login.equals(login) && this.senha.equals(senha));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }
    
    
}
