package ManageBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author cleber
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class UsuarioBean {

    private List<Usuario> listaUsuarios = new ArrayList<>();    
    private Usuario userSelecionado;

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {

        listaUsuarios.add(new Usuario("admin", "admin"));
        userSelecionado = new Usuario();

    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Usuario getUserSelecionado() {
        return userSelecionado;
    }

    public void setUserSelecionado(Usuario userSelecionado) {
        this.userSelecionado = userSelecionado;
    }

    public String novoUsuario() {
        userSelecionado = new Usuario();
        return ("/admin/formularioCadastro?faces-redirect=true");
    }

    public String adicionarUsuario() {
        listaUsuarios.add(userSelecionado);
        return (this.novoUsuario());
    }

    public String editarUsuario(Usuario u) {
        userSelecionado = u;
        return ("/admin/formularioEdicao?faces-redirect=true");
    }

    public String atualizarUsuario() {
        return ("/admin/index?faces-redirect=true");
    }

    public void removerUser(Usuario u) {
        listaUsuarios.remove(u);
    }

}//fim da classe
