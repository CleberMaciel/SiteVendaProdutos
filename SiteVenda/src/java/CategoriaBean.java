
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
        listaCategoria.add(new Categoria("Mouse"));
        listaCategoria.add(new Categoria("Teclado"));
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public List<Categoria> getListaCategoria() {
        if (listaCategoria == null) {
            listaCategoria = new ArrayList<>();
            listaCategoria.add(new Categoria("Mouse"));
            listaCategoria.add(new Categoria("Teclado"));

        }

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
