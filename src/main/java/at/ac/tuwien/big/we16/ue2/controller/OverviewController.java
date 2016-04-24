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
import java.util.Map;

import static at.ac.tuwien.big.we16.ue2.service.ProductService.products;

/**
 * Created by krirs on 24.04.2016.
 */

@WebServlet(name = "Overview", urlPatterns = {"/OverviewController"})
public class OverviewController  extends HttpServlet {

    public OverviewController(){super();}

    private UserService userService = new UserService();
    private Map<String, User> userPool = userService.getUseres();

    private ProductService productService = new ProductService();
    private Map<Long, Product> products = productService.getProducts();

    public void init(ServletConfig config) throws ServletException {
        super.init(config);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/overview.jsp");
    try {
        request.setAttribute("products", products);
        dispatcher.forward(request, response);
    }catch (IOException e){
        e.printStackTrace();
    }
}
}




