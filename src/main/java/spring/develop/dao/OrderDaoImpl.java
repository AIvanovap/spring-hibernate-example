package spring.develop.dao;

import org.springframework.stereotype.Repository;
import spring.develop.models.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alex on 22.10.2016.
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    @PersistenceContext
    private EntityManager em;

    public void post(Order order) {
        System.out.println("    PERSIST  ");
        em.persist(order);
    }

    public List<Order> get() {
        return  em.createQuery("select o from orders o", Order.class).getResultList();
    }
}
