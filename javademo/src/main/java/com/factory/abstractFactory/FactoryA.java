package com.factory.abstractFactory;


import com.factory.simpleFactory.Product;
import com.factory.simpleFactory.ProductA;

public class FactoryA implements IFactory {
  @Override
  public Product createProduct() {
    return new ProductA();
  }

  @Override
  public Gift createGift() {
    return new GiftA();
  }

  public static void main(String[] args) {
    IFactory factoryA = new FactoryA();

    Product productA = factoryA.createProduct();
    System.out.println("productA name="+productA.getName()+",getPrice:"+productA.getPrice());

    IFactory factoryB = new FactoryB();

    Product productB = factoryB.createProduct();
    System.out.println("productB name="+productB.getName()+",getPrice:"+productB.getPrice());

  }
}
