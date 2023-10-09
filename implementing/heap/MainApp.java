public class MainApp {
    public static void main(String[] args) {

        Heap<Integer> maximumHeap = new MaximumHeap<>();
        maximumHeap.insert(50).insert(40).insert(60).insert(30).insert(70).insert(20).insert(100);
        maximumHeap.print();

        System.out.println(maximumHeap.getRoot());
        maximumHeap.print();

        maximumHeap.sort();

        System.out.println("==========================================");

        Heap<Integer> minimumHeap = new MinimumHeap<>();
        minimumHeap.insert(50).insert(40).insert(60).insert(30).insert(70).insert(20).insert(100);
        minimumHeap.print();

        System.out.println(minimumHeap.getRoot());
        minimumHeap.print();

        minimumHeap.sort();

    }

}
