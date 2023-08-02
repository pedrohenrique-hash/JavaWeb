/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(urlPatterns = {"/Formulario"})
public class Formulario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 private void sendLoginForm(HttpServletResponse response, boolean withErrorMessage)throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Login </title>");
        out.println("</head>");
        out.println("<body>");
        if(withErrorMessage){
            out.println("O login falhou <br>");
        }
        
        out.println("<br>");
        out.println("<br>Please enter your user name name and password<br>");
        out.println("<br><form method = POST>");
        out.println("<br>User Name: <input type=text name=username>");
        out.println("<br> Password: <input type= passsword name=password>");
        out.println("<br> <input TYPE= SUBMIT VALUE = OK>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
       
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
        sendLoginForm(response, false);
        
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
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if(username != null && password != null && username.equals("Julia")&& password.equals("3135")){
                response.sendRedirect("C:\\Users\\Dell\\Documents\\NetBeansProjects\\web\\web\\site.html");
                
            }else{
                sendLoginForm(response,true);
            }
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
