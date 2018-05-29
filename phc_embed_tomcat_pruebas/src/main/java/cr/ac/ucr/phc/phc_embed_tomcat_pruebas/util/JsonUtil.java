
package cr.ac.ucr.phc.phc_embed_tomcat_pruebas.util;

import com.google.gson.Gson;
import java.util.List;

public class JsonUtil {
    
    public String ArregloAJson(List pArreglo){
        String Json;
        Gson gson;
        
        gson = new Gson();
        Json = gson.toJson(pArreglo);
        
        return Json;
    }
    
    public String ArregloAJson(String[] pArreglo){
        String Json;
        Gson gson;
        
        gson = new Gson();
        Json = gson.toJson(pArreglo);
        
        return Json;
    }
    
    public String[] JsonAArreglo(String pJson){
        String[] arreglo;
        Gson gson;
        
        gson = new Gson();
        arreglo = gson.fromJson(pJson, String[].class);
        
        return arreglo;
    }
    
    public String ArregloObjetosAJson(List pArreglo){
        String Json;
        Gson gson;
        
        gson = new Gson();
        Json = gson.toJson(pArreglo);
        
        return Json;
    }
    
}
