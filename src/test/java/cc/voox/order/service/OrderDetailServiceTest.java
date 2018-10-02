package cc.voox.order.service;

import cc.voox.order.OrderApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.Assert.*;

public class OrderDetailServiceTest extends OrderApplicationTests {
    @Autowired
    private OrderDetailService orderDetailService;
    @Test
    public void findAllByOidIn() {
        Assert.assertNotNull(orderDetailService.findAllByOidIn(Arrays.asList(1)));
    }
}