package spring.develop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.develop.dao.OrderDao;
import spring.develop.models.Order;

import java.util.List;

/**
 * Created by Alex on 22.10.2016.
 */
@Service("storageService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao dao;

    @Transactional
    @Override
    public void post(Order order) {
        dao.post(order);
    }

}
