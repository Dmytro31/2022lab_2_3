package com.company;

public class PayOffice {
    double profit; //заробіток
    double costs;  //Витрати
    double salary;  //зп

    public PayOffice(int profit, int salary, int costs){
        this.salary = salary;
        this.profit = profit;
        this.costs = costs;
    }
    int zp(int profit, int costs , int salary){
        int c = costs+salary;
        return profit-c;
    }
    void info(){
        System.out.println("Заробіто за місяць: " +profit);
        System.out.println("Витрати на замовлення: " +costs);
        System.out.println("Заробітна плата: " +salary);
    }
    double zp(){
        double c = costs+salary;
        return profit-c;
    }
    static void discount(){
        System.out.println("Знижка за замовлиня");
    }

}
