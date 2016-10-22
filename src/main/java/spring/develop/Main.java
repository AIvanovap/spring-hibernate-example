package spring.develop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.develop.models.Order;
import spring.develop.services.OrderService;
import spring.develop.services.OrderServiceImpl;

/**
 * Created by Alex on 22.10.2016.
 */
public class Main {
//    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
        OrderService service = (OrderService) context.getBean("storageService");
        Order order = new Order();
        order.setClientName("Alex");
        order.setClientEmail("alex@email");
        order.setMessage("alexMessage");
        service.post(order);

    }
}
