/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Model.Item;
import Model.Produto;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author cleber
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class CarrinhoDeCompraBean {

    private List<Item> listaItens;
    private Usuario usuarioLogado;

    public CarrinhoDeCompraBean() {
        listaItens = new ArrayList<>();
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public String addCarrinho(Produto p) {
        Item item = new Item();
        item.setP(p);
        item.setQuantidade(1);
        item.setValorParcial(0);
        p.setQuantidade(p.getQuantidade() - item.getQuantidade());
        listaItens.add(item);
        return ("usuario/carrinho-de-compras");
    }

    public void finalizarCompra() {
        listaItens.removeAll(listaItens);
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
       // return ("/index?faces-redirect=true");
    }
}
