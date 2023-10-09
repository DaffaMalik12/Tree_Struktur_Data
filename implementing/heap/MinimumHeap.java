public class MinimumHeap<T extends Comparable<T>> extends Heap<T> {

    protected void fixUpward() {
        int index = position;
        int parentIndex = (index - 1) / 2;
        while (parentIndex >= 0 && heap[index].compareTo(heap[parentIndex]) < 0) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    protected void fixDownward(int endIndex) {
        if (endIndex == -1) return;
        int index = 0;
        while (index <= endIndex) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            if (leftChildIndex > endIndex) break;

            int childToSwap = rightChildIndex > endIndex
                    ? leftChildIndex
                    : heap[leftChildIndex].compareTo(heap[rightChildIndex]) < 0
                        ? leftChildIndex
                        : rightChildIndex;

            if (heap[index].compareTo(heap[childToSwap]) < 0) break;
            swap(index, childToSwap);
            index = childToSwap;
        }
    }

}