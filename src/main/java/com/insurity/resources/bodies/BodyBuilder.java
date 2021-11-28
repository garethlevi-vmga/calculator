package com.insurity.resources.bodies;

import java.math.BigDecimal;

/**
 * @author garethlevi
 */
public class BodyBuilder {

  public static NotImplemented notImplemented() {
    return new NotImplemented();
  }

  public static Version version(final String version) {
    return new Version(version);
  }

  public static Sum sum(final BigDecimal sum) {
    return new Sum(sum);
  }

}
