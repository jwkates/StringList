import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/3/15
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringList implements List<Character> {

    String s;

    public StringList() {
        this("");
    }

    public StringList(String s) {
        this.s = s;
    }

    @Override
    public boolean add(Character item) {
        s += item;

        return true;
    }

    @Override
    public void add(int index, Character item) {
        if (index == size()) {
            add(item);
        } else {
            s = s.substring(0, index) + item + s.substring(index);
        }
    }

    @Override
    public Character get(int index) {
        return s.charAt(index);
    }

    @Override
    public Character remove(int index) {
        Character originalCharacter = get(index);

        s = s.substring(0, index) + s.substring(index + 1);

        return originalCharacter;
    }

    @Override
    public Character set(int index, Character item) {
        Character originalCharacter = get(index);

        s = s.substring(0, index) + item + s.substring(index + 1);

        return originalCharacter;
    }

    public ListIterator<Character> listIterator() {
        return new StringListIterator(this);
    }

    @Override
    public String toString() {
        return s;
    }

    @Override
    public int size() {
        return s.length();  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static void main(String[] args) {
        // Test Case #1
        System.out.println("--- Test Case #1 ---");
        StringList a = new StringList("abcdefg");
        a.add(new Character('1'));
        a.add(new Character('2'));
        System.out.println(a.get(0));
        System.out.println(a.get(7));
        System.out.println(a.get(8));

        // Test Case #2
        System.out.println("--- Test Case #2 ---");
        a = new StringList("");
        a.add(new Character('X'));
        System.out.println(a.size());
        a.add(0,new Character('Y'));
        System.out.println(a.size());
        a.add(0,new Character('Z'));
        System.out.println(a.size());
        a.add(1,new Character('R'));
        System.out.println(a.size());
        a.add(4,new Character('x'));
        System.out.println(a.size());

        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        System.out.println();


        // Test Case #3
        System.out.println("--- Test Case #3 ---");
        a = new StringList("");
        a.add(new Character('a'));
        a.add(2, new Character('a'));
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Character> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Character> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<Character> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Character> listIterator(int index) {
        return null;
    }

    @Override
    public List<Character> subList(int fromIndex, int toIndex) {
        return null;
    }

}
