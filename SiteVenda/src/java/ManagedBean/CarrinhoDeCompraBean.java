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
public class CarrinhoDeCompraBean {

    private List<Produto> carrinhoCompras;

    public CarrinhoDeCompraBean() {

        carrinhoCompras = new ArrayList<>();
    }

    public List<Produto> getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(List<Produto> carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public String addCarrinho(Produto p) {
        carrinhoCompras.add(p);
        return ("/faces/carrinho");
    }

    public String finalizar(Produto p) {
        ProdutoBean pb = new ProdutoBean();
        int quantidade = 1;

        int total = p.getQuantidade();
        pb.getProd().setQuantidade(total);

        return ("index");
    }
}
