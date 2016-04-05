/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cleber Maciel
 * @since 02/04/2016
 * @version 1.0
 */
public class Categoria {

    private String nomeCategoria;
    private String qualquer;

    public Categoria() {
        
    }

    public String getQualquer() {
        return qualquer;
    }

    public void setQualquer(String qualquer) {
        this.qualquer = qualquer;
    }

    public Categoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    @Override
    public String toString() {
        return nomeCategoria;
    }

}
