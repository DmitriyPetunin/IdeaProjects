public class Node {
    public Integer value;
    public Node next;
    public Node prev;

    public Node(Node next, Node prev,Integer value) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
