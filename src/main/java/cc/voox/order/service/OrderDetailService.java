package cc.voox.order.service;

import cc.voox.order.model.OrderDetail;
import cc.voox.order.model.repository.OrderDetailDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailDAO orderDetailDAO;

    public List<OrderDetail> findAllByOidIn(List<Integer> oids) {
        return orderDetailDAO.findAllByOidIn(oids);
                
    }

    public List<OrderDetail> findAll() {
        return orderDetailDAO.findAll();

    }
}
