/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

    public void adicionarProduto() {
        listaProdutos.add(new Produto(prod.getProdutoNome(), prod.getProdutoDescricao(), prod.getProdutoCategoria(), prod.getProdutoCor()));
        prod = new Produto();
    }

    public void deletarProduto() {

    }

    public void editarProduto() {

    }
}
