public class MainApp {
    public static void main(String[] args) {

        Tree<Integer> splayTree = new SplayTree<>();
        splayTree.insert(10).insert(20).insert(40).insert(50).insert(30).insert(60);
        splayTree.traverse();

        System.out.println("Max is: " + splayTree.getMax());
        System.out.println("Min is: " + splayTree.getMin());

        splayTree.find(40);
        splayTree.traverse();

        System.out.println("==========================================");

        splayTree.findRecursively(20);
        splayTree.traverse();

        System.out.println("==========================================");

        splayTree.delete(20);
        splayTree.traverse();

    }

}
