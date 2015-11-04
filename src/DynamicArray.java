/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/3/15
 * Time: 4:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class DynamicArray<T> implements List<T> {

    private Object[] array;
    private int size;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int capacity) {
        size = 0;
        array = new Object[capacity + 1];
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public T set(int index, T item) {
        T previousItem = get(index);

        array[index] = item;

        return previousItem;
    }

    @Override
    public boolean add(T item) {
        if (size == array.length) {
            reallocateArray();
        }

        array[size++] = item;

        return true;
    }

    @Override
    public void add(int index, T item) {
        if (size == array.length) {
            reallocateArray();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = item;

        size++;
    }

    @Override
    public T remove(int index) {
        T item = (T) array[index];


        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size] = null;
        size--;

        return item;
    }


    @Override
    public int size() {
        return size;
    }


    private void reallocateArray() {
        Object[] newArray = new Object[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
}
