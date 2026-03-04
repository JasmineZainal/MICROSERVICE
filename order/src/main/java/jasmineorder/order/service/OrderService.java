package jasmineorder.order.service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import jasmineorder.order.model.order;
import jasmineorder.order.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<order> getAllOrder() {
        return orderRepository.findAll();
    }

    public order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public order createOrder(order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}