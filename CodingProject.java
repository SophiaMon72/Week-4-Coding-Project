package week04;

public class CodingProject {

  public static void main(String[] args) {
    //1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
          System.out.println("Question 1:");
    
          int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
         //a. Programmatically subtract the value of the first element in the array from the value in the last element
            //of the array (i.e. do not use ages[7] in your code). Print the result to the console.
          /*
           * I used ".length" to get the length of ages, then subtracted it by 1
           * to get the index of the last element since the array starts at 0
           */
          ages[ages.length - 1] -= ages[0];
          
          System.out.println(ages[ages.length - 1]);
          
         //b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have
            //more elements).  
              //i. Make sure that there are 9 elements of type int in this new array.  
              //ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the
              //new array ages2 from the last element of ages2). 
              //iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
          int[] ages2 = {23, 83, 41, 65, 19, 33, 11, 74, 59};
          
          /*
           * Same as above
           */
          ages2[ages2.length - 1] -= ages2[0];
          
          System.out.println(ages2[ages2.length - 1]);

         //c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
          int averageAge = 0;
          /*
           * I use a, enhanced for loop to go through each
           * age and add them all together
           */
          for (int age : ages2) {
              averageAge += age;
          }
          
          /*
           * I then divide "averageAge" by the number of ages
           * in ages2
           */
          System.out.println(averageAge / ages2.length);
          
    //2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”,
       //“Bob”.
          System.out.println("Question 2:");
          
          String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
          
         //a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the
            //result to the console.
          int averageNameLength = 0;
          
          /*
           * I use an enhanced for loop to separate each name
           * and use ".length" to get the length of all the names
           * and add them all to "averageNameLength"
           */
          for (String name : names) {
              averageNameLength += name.length();
          }
          
          /*
           * I then divide "averageNameLength" by the number of names
           * to get the average
           */
          System.out.println(averageNameLength / names.length);
          
         //b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces,
            //and print the result to the console.
          /*
           * I use an enhanced for loop to go through take each name
           * and add it to the variable a
           */
          for (String name2 : names) {
              System.out.print(name2 + " ");
          }
          
          
          
    //3. How do you access the last element of any array?
          /*
           * Use the ".length" method to grab the size
           * of the array, then subtract that by 1 since
           * arrays start at 0.
           */   

    //4. How do you access the first element of any array?
          /*
           * The first element's position will always
           * be at index 0.
           */

    //5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and
       //add the length of each name to the nameLengths array.
          int[] nameLengths = new int[6];
          
          for (int i = 0; i < nameLengths.length; i++) {
              for (String name3 : names) {
                  nameLengths[i] = name3.length();
              }
          }

    //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print
       //the result to the console.
          System.out.println("Question 6:");
          
          int sumNameLengths = 0;
          
          for (int num : nameLengths) {
              sumNameLengths += num;
          }
          
          System.out.println(sumNameLengths);

    //7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself
       //n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
          System.out.println("Question 7:");
          
          System.out.println(concatenateWord("Awesome", 5));

    //8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be
       //the first and the last name as a String separated by a space).
          System.out.println("Question 8:");
          
          String firstName = "Jane";
          String lastName = "Doe";
          
          System.out.println(fullName(firstName, lastName));

    //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater
       //than 100.
          System.out.println("Question 9:");
          
          int[] coolArray = {23, 12, 32, 3, 23, 12};
          
          System.out.println(isGreaterThan(coolArray));

    //10. Write a method that takes an array of double and returns the average of all the elements in the array.
          System.out.println("Question 10:");
          
          double[] coolerArray = {54.56, 32.46, 29.74, 39.22, 81.09};
          
          System.out.println(averageOfArray(coolerArray));

    //11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array
        //is greater than the average of the elements in the second array.
          System.out.println("Question 11:");
          
          double[] coolestArray = {84.23, 22.23, 2.67, 29.87, 95.37};
          double[] lameArray = {94.37, 29.08, 55.29, 84.76, 11.99};
          
          System.out.println(averageOfBoth(coolestArray, lameArray));

    //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns
        //true if it is hot outside and if moneyInPocket is greater than 10.50.
          System.out.println("Question 12:");
          
          boolean isHotOutside = true;
          double moneyInPocket = 12.89;
          
          System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

    //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created
        //it.
          /*
           * The problem I chose to go with was to create a method that takes a number
           * and returns true if it's a prime number and false if it's not.
           */
          System.out.println("Question 13:");
          
          int num =11;
          
          System.out.println(primeNumber(num));

  }
  
  //Method for Question 7:
    public static String concatenateWord (String str, int num) {
          String word = "";
          for(int i = 0; i < num; i++) {
              word += str;
          }
          return word;
    }
    
  //Method for Question 8:
    public static String fullName (String str1, String str2) {
          String str3 = str1 + " " + str2;
          return str3;
    }
    
  //Method for Question 9:
    public static boolean isGreaterThan (int[] arr) {
          int sum = 0;
          for (int num : arr) {
              sum += num;
          }
          if (sum > 100) {
              return true;
          } else {
              return false;
          }
    }
    
  //Method for Question 10:
    public static double averageOfArray (double[] arr) {
          double average = 0;
          for (double num : arr) {
              average += num;
          }
          return average / arr.length;
    }
    
  //Method for Question 11:
    public static boolean averageOfBoth (double[] arr1, double[] arr2) {
          double average1 = 0;
          double average2 = 0;
          for (double num1 : arr1) {
              average1 += num1;
          }
          for (double num2 : arr2) {
              average2 += num2;
          }
          if (average1 / arr1.length > average2 / arr2.length) {
              return true;
          } else {
              return false;
          }
          
    }
    
  //Method for Question 12:
    public static boolean willBuyDrink (boolean heat, double money) {
          if (heat && money > 10.5) {
              return true;
          } else {
              return false;
          }
    }
    
  //Method for Question 13:
     public static boolean primeNumber (int number) {
          //I'm going to keep track of how many factors there are with the variable "prime"
          int prime = 0;
          for (int i = 1; i <= number; i++) {
              if (number % i == 0) {
                  prime++;
              }
          }
          if (prime == 2) {
              return true;
          } else {
            return false;
          }
          
     }
    
}
