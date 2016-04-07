package ManageBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Util.Mensagens;
import Model.Produto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleber
 */
@Named(value = "produtoBean")
@SessionScoped
public class ProdutoBean implements Serializable {

    private Produto prod = new Produto();
    private List<Produto> listaProdutos = new ArrayList<>();
    private Mensagens m = new Mensagens();
    /**
     * Creates a new instance of ProdutoBean
     */
    public ProdutoBean() {

    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    
    //Verifica se existe algum produto com o nome já no array, caso exista, ele não adiciona, caso contrario adiciona
    public void adicionarProduto() {
        if (listaProdutos.contains(prod)) {
            System.out.println("Nao");
        } else {
            listaProdutos.add(prod);
            prod = new Produto();
            //return "index";
        }
    }

}
