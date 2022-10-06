package com.company;

public class Storage {
     int came; //прийшло
     int capacity; //вміщає
     int retorn; // на повернення
     int s;

     public Storage(int came, int capacity, int retorn){
          super();
          this.retorn = retorn;
          this.came = came;
          this.capacity = capacity;
     }
     void info(){
          System.out.println("У міщає склад: " +capacity);
          System.out.println("Прийшло товару: " +came);
          System.out.println("Відправлено на повернення: "+retorn);
     }
     int retor(){
          s = came - retorn;
          return s;
     }
     int remainder(){
          int d;
          d = capacity - s;
          return d;
     }
       static void  discount(){
          System.out.println("Знижка");
     }
}
