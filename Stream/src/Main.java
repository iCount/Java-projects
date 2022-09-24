import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = Set.of("ask", "key" , "how", "and");
        List<StringBuilder> list = set.stream().filter(x -> x.startsWith("a")).map(x -> new StringBuilder(x)).toList();




    }
}
