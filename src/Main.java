import java.util.*;


public class Main {
    public static void main(String[] args) {
        String string = "abcabcdgabxy";
        List<Character> current = new ArrayList<>();
        List<Character> max = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (max.isEmpty()) {
                    current.add(string.charAt(j));
                    max.add(string.charAt(j));
                    continue;
                }
                if (string.charAt(j) < current.get(current.size() - 1)) {
                    current.clear();
                }
                current.add(string.charAt(j));
                if (current.size() > max.size()) {
                    max.clear();
                    max.addAll(current);
                }
            }
        }
        System.out.println(max);
    }
}

