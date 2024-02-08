import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOnString {

    public static void main(String[] args) {
        String input  = "Hello Hello iiiiIII";
//        System.out.println(getVowelsAndConsonantCount(input));
//        Find number of times a number/word got repeated

        Map<String, Long> duplicateNumbersOrWords = findDuplicateNumbersOrWords();
        duplicateNumbersOrWords.forEach((K,V)-> System.out.println("Key "+ K + ", Value " + V));
    }

    public static long getVowelsAndConsonantCount(String str){
        long count = str.chars().map(c-> Character.toUpperCase(c)).
                filter(x -> x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U').count();
        return count;
    }

    public static Map<String, Long> findDuplicateChars(String str){
         return str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
    }

    public static Map<String, Long> findDuplicateNumbersOrWords(){
        List<Integer> integers = Arrays.asList(5, 3, 4, 1, 7, 8, 3, 1, 2, 3, 5);
        List<String> strList = Arrays.asList("anaconda","python","python","rattle snake");


        Map<String, Long> collect = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return collect;
    }
}
