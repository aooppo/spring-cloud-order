package cc.voox.order.model.repository;

import cc.voox.order.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {
    List<OrderDetail> findAllByOidIn(List<Integer> oids);
}
