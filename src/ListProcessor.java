import java.util.*;
/**
 * this class includes several methods to solve the problems of Inda-task-10
 * @author Raeef Bechara
 */



public class ListProcessor {


    public static void main(String[] args) {



    }



    /**
     * @param from This variable determines the first value of the array.
     * @param to   This variable determines the last value of the array.
     * @return An array with integers between the bounds from and to.
     */

    public int[] arraySequence(int from, int to) {
        int[] numberArray = new int[Math.abs(to - from )];
        // create an array that has the size of the difference between the from and to integer bounds.

        if (from == to) {
            int[] newArray = new int[0];
            numberArray = newArray;
        }
        // the if statement creates a new empty array and sets the numberArray array to become empty.

        else if (from > to) {
            throw new IllegalArgumentException();
        } // the else if statement throws an exception when from is larger than to.
        else {
            for (int i = from; i < to; i++) {
                numberArray[i - from] = i;
            }
        }
        // the else statement populates the arraylist within the bounds.

        return numberArray; // return the array.
    }

    /**
     * @param from This variable determines the first value of the list.
     * @param to   This variable determines the last value of the list.
     * @return A list with integers between the bounds from and to.
     */

    public List<Integer> listSequence(int from, int to) {
        List<Integer> list = new ArrayList<>(Math.abs(to - from) );
        // create an Arraylist that has the size of the difference between the from and to integer bounds.
        if (from == to) {
            list.clear();
        }
        // the if statement clears the arraylist if the from and to variables have the same value.
        else if (from > to) {
            throw new IllegalArgumentException();
        }   // the else if statement throws an exception when from is larger than to.
        else {
            for (int i = from; i < to; i++) {
                list.add(i);
            }
        }
        // the else statement populates the arraylist within the bounds.

        return list; // return the arraylist.
    }

    /**
     * A method to shuffle the integer elements within an array.
     *
     * @param numbers An integer array
     * @return the same array but the elements are shuffled
     */

    public int[] shuffled(int[] numbers) {
        Random rand = new Random();//Random number generator
        int [] newNumberArray = numbers.clone();
        for (int indexNumber = 0; indexNumber < newNumberArray.length; indexNumber++) {
            int randomPosition = rand.nextInt(newNumberArray.length);
            int temp = newNumberArray[indexNumber]; // int temp is declared and implemented  to swap the index of elements in the array
            newNumberArray[indexNumber] = newNumberArray[randomPosition];
            newNumberArray[randomPosition] = temp;
        }
        return numbers; // return the shuffled array
    }

    /**
     * A method to shuffle the integer elements within a list.
     *
     * @param numbers An integer list
     * @return the same list but the elements are shuffled
     */

    public List<Integer> shuffled(List<Integer> numbers) {
        ArrayList numbersArrayList = new ArrayList<>(numbers);
        int totalNumbersInTheList = numbersArrayList.size();
        Random rand = new Random(); //Random number generator
        rand.nextInt();
        for (int indexNumber = 0; indexNumber < totalNumbersInTheList; indexNumber++) {
            int change = indexNumber + rand.nextInt(totalNumbersInTheList - indexNumber);
            Collections.swap(numbersArrayList, indexNumber, change); // swaps the index of two elements in the list
        }

        return numbers; // returns the shuffled list
    }

    /**
     * @param numbers an integer array
     * @return sum of all integer elements in the array
     */
    public int sumIterative(int[] numbers) {
        int sum = 0;
        if (numbers.length == 0) {
            sum = 0;
        } // the sum is zero if the array is empty
        else {
            for (int anIntegerWithinTheArray : numbers) {
                sum = sum + anIntegerWithinTheArray;
            }
        } // the else statement iterates the array and add all the integer values within the array to sum

        return sum;
    }

    /**
     * @param numbers an integer list
     * @return sum of all integer elements in the list
     */

    public int sumIterative(List<Integer> numbers) {
        ArrayList<Integer> numbersArrayList = new ArrayList<Integer>(numbers);
        int sum = 0;
        if (numbersArrayList.size()== 0) {
             sum = 0;
        } // the sum is zero if the list is empty
        else {
            for ( int elementInArrayList  : numbersArrayList)
                sum = sum + elementInArrayList ;


        } // the else statement iterates the list and add all the integer values within the list to sum

        return sum;
    }

    /**
     * @param numbers An array of integers
     * @return a sum of all integers in the array using recursion
     */

    public int sumRecursive(int[] numbers) {
        if (numbers.length == 0){
            return 0;
        }
        else {
            return numbers[0]+sumRecursive(Arrays.copyOfRange(numbers, 1, numbers.length));
        }

    }



    /**
     * @param numbers A list of integers
     * @return a sum of all integers in the list using recursion
     */

    public int sumRecursive(List<Integer> numbers) {

        int size = numbers.size();
        int sum = 0;
        if (numbers.isEmpty()) {
            sum =0; // return 0 if the list is empty

        } else {
            sum =+ numbers.get(0) + sumRecursive(numbers.subList(1, size));

        }
        /* the else statement calculates the sum of nonempty list by adding sum to the first element of the list,
            and adding it to a recall of the sumRecursive method but using a sublist to remove the first element of the list.
         */
        return sum;

    }
}
