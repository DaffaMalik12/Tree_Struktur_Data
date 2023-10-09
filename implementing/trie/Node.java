import lombok.Data;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
public class Node {

    private final char character;
    private boolean isEndOfWord;

    @ToString.Exclude
    private Map<Character, Node> children = new HashMap<>();

}
