package at.ac.tuwien.big.we16.ue2.controller;

import at.ac.tuwien.big.we16.ue2.models.Product;
import at.ac.tuwien.big.we16.ue2.models.User;

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
@WebServlet(name = "User", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    public LoginController(){super();}

    private Map<String, User> userPool = new HashMap<>(); //performance
    private LinkedList<Product> products=new LinkedList<>();

    public void getProducts (){
    int productCount=2;
        //Long productId, String name, Double currentBid, User bidder, String pictureLocation, String pictureDescription, SimpleDateFormat endDate
        Product FortyLicks = new Product(1l, "Forty Licks", 0.0, null,  "resources/images/rolling_stones.png", null, new SimpleDateFormat("19-04-2016"));
        Product TheMartian = new Product(2l, "The Martian", 0.0, null,  "resources/images/the_martian.png", null, new SimpleDateFormat("19-04-2016"));
        Product TheGodfather = new Product(3l, "The Godfather", 0.0, null, "resources/images/the_godfather.png", null, new SimpleDateFormat("19-04-2016"));

            products.add(FortyLicks);
            products.add(TheMartian);
            products.add(TheGodfather);

    }

    public void getUsers() {

        //Add dummy data
        User Florian = new User(1l, "Florian", "Lechleitner", "fl@huangart.at", "1234", 1500.00, new SimpleDateFormat("31-12-1989"));
        User Daniel = new User(2l, "Daniel", "Ly", "daniel.ly@gmx.at", "1234", 1500.0, new SimpleDateFormat("24-01-1995"));
        User Klaus = new User(3l, "Klaus", "Rirsch", "klaus.rirsch@gmx.net", "1234", 1500.0, new SimpleDateFormat("01-01-1999"));

        userPool.put(Florian.getEmail(), Florian);
        userPool.put(Daniel.getEmail(), Daniel);
        userPool.put(Klaus.getEmail(), Klaus);

    }
    public void addUser(User user){
        userPool.put(user.getEmail(), user);
    }


    public void init(ServletConfig config) throws ServletException {
        super.init(config);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*        if(request.getParameter("action").equals("login")) {
            HttpSession session = request.getSession(true);
            User user = userPool.get(request.getParameter("email"));
            session.setAttribute("user", user);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
        }*/

        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/login.jsp");
        view.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        if(userPool.isEmpty()) {
            getUsers();
        }
        if(!request.getParameter("email").equals("")&& !request.getParameter("password").equals("")) {
            HttpSession session = request.getSession(true);
            String email= request.getParameter("email");
            String password= request.getParameter("password");
            User dummy= userPool.get(email);
            if(dummy!=null){
                if(dummy.getPassword().equals(password)) {
                    session.setAttribute("user", dummy);
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/overview.jsp");
                    try {
                        if(products.isEmpty()) {
                            getProducts();
                        }
                        request.setAttribute("products", products);
                        dispatcher.forward(request, response);
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            } else {
                try {
                    RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/login.jsp");
                    view.forward(request, response);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
