public class Main {
    public static void main(String[] args) {

        Trees tree = new Trees(50,90, "fruit","Autumn","yellow",50);
//        System.out.println(tree.height);
//        System.out.println(tree.age);
//        System.out.println(tree.view);
        System.out.println(tree.Growup(tree.height));
        System.out.println(tree.changeColorList(tree.season));
    }
}