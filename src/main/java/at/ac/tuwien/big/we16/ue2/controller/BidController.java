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
import java.io.IOException;

/**
 * Created by Florian on 22.04.16.
 */
@WebServlet(name = "Bid", urlPatterns = {"/bid"})
public class BidController extends HttpServlet{

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    ProductService productService = new ProductService();
    UserService userService = new UserService();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        Long productId = Long.parseLong((String) request.getParameter("productId"));
        Product product = productService.getProductById(productId);
        System.out.println(product);

        Double currentBid = product.getCurrentBid();
        Double newBid = Double.parseDouble((String) request.getParameter("bid"));

        String email = (String) request.getParameter("email");
        User user = userService.getUserByEmail(email);
        if (user.getCredit() >= newBid) {
            if (currentBid < newBid) {
                product.setCurrentBid(newBid);
                product.setBidder(user);
                user.setCredit(user.getCredit()-newBid);
                try {
                    response.setContentType("text/plain");
                    response.setCharacterEncoding("UTF-8");
                    response.getWriter().write("{\"name\" : \"" + user.getFirstName() + " " + user.getLastName() +"\", \"bid\" : \""+ newBid.toString() + "\"}");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                return;
            }
        }
    }
}



 /*   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        Double bid = Double.parseDouble((String) request.getAttribute("bid"));
        System.out.println("Bid: " + bid);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

    }*/
/*    @ServerEndpoint(value = "/doBid", decoders=UserDec.class)
    public class Server {
        @OnMessage
        public void onMessage(Session session, User user) {
            session.getAsyncRemote().sendText("Hallo!" + user.getFirstName());
        }
    }

    public class UserDec implements Decoder.Text<User> {
        @Override
        public User decode(String data) {
            return ; }
        @Override public boolean willDecode(String data) {
            return "User".equals(data); }

        @Override
        public void init(EndpointConfig endpointConfig) {

        }

        @Override
        public void destroy() {

        }

    }
}*/
