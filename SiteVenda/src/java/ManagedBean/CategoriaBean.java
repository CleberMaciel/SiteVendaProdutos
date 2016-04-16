package ManagedBean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import Model.Categoria;

/**
 *
 * @author Cleber Maciel
 * @since 02/04/2016
 * @version 1.0
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class CategoriaBean {

    private Categoria cat = new Categoria();

    List<Categoria> listaCategoria = new ArrayList<>();
    
    
    public CategoriaBean() {
        listaCategoria.add(new Categoria("Mouse"));
        listaCategoria.add(new Categoria("Teclado"));
        listaCategoria.add(new Categoria("Monitor"));
        listaCategoria.add(new Categoria("Notebook"));
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public List<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public String mostraCategoriaAdicionada() {
        return "" + cat.getNomeCategoria();
    }

    public void adicionaCategoria() {
        listaCategoria.add(cat);
        cat = new Categoria();

    }

    public String buscaCategorianome(String nomeCat) {
        for (int i = 0; i < listaCategoria.size(); i++) {
            if (listaCategoria.get(i).getNomeCategoria().equals(nomeCat)) {
                return nomeCat;

            }
        }
        return null;
    }

}
