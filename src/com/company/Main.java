package com.company;

public class Main {

    public static void main(String[] args) {
        Shop sp = new Shop(1003, 553, 223);
        sp.discount();
        System.out.println("Кількість товару в магазині: " +sp.cum());
        sp.number();
        System.out.println("________________________________________");
        System.out.println(               "Товарний склад"           );
        Storage sg = new Storage(250, 500, 16);
        sg.discount();
        sg.info();
        System.out.println("Якісний товар: " +sg.retor());
        System.out.println("Залишок місця на складі: " +sg.remainder());

        System.out.println("________________________________________");
        PayOffice po = new PayOffice(457668, 15000, 7000);
        po.discount();
        po.info();
        System.out.println("Чистий прибуток: " +po.zp(56767676,6456,5645));
        Person person = new Person();
        person.name = "Олег";
        person.surname = "Олегов";
        person.position = "Директор";
        System.out.println(person.position +" - "+person.name+ " "+person.surname);


    }
}
