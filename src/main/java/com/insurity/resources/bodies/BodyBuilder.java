package com.insurity.resources.bodies;

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

}
