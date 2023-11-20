import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        int[] numbers = { 0, 3, 2, 1, 8, 9};
        ArrayList<Integer> numbersArray = new ArrayList<>();
        for (int i : numbers) {
            numbersArray.add(i);
        }
        // without stream
        System.out.println("------- without stream ----------");

        Collections.sort(numbersArray);
        ArrayList<Integer> numbersArraySort = new ArrayList<>(numbersArray);
        System.out.println("Sort List : "+ numbersArraySort);

        for (int i : numbersArray) {
            System.out.println("the square value of "+i+" is : "+Math.sqrt(i));
        }

        System.out.println("All the even number of the list are : ");
        for (int i : numbersArray) {
            if(i%2 == 0){
                System.out.printf(i+" ");
            }

        }
        // with stream
        System.out.println("\n------- with stream ----------");
        Stream<Integer> numberStream = numbersArray.stream();
        System.out.println("List sorted : ");
        numberStream.sorted().forEach( i -> System.out.printf(i+" "));
        numberStream = numbersArray.stream();
        System.out.println("\nSquare value : ");
        numberStream.sorted().forEach( i -> System.out.println("the square value of "+i+" is : "+Math.sqrt(i)));
        numberStream = numbersArray.stream();
        System.out.println("All the even number of the list are :");
        numberStream.sorted().filter( i -> i%2 == 0).forEach( i -> System.out.printf(i+" "));

    }
}