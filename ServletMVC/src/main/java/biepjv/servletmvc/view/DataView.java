/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biepjv.servletmvc.view;

import biepjv.servletmvc.model.Data;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "DataView", urlPatterns = {"/"})
public class DataView extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DataView</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Data</h1>");
            out.println("<table border =\"1\">");
            for (String e : Data.instance.data()) {
                out.println("<tr>");
                out.println("<td>");
                out.println(e);
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            HttpSession s = request.getSession();
            String username = (String) s.getAttribute("username");
            if (username == null) {
                out.println(
                        "<form action=\"login.do\" method=\"POST\">"
                        + "<input type=\"text\" name=\"username\" value=\"\" />"
                        + "<input type=\"submit\" value=\"Login\" />"
                        + "</form>");

            } else {
                out.println("username: " + username + "<br>");
                out.println(
                        "<form action=\"update.do\" method=\"POST\">"
                        + "<input type=\"text\" name=\"element\" value=\"\" />"
                        + "<input type=\"submit\" value=\"Add\" />"
                        + "</form>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
