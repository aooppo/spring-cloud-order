package cc.voox.order.controller;

import cc.voox.order.model.OrderDetail;
import cc.voox.order.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
//@RibbonClient(name = "product")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("orders")
    public List<OrderDetail> getAllOrders() {
        return orderDetailService.findAll();
    }


    @RequestMapping("test")
    public String msg() {
//        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance si = loadBalancerClient.choose("product");
        String url = String.format("http://%s:%s/%s", si.getHost(), si.getPort(), "msg");
        RestTemplate rs = new RestTemplate();
        String resp = rs.getForObject(url, String.class);
//        return "test from order";

        return resp;
    }

}
