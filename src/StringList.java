import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/3/15
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringList implements List<Character>, Iterable<Character> {

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
        s = s.substring(0, index) + item + s.substring(index);
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

    @Override
    public int size() {
        return s.length();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator<Character> iterator() {
        Iterator<Character> iterator = new Iterator<Character>() {

            private int currentIndex;

            @Override
            public boolean hasNext() {
                return currentIndex < s.length();
            }

            @Override
            public Character next() {
                return get(currentIndex++);
            }
        };

        return iterator;
    }

    public static void main(String[] args) {
        StringList a = new StringList("abcdefg");
        a.add('1');
        a.add('2');
        System.out.println(a.get(0));
        System.out.println(a.get(7));
        System.out.println(a.get(8));
        System.out.println();

        a = new StringList("");
        a.add('X');
        System.out.println(a.size());
        a.add(0, 'Y');
        System.out.println(a.size());
        a.add(0, 'Z');
        System.out.println(a.size());
        a.add(1, 'R');
        System.out.println(a.size());
        a.add(4, 'x');
        System.out.println(a.size());

        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        System.out.println();

    }

}
