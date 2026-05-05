package com.kaptalis;

public class TemperatureSensor {

  public boolean isSafe(double temperature) {
    return (temperature >= 0.0 && temperature <= 8.0);
  }

}
