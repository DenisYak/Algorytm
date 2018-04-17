package algorytm.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// Создать массив (тысячу элементов).

        MyArray ma = new MyArray(10);
        ma.showMyArray();
        ma.fillMyArrayRandomly();
        ma.showMyArray();
        ma.searchAllEntry(2);

        System.out.println(Arrays.toString(ma.searchAllEntry(2)));

//
//        ma.delete(5);
//        ma.showMyArray();
//
//        ma.sortBubble();
//        ma.showMyArray();


    }

/*
**** Создать массив (тысячу элементов).
**** Описать метод который бы удалял все вхождения данного значения в массив
**** Написать методы удаления, добавления, поиска элемента массива.
**** Заполнить массив случайными числами.
**** Написать методы, сортировок и вывести на экран количество
     действий и сравнить его со сложностью сортировки.
*/

}
