package at.ac.tuwien.big.we16.ue2.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Florian on 19.04.16.
 */
public class User {
    private Long userID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Double credit;
    private SimpleDateFormat birthDate;
    private int running;
    private int won;
    private int lost;

    public User(Long userID, String firstName, String lastName, String email, String password, Double credit, SimpleDateFormat birthDate, int running, int won, int lost) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.credit = credit;
        this.birthDate = birthDate;
        this.running = running;
        this.won = won;
        this.lost = lost;
    }

    public User (){}

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public SimpleDateFormat getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(SimpleDateFormat birthDate) {
        this.birthDate = birthDate;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public String toString (){
        return "Email:"+this.getEmail()+" Password"+this.getPassword();
    }
}
