package com.statisticalcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatisticalcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatisticalcalculatorApplication.class, args);
		
		
		  String numbers = "10,20,10,5,6,8,9,1,11,10";

        //
        String [] arrayNumbers  = numbers.split(",");

        int [] convertedNumbers= new int [arrayNumbers.length];
        int sum =0;
        int average =0;
        int count =0;
        int median =0;
        int stdTotal =0;
        int variance =0;
        int stanDev =0;
       //System.out.print(Arrays.toString(arrayNumbers));

       for (int i =0; i<arrayNumbers.length; i++){

          convertedNumbers[i] =Integer.parseInt(arrayNumbers[i]);

          // calculating sum of entered intergers
          sum += convertedNumbers[i];
          
          //calculating count 
          count++;

       }

       //sorting array of integers
         Arrays.sort(convertedNumbers);
         System.out.println(Arrays.toString(convertedNumbers));
         System.out.println("Sum = "+ sum);

       // calculating average
         average= sum/count;


         System.out.println("Average  = "+ average);
         System.out.println("Length  = "+ convertedNumbers.length);
         
      // Calculate median

         if (convertedNumbers.length % 2 == 0)
             median = ((int) convertedNumbers[convertedNumbers.length / 2] + (int) convertedNumbers[convertedNumbers.length / 2 - 1]) / 2;
         else
             median = (int) convertedNumbers[convertedNumbers.length / 2];

         System.out.println("Median  = "+ median );
         
         
       //Calculate Standard Deviation

         for (int i = 0; i < arrayNumbers.length; i++) {
             stdTotal = (int) (stdTotal + Math.pow(convertedNumbers[i] - average, 2));
         }
         variance = stdTotal / (convertedNumbers.length - 1);
         stanDev = (int) Math.sqrt(variance);
         
         
         System.out.println("Standard Deviation  = " + stanDev );
         
 
		
		
	}

}
