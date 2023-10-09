public interface Tree<T extends Comparable<T>> {

    Tree<T> insert(T data);

    void delete(T data);

    Node<T> find(T data);

    Node<T> findRecursively(T data);

    void traverse();

    T getMax();

    T getMin();

    boolean isEmpty();

}