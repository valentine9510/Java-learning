import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java","a compiled high level, 00P, platform independent language");
        languages.put("Python", "OOP, High-level programming language");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners all purpose...."));
        System.out.println(languages.put("Lisp", "There in lies madness"));

        System.out.println(languages.get("Java"));
        System.out.println(languages.put("Java", "this course is about java"));
        System.out.println(languages.get("Java"));

        System.out.println("============================");
        languages.remove("Java");
        if (!languages.remove("Algol","Hi")){
            System.out.println("Failed to remove Algol");
        }

        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
