/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wouldyoukindlyshufflethisarray;
import java.util.*;
/**
 *
 * @author nokid4249
 */
public class WouldYouKindlyShuffleThisArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] bigArray = new int[400000];
       for (int i = 0; i < bigArray.length; i++){
           bigArray[i] = i;
           System.out.print(bigArray[i] + " ");
       }
       System.out.println();
       long startShuffle = System.currentTimeMillis();
       
       bigArray = shuffler(bigArray);
       long elapsedTimeMillis = System.currentTimeMillis()-startShuffle;
       long startDisplay = System.currentTimeMillis();
       for (int i = 0; i < bigArray.length; i++){
           System.out.print(bigArray[i] + " ");
       }
       long elapsedTimeMillis2 = System.currentTimeMillis() - startDisplay;
       System.out.println("\nTime Taken to shuffle (milliseconds): " + elapsedTimeMillis);
       System.out.println("\nTime Taken to display (milliseconds): " + elapsedTimeMillis2);
    }
    static int[] shuffler(int[] imArray ){
        Random rand = new Random();
        for (int i = imArray.length - 1; i > 0; i--){
            int index = rand.nextInt(i+1);
            int mix = imArray[index];
            imArray[index] = imArray[i];
            imArray[i] = mix;
        }
        return imArray;
    }
}
