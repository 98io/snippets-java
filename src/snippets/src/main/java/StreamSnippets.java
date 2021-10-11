import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSnippets {

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3,4, 5,6, 7);
        int sum = numbers.stream().reduce(0, (a, b) -> a+b);
        int mul = numbers.stream().reduce(1, (a, b) -> a*b);
        int smallest = numbers.stream().reduce(numbers.get(0), (a,b)->a<=b?a:b);
        int largest = numbers.stream().reduce(numbers.get(0), (a,b)->a>=b?a:b);

        System.out.println("sum = "+sum);
        System.out.println("mul = "+mul);
        System.out.println("smallest = "+smallest);
        System.out.println("largest = "+largest);


        int smallest_calc2 = numbers.stream().mapToInt(a->a).min().orElse(2 + 3);
        System.out.println("smallest = "+smallest_calc2);

        List<Integer> listOddNumbers = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 1).boxed().collect(Collectors.toList());

    }
}
