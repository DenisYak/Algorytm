package algorytm.lesson2;
import java.util.Arrays;

/*
**** Создать массив (тысячу элементов).
**** Описать метод который бы удалял все вхождения данного значения в массив
**** Написать методы удаления, добавления, поиска элемента массива.
**** Заполнить массив случайными числами.
**** Написать методы, сортировок и вывести на экран количество
     действий и сравнить его со сложностью сортировки.
*/


public class Main {

    public static void main(String[] args) {
// Создать массив (тысячу элементов).

        MyArray ma = new MyArray(1000);
        ma.showMyArray();
        ma.fillMyArrayRandomly();
        ma.showMyArray();
        System.out.println(ma.searchAllEntry2(2));

        System.out.println(Arrays.toString(ma.deleteAllEntry2(2)));

        // при 1000 элементах в массиве сортировка пузырьком за ~225000 шагов, сложность O(n^2)
//        ma.sortBubble();

        // при 1000 элементах в массиве сортировка выбором за 1000 шагов, сложность O(n^2)
//        ma.sortSelect();

        // при 1000 элементах в массиве сортировка выбором за 1000 шагов, сложность O(n^2)
        ma.sortInsert();


//        ma.showMyArray();

    }
}
