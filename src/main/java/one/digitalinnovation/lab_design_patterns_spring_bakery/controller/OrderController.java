package one.digitalinnovation.lab_design_patterns_spring_bakery.controller;

import one.digitalinnovation.lab_design_patterns_spring_bakery.model.Order;
import one.digitalinnovation.lab_design_patterns_spring_bakery.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping("/{type}")
  public Order placeOrder(@PathVariable String type) {
    return orderService.placeOrder(type);
  }

  @GetMapping
  public List<Order> findAll() {
    return orderService.findAll();
  }
}
