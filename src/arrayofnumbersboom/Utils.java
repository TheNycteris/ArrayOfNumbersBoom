/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofnumbersboom;

/**
 *
 * @author Pau
 */
public class Utils {
    public static final int ARRAY_SIZE = 10;
    public static final int MAX_VALUE = 100;
    
    public static int[] createArray(){
        int[] randomArray = new int [(int)Math.floor(Math.random()*ARRAY_SIZE)];
        
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = (int)Math.floor(Math.random()*MAX_VALUE);
        }
        return randomArray;
    }
    
    
    public static void findSeven(int randomArray[]){
        for(int i = 0; i < randomArray.length; i++){
            int number = randomArray[i];
            boolean sevenFound = false;
            
            sevenFound = searchByDigit(number, sevenFound, randomArray, i);
            
            if(sevenFound == true){
                i = randomArray.length+1;
            }
        }
    }
    
    public static boolean searchByDigit(int number, boolean sevenFound, int[] randomArray, int i){
        for(int j = 0; j < String.valueOf(randomArray[i]).length(); j++){
                int lastDigit = number % 10;
                number = number / 10;
                if(lastDigit == 7){
                    System.out.println("Boom!");
                    sevenFound = true;
                    j = String.valueOf(randomArray[i]).length()+1;
                }
            }
        return sevenFound;
    }
    
    public static void printArray(int[] randomArray){
        for(int i = 0; i < randomArray.length; i++){
            System.out.println(i+": "+randomArray[i]);
        }
    }
    
}
