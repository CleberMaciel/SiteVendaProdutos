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
@WebFilter(urlPatterns = {"/faces/gerenciamento.xhtml" , "/faces/cadastroCategoria.xhtml" , "/faces/cadastroProduto.xhtml"})
public class FiltroAcesso implements Filter {

    //Obtendo o objeto UsuarioMB da sessão
    @Inject
    private UsuarioBean user;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
        //Obtem o request e response para utilizacao Web
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        if (!user.estaLogado()
                && !request.getRequestURI().endsWith("/login.xhtml")
                && !request.getRequestURI()
                .contains("/javax.faces.resource/")) {
            response.sendRedirect(request.getContextPath()
                    + "/login.xhtml");
        } else {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

}
