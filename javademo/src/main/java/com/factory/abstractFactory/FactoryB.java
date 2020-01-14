package com.factory.abstractFactory;


import com.factory.simpleFactory.Product;
import com.factory.simpleFactory.ProductB;

public class FactoryB implements IFactory {
  @Override
  public Product createProduct() {
    return new ProductB();
  }

  @Override
  public Gift createGift() {
    return null;
  }
}
