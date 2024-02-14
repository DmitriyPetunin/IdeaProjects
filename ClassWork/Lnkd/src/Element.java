public class Element {
    public int value;
    public Element next;
    public Element prev;
    public Element(Element next, Element prev, int value){
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
}
