/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Categoria;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import org.omnifaces.converter.SelectItemsConverter;

/**
 *
 * @author cleber
 */
@FacesConverter("categoriaConverter")
public class CategoriaConverter extends SelectItemsConverter{
 
       @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Long id = (value instanceof Categoria) ? ((Categoria) value).getId() : null;
        return (id != null) ? String.valueOf(id) : null;
    }
}
