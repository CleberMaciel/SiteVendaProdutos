package Util;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author cleber
 */
@Named(value = "mensagens")
@Dependent
public class Mensagens {

    /**
     * Creates a new instance of Mensagens
     */
    public Mensagens() {

    }

    public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informativo", "Categoria Cadastrada com sucesso!."));
    }

    public void infoProdutos() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informativo", "Produto cadastrado com sucesso!."));
    }

    public void infoNomesRepetidos() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Erro", "Produto já cadastrado!."));
    }

}
