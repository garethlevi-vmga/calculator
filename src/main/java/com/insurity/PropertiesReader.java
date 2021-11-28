package com.insurity;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author garethlevi
 */
public class PropertiesReader {

  private final Properties properties;

  public PropertiesReader(String fileName) throws IOException {
    InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
    this.properties = new Properties();
    this.properties.load(inputStream);
  }

  /**
   * Retrieve the value of the specified property.
   *
   * @param name
   * @return
   */
  public String getProperty(String name) {
    return properties.getProperty(name);
  }

}
