
package cr.ac.ucr.phc.phc_embed_tomcat_pruebas.servlets;

import cr.ac.ucr.phc.phc_embed_tomcat_pruebas.util.JsonUtil;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "EjemploServlet",
        urlPatterns = {"/ejemplo"}
    )
public class EjemploServlet extends HttpServlet {
    
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        out.write(obtenerLista().getBytes(StandardCharsets.UTF_8));
        out.flush();
        out.close();
    }
    
    private String obtenerLista(){
        String[] arreglo = {"Costa Rica", "China", "Panamá", "Honduras"};
        JsonUtil jsonUtil = new JsonUtil();
        
        return jsonUtil.ArregloAJson(arreglo);
    }
            
    
}
