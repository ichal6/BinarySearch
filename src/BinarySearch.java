import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BinarySearch {
    public boolean isNumberOnList(int searchNumber, List<Integer> list){
        try{
            search(searchNumber, list);
        } catch (NoSuchElementException ex){
            return false;
        }
        return true;
    }

    private int search(int searchNumber, List<Integer> list){
        if(list.size() == 0){
            throw new NoSuchElementException();
        }

        int medium = list.size()/2;
        int mediumValue = list.get(medium);

        if(list.get(medium) == searchNumber){
            return medium;
        }

        if(list.size() <= 1){
            throw new NoSuchElementException();
        }

        if(mediumValue < searchNumber){
            List<Integer> rightList = new ArrayList<>(list.subList(medium + 1, list.size()));
            return search(searchNumber, rightList);
        }else{
            List<Integer> leftList = new ArrayList<>(list.subList(0, medium));
            return search(searchNumber, leftList);
        }
    }
}
