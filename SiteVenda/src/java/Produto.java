/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cleber
 */
public class Produto {

    private String produtoNome;
    private String produtoDescricao;
    private String produtoCategoria;
    private String produtoCor;

    
    public Produto() {
    }

    public Produto(String produtoNome, String produtoDescricao, String produtoCategoria, String produtoCor) {
        this.produtoNome = produtoNome;
        this.produtoDescricao = produtoDescricao;
        this.produtoCategoria = produtoCategoria;
        this.produtoCor = produtoCor;
    }

    public String getProdutoCategoria() {
        return produtoCategoria;
    }

    public void setProdutoCategoria(String produtoCategoria) {
        this.produtoCategoria = produtoCategoria;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }

    public void setProdutoDescricao(String produtoDescricao) {
        this.produtoDescricao = produtoDescricao;
    }

    public String getProdutoCor() {
        return produtoCor;
    }

    public void setProdutoCor(String produtoCor) {
        this.produtoCor = produtoCor;
    }

}
