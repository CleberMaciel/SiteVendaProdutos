/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author cleber
 */
public class Item {

    private Produto p;
    private double valorParcial;
    private int quantidade;

    public Item(Produto p, double valorParcial, int quantidade) {
        this.p = p;
        this.valorParcial = valorParcial;
        this.quantidade = quantidade;
    }

    public Item() {
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public double getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(double valorParcial) {
        this.valorParcial = valorParcial;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
