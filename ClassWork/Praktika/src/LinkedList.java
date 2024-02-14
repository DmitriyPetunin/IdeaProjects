import java.util.Scanner;

public class LinkedList implements MyList {
    private Element first;
    private Element last;
    private int size;
    public void input() {
        Scanner scanner = new Scanner(System.in);
        Element prevLast = this.last;
        Element currentLast = new Element(null,scanner.nextInt());
        this.last = currentLast;
        if (prevLast == null)
            this.first = currentLast;
        else {
            prevLast.next = currentLast;
        }
    }
    public void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка");
        this.size = in.nextInt();
        for (int i = 0; i < size; i++){
            System.out.println("Введите целое число: ");
            input();
        }
    }
    public void printList(){
        Element currentEl = new Element(first, 0);
        for (int i = 0; i < size; i++) {
            currentEl = currentEl.next;
            System.out.print("| " + currentEl.value + " |  ");
        }
        System.out.println();
    }
    public void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("После какого элемента вы хотите разместить новый элемент?");
        Element currEL = first;
        int num = scanner.nextInt();
        for (int i = 0; i < num-1; i++){
            currEL = currEL.next;
        }
        System.out.println("Введите value для нового элемента");
        Element temp = new Element(null,scanner.nextInt());
        temp.next = currEL.next;
        currEL.next = temp;
        size++;
    }

    @Override
    public boolean compare(Element e1, Element e2) {
        return e1.value > e2.value;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                Element curEl = first;
                for (int k = 0; k < j; k++) {
                    curEl = curEl.next;
                    if (compare(curEl, curEl.next)) {
                        swap(curEl,curEl.next);
                    }
                }
            }
        }
    }
    @Override
    public void swap(Element e1, Element e2) {
        int temp = e1.value;
        e1.value = e2.value;
        e2.value = temp;
    }
}
