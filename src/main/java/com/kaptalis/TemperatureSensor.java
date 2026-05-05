package com.kaptalis;

public class TemperatureSensor {

  public boolean isSafe(double temperature) {
    return temperature >= 2.0 && temperature <= 8.0;
  }

}
