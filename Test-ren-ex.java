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
    int temp = anotherOne(number);
    
  }

  public void anotherOne(int num) { //prime factor counter
    int primeFactors = 0;
    for (int i = 2 ; i <= num ; i++)
    {
      boolean prime = true;
      for (int j = 2 ; j < i ; j++)
      {
        if (i % j == 0)
        {
          prime = true;
          break;
        }
      }

      System.out.println("Finished");
      // if (!prime) continue;
      // if (num % i == 0)
      // {
      //   primeFactors += 1;
      // }
    }
    // wait(primeFactors);
  }
}

