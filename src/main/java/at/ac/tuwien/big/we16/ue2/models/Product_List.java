package at.ac.tuwien.big.we16.ue2.models;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by krirs on 23.04.2016.
 for usage as bean in sidebarjsp to determine the list of running auctions
 problems may occur if auctions expire during sessions since the running flag is set on startup (currently not at all)
 */

public class Product_List {
    public Product_List(){}


    List<Product> products=new LinkedList<>();
    private static int runningCount=0;

    public Product_List ( Product []products){
        for(int i=0; i<products.length;i++){
            this.products.add(products[i]);
        }
    }

    public void setRunningCount (){
        for(Product p: products){
                if(p.getRunning())
                    this.runningCount++;
            }
        }

    public void setRunningCountDynamic(){
        this.runningCount = 0;
        for(Product p: products){
            if(p.getRunning())
                this.runningCount++;
        }
    }

    public int getRunningCount(){
        return this.runningCount;
    }

}
