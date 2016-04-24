package at.ac.tuwien.big.we16.ue2.controller;

import at.ac.tuwien.big.we16.ue2.models.Product;
import at.ac.tuwien.big.we16.ue2.models.User;
import at.ac.tuwien.big.we16.ue2.service.ProductService;
import at.ac.tuwien.big.we16.ue2.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Florian on 19.04.16.
 */
@WebServlet(name = "Login", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    public LoginController(){super();}

    private UserService userService = new UserService();
    private Map<String, User> userPool = userService.getUseres();

    private ProductService productService = new ProductService();
    private Map<Long, Product> products = productService.getProducts();


    public void init(ServletConfig config) throws ServletException {
        super.init(config);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("/views/login.jsp");
        view.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        if(!request.getParameter("email").equals("")&& !request.getParameter("password").equals("")) {
            HttpSession session = request.getSession(true);
            String email= request.getParameter("email");
            String password= request.getParameter("password");
            User dummy= userPool.get(email);
            if(dummy!=null){
                if(dummy.getPassword().equals(password)) {
                    session.setAttribute("user", dummy);
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/overview.jsp");
                    try {
                        request.setAttribute("products", products);
                        dispatcher.forward(request, response);
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            } else {
                try {
                    RequestDispatcher view = request.getRequestDispatcher("/views/login.jsp");
                    view.forward(request, response);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
