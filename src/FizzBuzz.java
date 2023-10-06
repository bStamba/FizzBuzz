public class FizzBuzz {

    public static void main(String[] args){

        //We want to print out the numbers from 1 to 100, with 3 stimpulations:
        //if the number is divsible by 5 then  we want to print "Buzz" instead of the number
        //if the number is divisible by 3 we want to print "Fizz" instead
        //if it is divisible by both we want to print "FizzBuzz" instead
        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            if(i % 5 == 0){
                System.out.println("Buzz");
            }
            if(i % 5 != 0 && i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}
