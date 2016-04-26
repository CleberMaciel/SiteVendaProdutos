package ManagedBean;

import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager = true)
@ApplicationScoped //Application, pois os usu�rios cadastrados dever�o permanecer mesmo se fizer logout.
public class UsuarioMB {

    //CRUD
    private List<Usuario> listaUsuarios;
    private Usuario usuarioSelecionado;

    public UsuarioMB() {
        usuarioSelecionado = new Usuario();
        listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios.add(new Usuario("admin", "admin"));
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public String cadastro(){
        listaUsuarios.add(usuarioSelecionado);
        return ("/index");
    }

    public String novoUsuario(){
        usuarioSelecionado=new Usuario();
        return("/gerenciamento/formularioCadastro?faces-redirect=true");
    }

    public String adicionarUsuario(){
        listaUsuarios.add(usuarioSelecionado);
        //return(this.novoUsuario());
        return("/gerenciamento/gerenciar-usuarios?faces-redirect=true");
    }

    public String editarUsuario(Usuario u){
        usuarioSelecionado = u;
        return("/gerenciamento/formularioEdicao?faces-redirect=true");
    }
    public String atualizarUsuario(){
        return("/gerenciamento/gerenciar-usuarios?faces-redirect=true");
    }

    public void removerUsuario(Usuario usuario){
        listaUsuarios.remove(usuario);
    }

}
