package com.hash;

public class RotatingHash {
  public static String a="ab";
  public static String b="bc";
  public static void main(String[] args) {
    System.out.println(getHash(a,7));
    System.out.println(getHash(b,7));
  }
  public static int getHash(String key ,int prime){
    int hash=key.length();
    int i;
    for ( i=0; i<key.length(); ++i) {
      hash = (hash << 4) ^ (hash >> 28) ^ key.charAt(i);
    }
    return (hash % prime);
  }
}
