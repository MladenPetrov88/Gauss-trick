import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        if (numbers.size() % 2 == 0) {
            for (int i = 0; i <= numbers.size() / 2; i++) {
                numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);

            }
        } else {
            for (int i = 0; i < numbers.size() / 2; i++) {
                numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);

            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }
}
