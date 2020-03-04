package com.spring;

import org.springframework.beans.BeanUtils;

public class CopyTest {

  public static void main(String[] args) {
    User user = new User();
    user.setAge(11);
    user.setArr("hhhhhh");
    user.setName("xiaoming");
    CopyUser copyUser = new CopyUser();
    System.out.println(copyUser.toString());
    BeanUtils.copyProperties(user,copyUser);
    System.out.println(copyUser.toString());
  }
}
