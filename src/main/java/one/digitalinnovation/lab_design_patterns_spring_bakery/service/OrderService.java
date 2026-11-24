package one.digitalinnovation.lab_design_patterns_spring_bakery.service;

import one.digitalinnovation.lab_design_patterns_spring_bakery.exception.BakeryNotFoundException;
import one.digitalinnovation.lab_design_patterns_spring_bakery.factory.Bakery;
import one.digitalinnovation.lab_design_patterns_spring_bakery.model.Cake;
import one.digitalinnovation.lab_design_patterns_spring_bakery.model.Order;
import one.digitalinnovation.lab_design_patterns_spring_bakery.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderService {

  private final Map<String, Bakery> bakeries;
  private final OrderRepository orderRepository;

  public OrderService(Map<String, Bakery> bakeries, OrderRepository orderRepository) {
    this.bakeries = bakeries;
    this.orderRepository = orderRepository;
  }

  public Order placeOrder(String type) {
    Bakery bakery = bakeries.get(type);
    if (bakery == null) {
      throw new BakeryNotFoundException(type);
    }
    Cake cake = bakery.bakeCake();
    return orderRepository.save(cake);
  }

  public List<Order> findAll() {
    return orderRepository.findAll();
  }
}
