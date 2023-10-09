public class MainApp {
    public static void main(String[] args) {

        Tree<Integer> redBlackTree = new RedBlackTree<>();
        redBlackTree.insert(10).insert(20).insert(5).insert(40).insert(50).insert(25).insert(60).insert(80).insert(85)
                .insert(90).insert(30).insert(15).insert(75).insert(100).insert(55).insert(45).insert(0).insert(26);
        redBlackTree.traverse();

        System.out.println("Max is: " + redBlackTree.getMax());
        System.out.println("Min is: " + redBlackTree.getMin());

    }

}
