package cn.edu.cuit.car.serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

/**
 * Created by jianglei on 16/5/8.
 */
@WebServlet(name = "CarServlet")
public class CarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float speed=Float.valueOf(request.getParameter("speed"));
        getServletConfig().getServletContext().setAttribute("speed",speed);
        response.getWriter().print("server: speed updated success"+speed);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
