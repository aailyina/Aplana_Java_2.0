package Task_4_2;

import Task_4_2.Elements.Bear;
import Task_4_2.Elements.Calculate;
import Task_4_2.Elements.Candy;
import Task_4_2.Elements.Lollipop;

public class General {
    public static void main(String[] args) {
        int fullVes=0;
        Bear bear = new Bear("Medved", 120, 1000, "Red");
        Candy candy = new Candy("Konfeta", 20, 500.23, "Krug");
        Lollipop lollipop = new Lollipop("chupik", 150, 15, "malina");
        Calculate[] box = {bear, candy, lollipop};
        System.out.println("Сформирован подарок: ");

        for (int i=0; i < box.length; i++) {
            System.out.println(box[i]);
        }

        System.out.println();
        System.out.print("Общий вес подарка в граммах = ");
        System.out.println(bear.getVes() + candy.getVes() + lollipop.getVes() + " gramm");
        System.out.print("Общая стоимость подарка в рублях = ");
        System.out.println(bear.getPrice() + candy.getPrice() + lollipop.getPrice() + " RUB");
    }
}