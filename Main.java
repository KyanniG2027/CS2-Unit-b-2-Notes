public class Main {

   public static void main(String []args) {
      
      //WHILE loops repeat instructions in the loop body 
      //as long as a certain CONDITION is TRUE

      //COUNTER-CONTROLLED while loop 
      //STEP #1: INTIALIZE control variable
      int count = 2;
      //STEP #2: Test a condition
      while (count <= 10 ) {
         //loop body executes while count <= 5 its now 10 is true 
         System.out.println(count);

         //Step #3: Change the variable
         // (do this after the statements you want to repeat)
         count++;
      }

         //FOR LOOPS: when you know HOW MANY TIMES to iterate 
         // for (initialize; test condition; change)

         for (int i = 5; i <= 27; i++) {
            System.out.println(i);  
         }

         // Modify the CHANGE step to skip certain numbers
         for ( int i = 0; i<= 10; i+=2) {
         System.out.println(i);
         }
         //Watch your INITIAL value and your OPERATOR 
         for ( int i = 0; i < 11; i += 2) {
            System.out.println(i);
         }
       //DECREMENTING for loops are like counting backwards
       for (int i = 10; i >=0; i--){
       System.out.println(i);
       }
       //Print a special message when i is 1

       if (i==1){
         System.out.println("Blast Off!🚀");
       }



   }  

}
