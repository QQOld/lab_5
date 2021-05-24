package Base.Classes;

public class ListUtils {
    public static ListElement insert(ListElement first, int value) {
        if (first == null) {
            return new ListElement(value);
        } else {
            ListElement p = first;
            while (p.getNext() != null) p = p.getNext();
            p.setNext(new ListElement(value));
            return first;
        }
    }

    public static ListElement filter(ListElement first) {
        ListElement p = null;
        while (first != null) {
            if (primeNumber(first.getValue()))
                p = insert(p, first.getValue());
            first = first.getNext();
        }
        return p;
    }

    public static ListElement map(ListElement first) {
        ListElement p = null;
        while (first != null) {
            p = insert(p, first.getValue()%7);
            first = first.getNext();
        }
        return p;

    }
    public static void print(ListElement first) {
        if(first != null) {
            System.out.print(first.getValue() + " ");
            print(first.getNext());
        }
    }

    public static boolean primeNumber(int x) {
        int n = 2;
        while(n < x) {
            if(x%n == 0)
                return false;
            n++;
        }
        return true;
    }
}
