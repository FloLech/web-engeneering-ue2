package at.ac.tuwien.big.we16.ue2.controller;

import at.ac.tuwien.big.we16.ue2.models.Product;
import at.ac.tuwien.big.we16.ue2.models.User;
import at.ac.tuwien.big.we16.ue2.service.ProductService;
import at.ac.tuwien.big.we16.ue2.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Florian on 22.04.16.
 */
@WebServlet(name = "Product", urlPatterns = {"/product"})
public class ProductDetailController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

        Long productId = Long.parseLong(request.getParameter("id"));
        ProductService productService = new ProductService();
        UserService userService = new UserService();
        Product product = productService.getProductById(productId);

        User highestBidder = product.getBidder();
        if(highestBidder != null ) {
            request.setAttribute("highestBidder", highestBidder);
        }

        request.setAttribute("product", product);

        try {
            RequestDispatcher view = request.getRequestDispatcher("/views/details.jsp");
            view.forward(request, response);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
