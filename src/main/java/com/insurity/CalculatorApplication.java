package com.insurity;

import com.insurity.resources.BasicOperatorsResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CalculatorApplication extends Application<CalculatorConfiguration> {

  public static void main(final String[] args) throws Exception {
    new CalculatorApplication().run(args);
  }

  @Override
  public String getName() {
    return "Calculator";
  }

  @Override
  public void initialize(final Bootstrap<CalculatorConfiguration> bootstrap) {
    // TODO: application initialization
  }

  @Override
  public void run(final CalculatorConfiguration configuration, final Environment environment) {
    environment.jersey().register(new BasicOperatorsResource());
  }

}
