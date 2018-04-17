package algorytm.lesson2;

import java.util.Arrays;

public class MyArray {
    private int[] arr;
    private int size;
    private int current;
    private boolean isSorted = false;

    MyArray(int size) {
        this.arr = new int[size];
        this.current = size;
    }

    void showMyArray () {
        for (int i = 0; i < this.current; i++) {
            System.out.print(this.arr[i] + ", ");
        }
        System.out.println();
//        System.out.println(Arrays.toString(arr));
    }

    void fillMyArrayRandomly () {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = 0 + (int) (Math.random() * 10);
        }

    }

    public int[] searchAllEntry(int value) {
        int countOfMatches = 0;
        for (int j = 0; j < this.arr.length; j++) {
            if (this.arr[j] == value) {
                countOfMatches++;
            }
        }
        int [] countOfMatchesArray = new int[countOfMatches];
        int temp = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == value) {
                countOfMatchesArray[temp] = i;
                temp++;
            }
        }return countOfMatchesArray;
    }

    public void deleteAllEntry(int value) {
        for (int i = 0; i < searchAllEntry(value).length; i++) {
            System.arraycopy(this.arr, searchAllEntry(value)[i] + 1,
                    this.arr, searchAllEntry(value)[i],
                    this.current - searchAllEntry(value)[i] - 1);
            this.current--;
        }
    }

    public int searchOneEntry(int value) {
        for (int i = 0; i < this.current; i++) {
            if (this.arr[i] == value)
                return i;
        }
        return -1;
    }

    boolean deleteOneEntry(int value) {
        int index = searchOneEntry(value);
        if (index != -1) {
            System.arraycopy(this.arr, index + 1,
                    this.arr, index,
                    this.current - index - 1);
            this.current--;
            return true;
        }
        return false;
    }









    void insert(int value) {
        if (this.current == this.arr.length) {
            int[] newArr = new int[current * 2];
            System.arraycopy(this.arr, 0, newArr, 0, current);
            this.arr = newArr;
        }
        this.arr[this.current] = value;
        this.current++;
    }

    private void change(int a, int b) {
        int temp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = temp;
    }

    public void sortBubble() {
        for (int i = current - 1; i > 1; i--)
            for (int j = 0; j < i; j++)
                if (this.arr[j] > this.arr[j + 1])
                    change(j, j + 1);
        this.isSorted = true;
    }

    @Override
    public String toString() {
        if (arr == null)
            return "null";
        int iMax = current - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(arr[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }






}
