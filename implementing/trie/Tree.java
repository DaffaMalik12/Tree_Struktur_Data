import java.util.List;

public interface Tree {

    Tree insert(String word);

    boolean contains(String word);

    void delete(String word);

    boolean containsPrefix(String prefix);

    List<String> wordsWithPrefix(String prefix);

}