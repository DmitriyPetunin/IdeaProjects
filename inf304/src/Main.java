

public class Main {
    public static void main(String[] args) throws EmptyElementException {

        List304ImplAsLinkedList listLinked1 = new List304ImplAsLinkedList();

        for (int i = 1; i < listLinked1.size+1; i++){
            listLinked1.add(i);
        }
        listLinked1.printList();
        listLinked1.get(2); // вывод элемента с индексом 2

        listLinked1.delete(5); // удаление из списка по индексу 5
        listLinked1.printList();

        listLinked1.pop(7);
        listLinked1.printList();

        listLinked1.deleteOfvalue(15);
        listLinked1.printList();



//        List304ImplAsArray listArray1 = new List304ImplAsArray();
//
//        for (int i = 0; i < 15; i++) {
//            listArray1.add(i);
//            System.out.println(listArray1);
//
//        }
    }
}