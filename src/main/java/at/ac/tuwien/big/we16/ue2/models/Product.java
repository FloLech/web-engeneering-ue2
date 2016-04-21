package at.ac.tuwien.big.we16.ue2.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Florian on 19.04.16.
 */
public class Product {
    private Long productId;
    private String name;
    private Double currentBid;
    private User bidder;
    private String pictureLocation;
    private String pictureDescription;
    private SimpleDateFormat endDate;

    public Product(Long productId, String name, Double currentBid, User bidder, String pictureLocation, String pictureDescription, SimpleDateFormat endDate) {
        this.productId = productId;
        this.name = name;
        this.currentBid = currentBid;
        this.bidder = bidder;
        this.pictureLocation = pictureLocation;
        this.pictureDescription = pictureDescription;
        this.endDate = endDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(Double currentBid) {
        this.currentBid = currentBid;
    }

    public User getBidder() {
        return bidder;
    }

    public void setBidder(User bidder) {
        this.bidder = bidder;
    }

    public String getPictureLocation() {
        return pictureLocation;
    }

    public void setPictureLocation(String pictureLocation) {
        this.pictureLocation = pictureLocation;
    }

    public String getPictureDescription() {
        return pictureDescription;
    }

    public void setPictureDescription(String pictureDescription) {
        this.pictureDescription = pictureDescription;
    }

    public SimpleDateFormat getEndDate() {
        return endDate;
    }

    public void setEndDate(SimpleDateFormat endDate) {
        this.endDate = endDate;
    }
}