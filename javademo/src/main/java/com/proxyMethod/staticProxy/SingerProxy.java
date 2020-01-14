package com.proxyMethod.staticProxy;

public class SingerProxy implements ISinger {
  private ISinger iSinger;
  public SingerProxy(ISinger iSinger){
    this.iSinger = iSinger;
  }
  @Override
  public void sing() {
    System.out.println("向观众问好");
    iSinger.sing();
    System.out.println("谢谢大家");
  }

  public static void main(String[] args) {
    ISinger iSinger =new SingerProxy(new Singer());
    iSinger.sing();;

  }
}
