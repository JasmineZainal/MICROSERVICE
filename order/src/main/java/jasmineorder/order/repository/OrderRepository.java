package jasmineorder.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jasmineorder.order.model.order;

@Repository
public interface OrderRepository extends JpaRepository<order, Long> {

}