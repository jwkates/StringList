/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/3/15
 * Time: 4:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class DynamicArray<T> {

    private T[] array;
    private int size;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int size) {
        this.size = size;

        array = (T[]) new Object[size];
    }

    public DynamicArray(T[] array) {
        this.size = array.length;
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public T set(int index, T item) {
        T previousItem = get(index);

        array[index] = item;

        return previousItem;
    }

    public boolean add(T item) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
        }

        array[size++] = item;

        return true;
    }




}
