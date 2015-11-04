/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/3/15
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringList extends DynamicArray<Character> implements List<Character> {

    public StringList() {
        super(10);
    }

    public StringList(String s) {
        super(s.length());

        for (char c : s.toCharArray()) {
            add(c);
        }
    }

    public static void main(String[] args) {
        StringList a = new StringList("abcdefg");
        a.add('1');
        a.add('2');
        System.out.println(a.get(0));
        System.out.println(a.get(7));
        System.out.println(a.get(8));
        System.out.println();

        System.exit(0);

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
