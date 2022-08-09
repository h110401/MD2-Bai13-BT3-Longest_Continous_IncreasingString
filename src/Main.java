import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String string = "abcabcdgabxy";
        List<Character> current = new ArrayList<>();
        List<Character> max = new ArrayList<>();
        for (Character c : string.toCharArray()) {
            if (max.isEmpty()) {
                current.add(c);
                max.add(c);
                continue;
            }
            if (c.compareTo(current.get(current.size() - 1)) < 0) {
                current.clear();
            }
            current.add(c);
            if (current.size() > max.size()) {
                max.clear();
                max.addAll(current);
            }

        }
        System.out.println(max);
    }
}

