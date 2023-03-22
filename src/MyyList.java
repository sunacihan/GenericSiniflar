public class MyyList<T> {
    private T[] arr;
    private int capacity;

    public MyyList() {
        ;
        this.capacity = 10;
        this.arr = (T[]) new Object[this.capacity];

    }

    public MyyList(int capacity) {

    }

    public int size() {
        int sayac = 0;
        for (T i : this.arr) {
            if (i != null)
                sayac++;

        }
        return sayac;

    }

    public int getCapacity() {
        return this.arr.length;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T get(int index) {
        if (index <= 0 || index > this.arr.length)
            return null;
        return this.arr[index - 1];
    }

    public T set(int index, T data) {
        if (index <= 0 || index > this.arr.length)
            return null;
        this.arr[index - 1] = data;
        return this.arr[index - 1];
    }

    public void tosString() {
        System.out.print("[");
        for (T i : this.arr) {

            System.out.print(i);
            System.out.print(",");
        }

        System.out.println("]");


    }

    public Object remove(int index) {
        if (index <= 0 || index > this.arr.length)
            return null;

        for (int i = index - 1; i < this.arr.length; i++) {
            if (i == this.arr.length - 1) {
                this.arr[i] = null;
            } else
                this.arr[i] = this.arr[i + 1];
        }
        return true;
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastindexOf(T data) {
        int sonindex = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == data)
                sonindex = i;

        }
        if (sonindex != 0)
            return sonindex;
        return -1;
    }
    public boolean isEmpty(){
        if (this.size()==0)
            return true;
        return false;
    }
    public T[] toArray(){
        return this.arr;
    }
    public T[] subList(int start, int finish){
        int boyut=(finish-start)+1;
        T[] suList=(T[]) new Object[boyut];
        for (int i = start,j=0; i <= finish; i++,j++){
            suList[j]=this.arr[i];

        }
        return suList;
    }

    public boolean contains(T data){
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i]==data)
                return true;
        }

            return false;
    }
    public T[] clear(){
        T[] arr3 = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.arr.length; i++) {
           this.arr[i]= arr3[i];

        }
        arr = arr3;
        setCapacity(10);
        return this.arr;
    }

    public void add(T data) {
        int nullhesabi = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == null) {
                this.arr[i] = data;
                if (i == 19)
                    nullhesabi = 0;
                break;
            } else {
                nullhesabi++;
            }
        }
        if (nullhesabi == 10) {
            setCapacity(20);
            T[] arr2 = (T[]) new Object[this.capacity];
            for (int i = 0; i < this.arr.length; i++) {
                arr2[i] = this.arr[i];

            }
            arr = arr2;
            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] == null) {
                    this.arr[i] = data;

                    break;
                }
            }

        }


    }


}
