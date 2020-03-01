package com.builderPattern;

public class ConcreteBuilder extends Builder {

  @Override
  public void buildPartA() {
    product.setPartA("建造 PartA");
  }

  @Override
  public void buildPartB() {
    product.setPartA("建造 PartB");
  }

  @Override
  public void buildPartC() {
    product.setPartA("建造 PartC");
  }
}
