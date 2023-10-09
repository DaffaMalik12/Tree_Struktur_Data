import java.util.Arrays;

@SuppressWarnings("unchecked")
public abstract class Heap<T extends Comparable<T>> implements IHeap<T> {

    protected T[] heap;
    protected int position = -1;

    public Heap() {
        heap = (T[]) new Comparable[2];
    }

    protected abstract void fixUpward();

    protected abstract void fixDownward(int endIndex);

    @Override
    public IHeap<T> insert(T data) {
        if (isFull()) {
            resize(2 * heap.length);
        }
        heap[++position] = data;
        fixUpward();
        return this;
    }

    @Override
    public T getRoot() {
        if (isEmpty()) {
            return null;
        }
        T result = heap[0];
        heap[0] = heap[position--];
        heap[position + 1] = null;
        fixDownward(position);
        return result;
    }

    @Override
    public void sort() {
        for (int i = 0; i <= position; i++) {
            swap(0, position - i);
            fixDownward(position - i - 1);
        }
        print();
    }

    public void print() {
        Arrays.stream(heap).forEach(item -> System.out.print(item + " -> "));
        System.out.println();
    }

    protected void swap(int firstIndex, int secondIndex) {
        T temp = heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = temp;
    }

    private void resize(int capacity) {
        System.arraycopy(heap, 0, heap = (T[]) new Comparable[capacity], 0, position + 1);
    }

    private boolean isFull() {
        return position == heap.length - 1;
    }

    private boolean isEmpty() {
        return heap.length == 0;
    }

}
