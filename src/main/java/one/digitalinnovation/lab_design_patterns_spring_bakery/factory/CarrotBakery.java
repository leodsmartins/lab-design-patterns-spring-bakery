package one.digitalinnovation.lab_design_patterns_spring_bakery.factory;

import one.digitalinnovation.lab_design_patterns_spring_bakery.model.Cake;
import one.digitalinnovation.lab_design_patterns_spring_bakery.model.CarrotCake;
import org.springframework.stereotype.Component;

@Component("carrot")
public class CarrotBakery extends Bakery {

  @Override
  protected Cake createCake() {
    return new CarrotCake();
  }
}
