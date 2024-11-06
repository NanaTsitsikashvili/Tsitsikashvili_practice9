import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();


        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");


        System.out.println("Colors list: " + colors);


        System.out.println("Second color: " + colors.get(1));


        colors.remove(0);  // Removes "Red" from the list
        System.out.println("After removal: " + colors);
    }
}
