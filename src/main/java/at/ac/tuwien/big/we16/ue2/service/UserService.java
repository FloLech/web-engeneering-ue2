package at.ac.tuwien.big.we16.ue2.service;

import at.ac.tuwien.big.we16.ue2.models.Product;
import at.ac.tuwien.big.we16.ue2.models.User;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Florian on 22.04.16.
 */
public class UserService {

    public static Map<String, User> userPool = new HashMap<>();

    static {
        //Add dummy data
        User Florian = new User(1l, "Florian", "Lechleitner", "fl@huangart.at", "1234", 1500.00, new SimpleDateFormat("31-12-1989"), 0, 0, 0);
        User Daniel = new User(2l, "Daniel", "Ly", "daniel.ly@gmx.at", "1234", 1500.0, new SimpleDateFormat("24-01-1995"), 0, 0, 0);
        User Klaus = new User(3l, "Klaus", "Rirsch", "klaus.rirsch@gmx.net", "1234", 1500.0, new SimpleDateFormat("01-01-1999"), 0, 0, 0);

        userPool.put(Florian.getEmail(), Florian);
        userPool.put(Daniel.getEmail(), Daniel);
        userPool.put(Klaus.getEmail(), Klaus);
    }


    public Map<String, User> getUseres (){
        System.out.println(userPool.toString());
        return userPool;
    }

    public User getUserByEmail(String email) {
        return userPool.get(email);
    }
}
