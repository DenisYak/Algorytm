package algorytm.lesson2;

public class MyArray {
    private int[] arr;
    private int size;
    private int current;
    private boolean isSorted = false;

    MyArray(int size) {
        this.arr = new int[size];
        this.current = size;
    }

    // отображение массива
    void showMyArray () {
        for (int i = 0; i < this.current; i++) {
            System.out.print(this.arr[i] + ", ");
        }
        System.out.println();
    }

    // заполнение массива произвольными значениями
    void fillMyArrayRandomly () {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = 0 + (int) (Math.random() * 10);
        }
    }

    // поиск всех вхождений в массив
    public int searchAllEntry2(int value) {
        int countOfMatches = 0;
        for (int j = 0; j < this.arr.length; j++) {
            if (this.arr[j] == value) {
                countOfMatches++;
            }
        } return countOfMatches;
    }

    // удаление всех вхождений указанного значения из массива
    public int[] deleteAllEntry2(int value) {
        int [] newarr = new int[arr.length - searchAllEntry2(value)];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                newarr[k] = arr[i];
                k++;
            }
        }return newarr;
    }

    // добавление элемента в массив
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

    // сортировка пузьком
    public void sortBubble() {
        int steps = 0;
        for (int i = current - 1; i > 1; i--)
            for (int j = 0; j < i; j++)
                if (this.arr[j] > this.arr[j + 1]) {
                    change(j, j + 1);
                    steps++;
                }
        this.isSorted = true;
        System.out.println("sortBubble steps: " + steps);
    }

    // сортировка выбором
    public void sortSelect() {
        int steps = 0;
        for (int out = 0; out < this.current; out++) {
            int pos = out;
            for (int in = out + 1; in < this.current; in++) {
                if (this.arr[in] < this.arr[pos])
                    pos = in;
            }
            change(out, pos);
            steps++;
        }
        this.isSorted = true;
        System.out.println("sortSelect steps: " + steps);
    }

    // сортировка вставкой
    public void sortInsert() {
        int steps = 0;
        for (int out = 0; out < this.current; out++) {
            int temp = this.arr[out];
            int in = out;
            while(in > 0 && this.arr[in - 1] >= temp) {
                this.arr[in] = this.arr[in - 1];
                in--;
            }
            this.arr[in] = temp;
            steps++;
        }
        this.isSorted = true;
        System.out.println("sortInsert steps: " + steps);
    }
}
