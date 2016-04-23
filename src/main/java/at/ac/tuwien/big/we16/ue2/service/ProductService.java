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

        Product FortyLicks = new Product(1l, "Forty Licks", 0.0, null,  "resources/images/rolling_stones.png", null, "2016,04,23,14,00,19,796");
        Product TheMartian = new Product(2l, "The Martian", 0.0, null,  "resources/images/the_martian.png", null, "2016,04,23,14,01,19,796");
        Product TheGodfather = new Product(3l, "The Godfather", 0.0, null, "resources/images/the_godfather.png",null, "2016,04,23,14,02,19,796");

        products.put(FortyLicks.getProductId(), FortyLicks);
        products.put(TheMartian.getProductId(), TheMartian);
        products.put(TheGodfather.getProductId(), TheGodfather);
    }


    public Map<Long, Product> getProducts (){

        System.out.println(products.toString());

        return products;

    }

    public Product getProductById(Long id) {
        return products.get(id);

    }

}
