package StudyGuideExamples;

import java.util.Locale;
import java.util.function.Predicate;

public class GenericsExample {

    public static void main(String[] args) {

        var value = "abc";
        Predicate<String> methodRef = value::startsWith;
        Predicate<String> methodRefs = x -> value.startsWith(x);
        System.out.println(methodRef);
    }
}
