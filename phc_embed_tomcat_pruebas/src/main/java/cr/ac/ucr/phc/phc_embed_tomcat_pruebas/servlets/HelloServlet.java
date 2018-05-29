package cr.ac.ucr.phc.phc_embed_tomcat_pruebas.servlets;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/hello"}
    )
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.write("Funcionando".getBytes());
        out.flush();
        out.close();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        out.write("Ocurrió un error al procesar la solicitud".getBytes(StandardCharsets.UTF_8));
        out.flush();
        out.close();
    }

}
