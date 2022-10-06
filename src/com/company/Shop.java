package com.company;

public class Shop {
    int comics; //комікс
    int book; //книжка
    int magazine; //журнал

    public Shop(int comics, int book, int magazine) {
        super();
        this.magazine = magazine;
        this.comics = comics;
        this.book = book;
    }

    static void discount(){
        System.out.println("Знижка з бонусною картою");
    }

    void number() {
        System.out.println("Кількість книжок: " + book);
        System.out.println("Кількість журналів: " + magazine);
        System.out.println("Кількість коміксів: " + comics);
    }

    int cum() {
        int a;
        a = magazine + comics + book;
        return a;
    }
}


