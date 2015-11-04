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

    public ListIterator listIterator() {
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
        StringList a = new StringList( "ab" );
        ListIterator b = a.listIterator();
        System.out.println( a );
        System.out.println( b.hasNext() );
        System.out.println( b.next() );
        b.add( '0' );
        System.out.println( a );
        b.add( '1' );
        System.out.println( a );
        System.out.println( b.hasNext() );
        System.out.println( b.next() );

    }

}
