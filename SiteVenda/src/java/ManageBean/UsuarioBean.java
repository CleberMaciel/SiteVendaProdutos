package ManageBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author cleber
 */
@Named
@SessionScoped
public class UsuarioBean implements Serializable{

    private List<Usuario> listaUsuarios;
    private boolean logado;
    private Usuario user;

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("admin", "admin"));

        user = new Usuario();
        logado = false;
    }

    public boolean estaLogado() {
        return logado;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String verificaLogin() {
        if (listaUsuarios.contains(user)) {
            return "cadastroProduto";
        } else {
            FacesContext contexto = FacesContext.getCurrentInstance();
            FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Login inválido!", "Usuário ou senha estão errados!");
            contexto.addMessage("idMensagem", mensagem);
            return "login";
        }

    }
}
