package com.insurity;

import com.insurity.resources.BasicOperatorsResource;
import com.insurity.resources.ServiceInfoResource;
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
  public void run(final CalculatorConfiguration configuration, final Environment environment) throws Exception {
    PropertiesReader reader = new PropertiesReader("api.properties");
    final String version = reader.getProperty("api.version");
    environment.jersey().register(new ServiceInfoResource(version));
    environment.jersey().register(new BasicOperatorsResource());
  }

}
