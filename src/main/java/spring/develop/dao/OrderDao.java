package spring.develop.dao;

import spring.develop.models.Order;
import java.util.List;

/**
 * Created by Alex on 22.10.2016.
 */
public interface OrderDao {

    void post(Order order);
    List<Order> get();
}
