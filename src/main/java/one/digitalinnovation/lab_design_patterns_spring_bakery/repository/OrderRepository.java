package one.digitalinnovation.lab_design_patterns_spring_bakery.repository;

import one.digitalinnovation.lab_design_patterns_spring_bakery.model.Cake;
import one.digitalinnovation.lab_design_patterns_spring_bakery.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class OrderRepository {

  private final List<Order> orders = new CopyOnWriteArrayList<>();
  private final AtomicLong nextId = new AtomicLong(1);

  public Order save(Cake cake) {
    Order order = new Order(nextId.getAndIncrement(), cake);
    orders.add(order);
    return order;
  }

  public List<Order> findAll() {
    return List.copyOf(orders);
  }
}
