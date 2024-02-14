public class List304ImplAsLinkedList implements List304 {
    Node first;
    Node last;
    int size = 15;
    @Override
    public void add(Integer e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }

        Node currentNode = new Node(null,last,e);
        if (first == null){
            first = currentNode;
            last = currentNode;
        } else {
            currentNode.prev.next = currentNode;
            last = currentNode;
        }
    }

    public void printList(){
        Node currentNode = first;
        for (int i = 0; i < size; i++) {
            System.out.println("| " + currentNode.value + " |  ---" + i);
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index > (size - 1)){
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = first;
        for (int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.value);
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index > (size - 1)){
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = first;
        for (int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        size--;
    }

    @Override
    public Integer pop(int index) throws IndexOutOfBoundsException{
        if (index > (size - 1)){
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = first;
        for (int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.value);
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        size--;
        return null;
    }
    public Integer pop(){
        Node currentNode = first;
        for (int i = 0; i < size-1; i++){
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.value);
        currentNode.prev.next = null;
        size--;
        return null;
    }

    public void deleteOfvalue(int val) {
        Node currentNode = first;
        for (int i = 0; i < size; i++){
            if (currentNode.value == val){
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                size--;
            }
            currentNode = currentNode.next;
        }
    }
}
