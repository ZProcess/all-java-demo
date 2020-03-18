package com.adapterPattern;

//类适配器类
class ClassAdapter extends Adaptee implements Target
{
  public void request()
  {
    specificRequest();
  }
}
