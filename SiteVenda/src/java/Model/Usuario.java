package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cleber
 */
public class Usuario{

    private String user;
    private String pass;
    
    private boolean admin;

    
    public Usuario() {
    }

    public Usuario(String user, String pass) {
        this.user = user;
        this.pass = pass;
        this.admin = true;
    }


    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    
    public boolean verificaLogin(String login, String senha){
        return(this.user.equals(login) && this.pass.equals(senha));
    }

}
