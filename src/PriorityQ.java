//PriorityQ
//Demonstrates priority queue

public class PriorityQ {
    //Array in sorted order, from max at 0 to min at size -1
    private int maxSize;
    private long[] queArray;
    private int nItems;

    //Constructor
    public PriorityQ(int s){
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    //Insert item
    public void insert(long item){
        int j;

        if (nItems == 0){       //If no items,
            queArray[nItems++] = item;  //insert at 0
        }
        else{
            for (j = nItems -1; j >= 0; j--) {    //start at end
                if (item > queArray[j])     //if now item larger,
                    queArray[j + 1] = queArray[j];  //shift upward
                else
                    break;  //if smaller, done shifting
            }   //end for
                queArray[j + 1] = item; //insert it
                nItems++;
            }   //end else (nItems > 0)
    }   //end insert()

    //Remove minimum item
    public long remove(){
        return queArray[--nItems];
    }

    //Peek at minimum item
    public long peekMin(){
        return queArray[nItems-1];
    }

    //true if queue is empty
    public boolean isEmpty(){
        return (nItems == 0);
    }

    //True if queue is full
    public boolean isFull(){
        return (nItems == maxSize);
    }
}
