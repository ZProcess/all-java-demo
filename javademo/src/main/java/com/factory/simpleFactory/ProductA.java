package com.factory.simpleFactory;

public class ProductA implements Product {

  @Override
  public int getPrice() {
    return 100;
  }

  @Override
  public String getName() {
    return "ProductA";
  }
}
