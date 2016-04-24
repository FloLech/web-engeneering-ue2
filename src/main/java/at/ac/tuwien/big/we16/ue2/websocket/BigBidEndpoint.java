package at.ac.tuwien.big.we16.ue2.websocket;

import at.ac.tuwien.big.we16.ue2.models.Product;
import at.ac.tuwien.big.we16.ue2.service.NotifierService;
<<<<<<< HEAD
import at.ac.tuwien.big.we16.ue2.service.ProductService;
import javafx.scene.control.Alert;
=======
//import javafx.scene.control.Alert;
>>>>>>> 0faebeed228fb5245bbea188c6d22d768de053e8

import javax.servlet.http.HttpSession;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This endpoint listens on the /socket URL.
 */
@ServerEndpoint(value="/socket", configurator = BigBidConfigurator.class)
public class BigBidEndpoint {
    ProductService productService=new ProductService();
    private final NotifierService notifierService;

    public BigBidEndpoint(NotifierService notifierService) {
        this.notifierService = notifierService;
    }

    /**
     * When a new WebSocket connection is established, we register both the
     * socket session and the associated HTTP session with the notifier service.
     */
    @OnOpen
    public void onOpen(Session socketSession, EndpointConfig config) {
        System.out.println(socketSession.getId()+" connected");
        this.notifierService.register(socketSession, (HttpSession) config.getUserProperties().get(HttpSession.class.getName()));
    }

    /**
     * When a socket connection is closed, we remove its session from the
     * notifier service.
     */
    @OnClose
    public void onClose(Session socketSession) {
        this.notifierService.unregister(socketSession);
    }

    @OnMessage
    public void onMessage(Session session, String message ) {
        System.out.println("Session: "+ session.getId() +" message: " + message);

    if (message.equals("Timed out: 1")){

        session.getAsyncRemote().sendText("Time-Out!!");

    }


    }


}