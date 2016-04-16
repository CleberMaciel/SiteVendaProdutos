/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Model.Produto;
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
public class ProdutoBean {

    private Produto prod;
    private List<Produto> listaProdutos;

    /**
     * Creates a new instance of ProdutoBean
     */
    public ProdutoBean() {
        prod = new Produto();
        listaProdutos = new ArrayList<>();
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
        listaProdutos.add(new Produto(prod.getProdutoNome(), prod.getProdutoDescricao(), prod.getProdutoCategoria(), prod.getProdutoCor(), prod.getQuantidade()));
       
    }

    public void deletarProduto(Produto p) {
        listaProdutos.remove(p);
    }

    public void editarProduto() {

    }
}
