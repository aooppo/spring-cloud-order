package cc.voox.order.model.repository;

import cc.voox.order.OrderApplicationTests;
import cc.voox.order.model.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;


public class OrderDetailDAOTest extends OrderApplicationTests {

    @Autowired OrderDetailDAO orderDetailDAO;

//    @Test
    public void findAllByOidIn() {
        List<OrderDetail> orders = orderDetailDAO.findAllByOidIn(Arrays.asList(1, 2));
        Assert.assertNotNull(orders);
    }

    @Test
    public void save() {
        OrderDetail od = new OrderDetail();
        od.setName("welcome2");
        orderDetailDAO.save(od);
    }
}