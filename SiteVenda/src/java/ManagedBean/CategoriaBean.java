package ManagedBean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import Model.Categoria;
import java.io.Serializable;

/**
 *
 * @author Cleber Maciel
 * @since 02/04/2016
 * @version 1.0
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class CategoriaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Categoria cat = new Categoria();

    List<Categoria> listaCategoria = new ArrayList<>();

    public CategoriaBean() {
        listaCategoria.add(new Categoria(1L, "Mouse"));
        listaCategoria.add(new Categoria(2L, "Teclado"));
        listaCategoria.add(new Categoria(3L, "Monitor"));
        listaCategoria.add(new Categoria(4L, "Notebook"));
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

    public void setListaCategoria(List<Categoria> listaCategoria) {
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
