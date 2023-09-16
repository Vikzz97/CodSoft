package CodSoft;
import java.util.*;
 
public class TaskNo1 {
 
    public static void main(String[] args) 
    {
        Random randI = new Random();
        int myRandInt = randI.nextInt(100);
        myRandInt = myRandInt+1;
        System.out.println("Random number between 1 and 100: "+myRandInt);
    }
}