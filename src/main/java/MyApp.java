import java.util.*;


public class MyApp {

    public static void main(String[] args) {
        List<String> strings = Arrays.stream(args).toList();
        String str = "";
        for (String s :
                strings) {
            str += s;
        }
        Map<Character, Integer> characterIntegerMap = new TreeMap<>();

        char[] chars = str.toLowerCase().toCharArray();
        Arrays.sort(chars);

        for (char c :
                chars) {
            if (characterIntegerMap.containsKey(c)) {
                characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
            } else {
                characterIntegerMap.put(c, 1);
            }
        }

        for (Map.Entry entry :
                characterIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
