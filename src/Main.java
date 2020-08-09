import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        System.out.println("Search 2 in list: 1, 2, 3, 4, 5, 6, 7");
        boolean wasFound = binarySearch.isNumberOnList(1000, Arrays.asList(-4,2,3,4,5, 1000));
        System.out.println("Was found? - " + wasFound);
    }
}
