import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
public class Node<T extends Comparable<T>> {

    @NonNull
    private T data;

    private Node<T> leftChild;
    private Node<T> rightChild;

    @ToString.Exclude
    private Node<T> parent;

    public Node<T> getGrandParent() {
        return parent != null ? parent.getParent() : null;
    }

    public boolean isLeftChild() {
        return this == parent.getLeftChild();
    }

    public boolean isRightChild() {
        return this == parent.getRightChild();
    }

}
