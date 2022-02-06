package Assignment3;

import java.util.List;
import java.util.regex.Pattern;

    public class Main {
        public static void main(String[] args) {

            List<String> words = List.of("chair","cat","way","shyly","government","computer","animal","development","management","dog","homework");

            Pattern nounFilter = Pattern
                    .compile("^(.*[AaEeUuiIOoYy].*){2}");

            words.stream()
                    .filter(s -> s.matches(String.valueOf(nounFilter)))
                    .forEach(System.out::println);

        }
    }