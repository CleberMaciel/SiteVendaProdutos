/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBean;

import Model.Usuario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginMB {

    private String login, pass;
    private Usuario usuarioLogado;

    public LoginMB() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public boolean estaLogado() {
        return (usuarioLogado != null);
    }

    public boolean eAdmin() {
        return (this.estaLogado() && this.getUsuarioLogado().isAdmin());
    }

    public String verificandoLogin() {
        //Pega o contexto do JSF - serve agora e depois para mensagem.
        FacesContext contexto = FacesContext.getCurrentInstance();
        //Obtém o usuarioMB criado pelo servidor (nível de aplicação)
        UsuarioBean usuarioBean = (UsuarioBean) contexto.getExternalContext().getApplicationMap().get("usuarioMB");
        //A partir do usuarioMB do servidor, pegamos a lista de usuários cadastrados no sistema
        List<Usuario> listaUsuarios = usuarioBean.getListaUsuarios();
     
        for (Usuario usuario : listaUsuarios) {
            if (usuario.verificaLogin(login, pass)) {
                usuarioLogado = usuario;
                if (usuario.isAdmin()) {
                    return ("/admin/index?faces-redirect=true");
                } else {
                    return ("usuario/index?faces-redirect=true");
                }
            }
        }
        FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                "Login inválido!", "Usuário ou senha estão errados!");
        contexto.addMessage("idMensagem", mensagem);
        return ("/login");
    }

    public String realizaLogout() {
        usuarioLogado = null;
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return ("/login?faces-redirect=true");
    }
}
