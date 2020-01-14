package com.factory.simpleFactory;

public class ProductC implements Product {
  @Override
  public int getPrice() {
    return 300;
  }

  @Override
  public String getName() {
    return "ProductC";
  }
}
