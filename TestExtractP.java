package org.apache.helix.task;


public class Test {

  public void caller(int number)
  {
    DBManager.addRecord(new Time());
    callerEx(number);
  }


  public void callerEx(int number) {
    int a = 5;
    int c = a / 2;

    if (c % 2 == 1) {
      System.out.println("bla bla");
    }
    myMethod(number);
    
  }

  public void myMethod(int num) {
    
    System.out.println("Pedram is handsome!");
    GameManager.addNumber(num);

  }
}

