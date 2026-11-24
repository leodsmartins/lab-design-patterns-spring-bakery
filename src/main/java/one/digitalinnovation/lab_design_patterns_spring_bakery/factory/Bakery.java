package one.digitalinnovation.lab_design_patterns_spring_bakery.factory;

import one.digitalinnovation.lab_design_patterns_spring_bakery.model.Cake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Bakery {

  private static final Logger log = LoggerFactory.getLogger(Bakery.class);

  protected abstract Cake createCake();

  public Cake bakeCake() {
    Cake cake = createCake();
    log.info("Preparando a massa do {}", cake.getName());
    log.info("Assando o {}", cake.getName());
    log.info("Decorando o {}", cake.getName());
    return cake;
  }
}
