import java.util.Scanner;

public class DoubleLinkedList implements MyDoubleList {
    private Element first;
    private Element last;
    private int size;
    public void input(){
        Scanner scanner = new Scanner(System.in);
        Element currentLast = new Element(null,last,scanner.nextInt());
        if (first == null) {
            first = currentLast;
            last = currentLast;
        } else if (first.next == null) {
            first.next = currentLast;
            last = currentLast;
        } else {
            currentLast.prev.next = currentLast;
            last = currentLast;
        }
    }
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка");
        size = in.nextInt();
        for (int i = 0; i < size; i++){
            System.out.println("Введите целое число: ");
            input();
        }
    }
    public void printList(){
        Element currentEl = first;
        for (int i = 0; i < size; i++) {
            System.out.println("| " + currentEl.value + " |  ---");
            currentEl = currentEl.next;
        }
        System.out.println();
    }
    public void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("После какого элемента вы хотите разместить новый элемент?");
        int num = scanner.nextInt();
        Element currEL = first;
        for (int i = 0; i < num -1; i++){
            currEL = currEL.next;
        }
        System.out.println("Введите value для нового элемента");
        Element temp = new Element(null,null,scanner.nextInt());
        temp.prev = currEL;
        currEL.next.prev = temp;
        temp.next = currEL.next;
        currEL.next = temp;
        size++;
    }

    public boolean compare(Element e1, Element e2) {
        return e1.value > e2.value;

    }
    public void swap(int num) {
        Element e = first;
        for (int i = 0; i < num; i++) {
            e = e.next;
        }
        Element e2 = e.next;
        Element e3 = e2.next;
        Element e4 = e.prev;

        if (num != 0 && num != (size - 2)) {
            e.prev.next = e2;
            e3.prev = e;
            e2.next = e;
            e2.prev = e4;
            e.prev = e2;
            e.next = e3;
        }
        else if (num== 0) {
            e3.prev = e;
            e2.next = e;
            e2.prev = e4;
            e.prev = e2;
            e.next = e3;
            first = e2;
        }
        else if (num == (size - 2)) {
            e4.next = e2;
            e2.prev = e4;
            e.next = null;
            e2.next = e;
            e.prev = e2;
        }

    }
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                Element curEl = first;
                for (int k = 0; k < j; k++) {
                    curEl = curEl.next;
                    if (compare(curEl, curEl.next)) {
                        swap(j);
                    }
                }
            }
        }
    }
}
