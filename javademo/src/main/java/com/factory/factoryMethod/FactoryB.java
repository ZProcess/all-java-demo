package com.factory.factoryMethod;


import com.factory.simpleFactory.Product;
import com.factory.simpleFactory.ProductB;

public class FactoryB implements IFactory {
  @Override
  public Product createProduct() {
    return new ProductB();
  }

}
