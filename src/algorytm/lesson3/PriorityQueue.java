package algorytm.lesson3;

//Описать класс с реализацией приоритетной очереди

public class PriorityQueue {
    private int [] priorityqueueArray;
    private int maxSize;
    private int items;

    public PriorityQueue (int i){
        priorityqueueArray = new int[maxSize];
        maxSize = i;
        items = 0;
    }
    public void insert ( int item ){
        int i;
        if (items==0)
            priorityqueueArray[items++] = item;
        else{
            for ( i = items-1 ; i >= 0 ; i--){
                if ( item > priorityqueueArray[i])
                    priorityqueueArray[i+1] = priorityqueueArray[i];
                else
                    break;
            }
            priorityqueueArray[i+1] = item;
            items++;
        }
    }
    public int remove (){
        return priorityqueueArray[--items];
    }
    public long peek (){
        return priorityqueueArray[items-1];
    }
    public boolean isEmpty (){
        return (items==0);
    }
    public boolean isFull (){
        return (items==maxSize);
    }
}
