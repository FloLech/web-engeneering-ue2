package at.ac.tuwien.big.we16.ue2.controller;

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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Florian on 19.04.16.
 */
@WebServlet(name = "User", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

    public UserController(){super();}

    private Map<String, User> userPool = new HashMap<>();

    public void getUsers() {

        //Add dummy data
        User Florian = new User(1l, "Florian", "Lechleitner", "fl@huangart.at", "1234", 1500.00, new SimpleDateFormat("31-12-1989"));
        User Daniel = new User(2l, "Daniel", "Ly", "daniel.ly@gmx.at", "1234", 1500.0, new SimpleDateFormat("24-01-1995"));
        User Klaus = new User(3l, "Klaus", "Rirsch", "klaus.rirsche@gmx.net", "1234", 1500.5, new SimpleDateFormat("01-01-1999"));

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
}
