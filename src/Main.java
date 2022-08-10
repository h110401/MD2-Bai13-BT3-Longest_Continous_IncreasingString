import java.util.*;


public class Main {

    public Main() {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

//        int[] ascii = new int[string.length()];
//        for (int i = 0; i < string.length(); i++) {
//            ascii[i] = string.charAt(i);
//        }
//
//        System.out.println(Arrays.toString(ascii));

        Set<String> increasingStrings = new HashSet<>();


        for (int i = 0; i < string.length(); i++) {
            List<StringBuilder> temp = new ArrayList<>();
            temp.add(new StringBuilder().append(string.charAt(i)));
            for (int j = i; j < string.length(); j++) {
                List<StringBuilder> holder = new ArrayList<>();
                holder.add(new StringBuilder().append(string.charAt(j)));
                for (StringBuilder stringBuilder : temp) {
                    if (string.charAt(j) > stringBuilder.charAt(stringBuilder.length() - 1)) {
                        holder.add(new StringBuilder().append(stringBuilder).append(string.charAt(j)));
                    } else {
                        StringBuilder holdTemp = new StringBuilder();
                        holdTemp.append(stringBuilder);
                        while (string.charAt(j) <= stringBuilder.charAt(stringBuilder.length() - 1) && holdTemp.length() > 0) {
                            holdTemp.deleteCharAt(holdTemp.length() - 1);
                        }
                        holder.add(holdTemp.append(string.charAt(j)));
                    }
                }
                temp.addAll(holder);
            }
            for (StringBuilder s : temp) {
                increasingStrings.add(s.toString());
            }
        }

        int maxLength = 0;
        for (String s : increasingStrings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        int finalMaxLength = maxLength;
        increasingStrings.removeIf(s -> s.length() < finalMaxLength);
        System.out.println(increasingStrings);
        new Main();
    }
    public static void main(String[] args) {
        new Main();
    }
}

