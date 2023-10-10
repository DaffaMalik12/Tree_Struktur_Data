public class MainApp {

    public static void main(String[] args) {

        Tree<Integer> avlTree = new AVLTree<>();
        avlTree.insert(1).insert(2).insert(3).insert(4).insert(5);

        avlTree.traverse();

        System.out.println("Max is: " + avlTree.getMax());
        System.out.println("Min is: " + avlTree.getMin());

        System.out.println("Deleting 42 from Tree");
        avlTree.delete(42);

        System.out.println("New Max is: " + avlTree.getMax());

        avlTree.traverse();

    }

}
