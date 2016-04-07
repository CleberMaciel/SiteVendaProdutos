package Util;   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ManageBean.UsuarioBean;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cleber Maciel
 */
@WebFilter(filterName = "FiltroAcesso", urlPatterns = {"/faces/gerenciamento.xhtml"})
public class FiltroAcesso implements Filter {

    //Obtendo o objeto UsuarioMB da sessão
    @Inject
    private UsuarioBean user;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        //Obtem o request e response para utilizacao Web
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        //Se o usuário estiver logado 
        if (user != null && user.estaLogado()) {
            //deixa acessar o recurso
            chain.doFilter(request, response);
        } else {
            //redireciona para a página de login
            //getContextPath -> Caminho da aplicação
            resp.sendRedirect(req.getContextPath() + "/faces/index.xhtml");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

}
