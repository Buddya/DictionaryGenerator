import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DictionaryGenerator implements Function<String, List<String>> {
    @Override
    public List<String> apply(String phrase) {
        return Arrays.stream(phrase.split(" "))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
