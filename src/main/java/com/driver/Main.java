package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj = new RWOnly();
      /*try{
        obj.name = "Abdul";
      }
      catch(Exception e){
        System.out.println(e);
    }*/
      //name has private access in com.driver.RWOnly
      obj.setName("Abdul");
      System.out.println(obj.getName());
  }
}