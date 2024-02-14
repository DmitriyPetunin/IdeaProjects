package ru.itis.inf304.treeSort;
import static ru.itis.inf304.treeSort.BTree.HeapPrinter.printHeapTree;

public class Main {
    public static void main(String[] args) {
        BTree heap = new BTree();
        for (int i = 0; i < 31; i++) {
            heap.add((int)(Math.random() * 1000) + 1);
        }
        System.out.println(printHeapTree(heap.getHeap(), heap.getHeapSize()));
    }
}
