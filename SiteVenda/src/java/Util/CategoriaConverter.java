/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import ManagedBean.CategoriaBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Cleber Maciel
 * @since 16/04/2016
 */
@FacesConverter(value = "categoriaConverter")
public class CategoriaConverter implements Converter {

    //Converte a categoria em String.
    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return o.getClass().getName();
    }

    //Converte a String Categoria em Objeto 
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        FacesContext context = FacesContext.getCurrentInstance();
        CategoriaBean categoriaBean = (CategoriaBean) context.getELContext().getELResolver().getValue(context.getELContext(), null, "categoriaBean");

        return categoriaBean.buscaCategorianome(string);
    }

}
