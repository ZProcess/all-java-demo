package com.templateMethod;

public abstract class DodishTemplate {
  /**
   * 具体的整个过程
   */
  protected void dodish(){
    this.money();
    this.preparation();
    this.doing();
    this.carriedDishes();
  }
  public void money(){
    System.out.println("取钱");
  }
  /**
   * 备料
   */
  public abstract void preparation();
  /**
   * 做菜
   */
  public abstract void doing();
  /**
   * 上菜
   */
  public abstract void carriedDishes ();
}
