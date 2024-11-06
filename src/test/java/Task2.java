import java.util.HashSet; // Import the HashSet class

public class Task2 {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);


        System.out.println("Numbers set: " + numbers);


        if (numbers.contains(20)) {
            System.out.println("Set contains 20");
        }


        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
