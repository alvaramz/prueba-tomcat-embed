/*
Copyright (c) 2017, Universidad de Costa Rica
All rights reserved.
Elaborado por Ing. Adrián Alvarado Ramírez.
 */
package cr.ac.ucr.phc.phc_embed_tomcat_pruebas.claicBeans;

import javax.faces.view.ViewScoped;

@ViewScoped
public class InicioBean {

// <editor-fold desc="Propiedades">

// </editor-fold>

// <editor-fold desc="Eventos">
    
// </editor-fold>

// <editor-fold desc="Métodos"> 
    public InicioBean(){
    
    }
    
    public String obtenerHola(){
        return "Hola desde un CDI bean";
    }
// </editor-fold>

// <editor-fold desc="Campos">
   
// </editor-fold>

}
