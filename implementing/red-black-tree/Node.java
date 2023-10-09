import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import java.awt.*;

import static java.awt.Color.BLACK;
import static java.awt.Color.RED;

@Data
public class Node<T extends Comparable<T>> {

    @NonNull
    private T data;

    private Color color = RED;

    private Node<T> leftChild;
    private Node<T> rightChild;

    @ToString.Exclude
    private Node<T> parent;

    public boolean isLeftChild() {
        return this == parent.getLeftChild();
    }

    public void flipColor() {
        setColor(color == RED ? BLACK : RED);
    }

}
