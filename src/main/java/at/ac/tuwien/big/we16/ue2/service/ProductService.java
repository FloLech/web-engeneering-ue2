package at.ac.tuwien.big.we16.ue2.service;

import at.ac.tuwien.big.we16.ue2.models.Product;

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
                new Product(1l, "Forty Licks", 0.0, null, "resources/images/rolling_stones.png", null, "2016,04,23,20,52,20,000"),
                new Product(2l, "The Martian", 0.0, null, "resources/images/the_martian.png", null, "2016,04,25,18,01,19,000"),
                new Product(3l, "The Godfather", 0.0, null, "resources/images/the_godfather.png", null, "2016,04,26,14,02,19,000"),
                new Product(4L, "Metallica", 0.0, null, "resources/images/metallica.png", null, "2016,04,24,14,02,19,000"),
                new Product(5L, "Red Hot Chili Peppers", 0.0, null, "resources/images/red_hot_chili_peppers.png", null, "2016,04,24,17,08,19,000"),
                new Product(6L, "Pride and Prejudice", 0.0, null, "resources/images/pride_and_prejudice.png", null, "2016,04,25,17,08,19,000"),
                new Product(7L, "The Wizard of Oz", 0.0, null, "resources/images/the_wizard_of_oz.png", null, "2016,04,24,17,08,19,000"),
                new Product(8L, "The Great Gatsby", 0.0, null, "resources/images/the_great_gatsby.png", null, "2016,04,24,17,08,19,000"),
                new Product(9L, "1984", 0.0, null, "resources/images/1984.png", null, "2016,04,25,17,08,19,796")};

        for (int i = 0; i < checkRuntime.length; i++) {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy,MM,dd HH,mm,ss,SSS");
            //get current date time with Date()
            Date date = new Date();
            System.out.println(dateFormat.format(date));
            System.out.println(checkRuntime[i].getEndDate());
            try {

            }catch (Exception e){
                e.printStackTrace();
            }

            products.put(checkRuntime[i].getProductId(), checkRuntime[i]);
        }
    }


    public Map<Long, Product> getProducts (){

        System.out.println(products.toString());

        return products;

    }

    public Product getProductById(Long id) {
        return products.get(id);

    }

}
