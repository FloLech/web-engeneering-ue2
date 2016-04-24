package at.ac.tuwien.big.we16.ue2.service;

import at.ac.tuwien.big.we16.ue2.models.Product;
import at.ac.tuwien.big.we16.ue2.models.Product_List;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Florian on 22.04.16.
 */
public class ProductService {

    public static Map<Long, Product> products = new HashMap<>();

    static {
        Product[] checkRuntime = {
                new Product(1l, "Forty Licks", 0.0, null, "images/rolling_stones.png", null, "2016,04,24,20,06,20,000"),
                new Product(2l, "The Martian", 0.0, null, "images/the_martian.png", null, "2016,04,24,04,43,19,000"),
                new Product(3l, "The Godfather", 0.0, null, "images/the_godfather.png", null, "2016,04,24,20,08,19,000"),
                new Product(4L, "Metallica", 0.0, null, "images/metallica.png", null,  "2016,04,28,14,54,20,000"),
                new Product(5L, "Red Hot Chili Peppers", 0.0, null, "images/red_hot_chili_peppers.png", null, "2016,04,24,17,08,19,000"),
                new Product(6L, "Pride and Prejudice", 0.0, null, "images/pride_and_prejudice.png", null, "2016,04,25,17,08,19,000"),
                new Product(7L, "The Wizard of Oz", 0.0, null, "images/the_wizard_of_oz.png", null, "2016,04,24,17,08,19,000"),
                new Product(8L, "The Great Gatsby", 0.0, null, "images/the_great_gatsby.png", null, "2016,04,24,17,08,19,000"),
                new Product(9L, "1984", 0.0, null, "images/1984.png", null, "2016,04,25,17,08,19,796")};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy,MM,dd HH,mm,ss,SSS");
        //get current date time with Date()
        String date = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(new Date());

        String[] partsToday = date.split("-");

        Product_List beanME = new Product_List(checkRuntime);
        for (int i = 0; i < checkRuntime.length; i++) {
            products.put(checkRuntime[i].getProductId(),checkRuntime[i]);
            String[] parts = checkRuntime[i].getEndDate().split(",");
            if (parts.length == partsToday.length) {
                for (int j = 0; j < parts.length; j++) {
                    if (Integer.parseInt(parts[j]) > Integer.parseInt(partsToday[j])) {
                        checkRuntime[i].setRunning(true);
                        j = parts.length;
                    } else if (Integer.parseInt(parts[j]) < Integer.parseInt(partsToday[j])) {
                        checkRuntime[i].setRunning(false);
                        j = parts.length;
                    }
                }
            }
        }
        beanME.setRunningCount();
    }


    public Map<Long, Product> getProducts() {
        return products;
    }


    public Product getProductById(Long id) {
        return products.get(id);

    }
}


