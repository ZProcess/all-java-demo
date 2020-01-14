package com.factory.simpleFactory;

public class Factory {

  /**
   * 根据生产类型生产对应的产品
   *
   * @param type
   * @return
   */
  public static Product createProduct(String type) {
    Product product = null;
    switch (type) {
      case "A":
        product = new ProductA();
        break;
      case "B":
        product = new ProductB();
        break;
      case "C":
        product = new ProductC();
        break;
    }
    return product;
  }

  public static void main(String[] args) {
    Product productA = Factory.createProduct("A");
    System.out.println("productA name="+productA.getName()+",getPrice:"+productA.getPrice());

    Product productB = Factory.createProduct("B");
    System.out.println("productB name="+productB.getName()+",getPrice:"+productB.getPrice());

    Product productC = Factory.createProduct("C");
    System.out.println("productC name="+productC.getName()+",getPrice:"+productC.getPrice());
  }
}
