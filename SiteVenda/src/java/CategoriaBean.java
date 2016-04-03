
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Cleber Maciel
 * @since 02/04/2016
 * @version 1.0
 */
@Named(value = "categoriaBean")
@SessionScoped
public class CategoriaBean implements Serializable {

    private Categoria cat = new Categoria();

    List<Categoria> listaCategoria = new ArrayList<>();

    public CategoriaBean() {

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

}
