package pracquestion2;
import java.util.ArrayList;

public class PracQuestion2 {

    public static void main(String[] args) {
        ArrayList<Integer> ElementList = new ArrayList<Integer>(5); //Contains 5 elements
        //Input those values
        ElementList.add(25);
        ElementList.add(50);
        ElementList.add(75);
        ElementList.add(100);
        ElementList.add(125);
        
        for(Integer x : ElementList) //First print of the list
            System.out.println(x);
        
        ElementList.set(2, 45); //To update the list and change the value at index 2
        
        System.out.println("ArrayList after replacement:");
        
        for (Integer x : ElementList) //Second print of the list/updated
            System.out.println(x);
        
        
    }
    
}
