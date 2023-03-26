import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        for (int i = 0; i<dataPoints.length;i++){
            int index = rnd.nextInt(dataPoints.length)+1; // gives a random valid index on myArray
            dataPoints[i] = index;
        }
        for (int i = 0; i<dataPoints.length;i++){
            System.out.printf("%d | ", dataPoints[i]);
        }
        double sum = 0;
        double average = 0;
        for (int i = 0; i<dataPoints.length;i++){
            sum = sum + dataPoints[i];
        }
        average = sum/dataPoints.length;
        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        int val = SafeInput.getRangedInt(in, "Enter the value between 1 and 100",1,100);
        int count = 0;
        for (int i = 0; i<dataPoints.length;i++){
            if (dataPoints[i] == val ){
                count ++;
            }
        }
        System.out.println("The number of times your value is found within the array is: " + count);

        int val2 = SafeInput.getRangedInt(in, "Enter another value between 1 and 100",1,100);
        int foundIndex = -1;
        for (int i = 0; i<dataPoints.length;i++){
            if (dataPoints[i] == val2 ){
                foundIndex = i;
                break;
            }
        }
        if (foundIndex == -1){
            System.out.println("Your value was not found in the array");
        }
        else{
            System.out.println("Your value was found at index " + foundIndex);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<dataPoints.length;i++){
            if (dataPoints[i]>max ){
                max = dataPoints [i];
            }
            if (dataPoints[i]<min ){
                min = dataPoints [i];
            }
        }
        System.out.println("the min value in the array is: " + min);
        System.out.println("the max value in the array is: " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }
    public static double getAverage(int values[])
    {
        double sum = 0;
        double average = 0;
        for (int i = 0; i<values.length;i++){
            sum = sum + values[i];
        }
        average = sum/values.length;
        return average;

    }


}