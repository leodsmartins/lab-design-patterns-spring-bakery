package one.digitalinnovation.lab_design_patterns_spring_bakery.factory;

import one.digitalinnovation.lab_design_patterns_spring_bakery.model.Cake;
import one.digitalinnovation.lab_design_patterns_spring_bakery.model.ChocolateCake;
import org.springframework.stereotype.Component;

@Component("chocolate")
public class ChocolateBakery extends Bakery {

  @Override
  protected Cake createCake() {
    return new ChocolateCake();
  }
}
