package com.factory.abstractFactory;

import com.factory.simpleFactory.Product;

//抽象工厂能生产多种产品，工厂模式只能生产一种产品
public interface IFactory {
  Product createProduct();
  Gift createGift();
}
