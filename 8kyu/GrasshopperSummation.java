/*Summation
 * Write a rogram that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0. Your function only needs to return the result, 
 * what is shown between parentheses in the example below is how you reach that result and it's not part of it, see the sample tests.
 */

 public class GrassHopper{
    public static int summation(int n){
        int sum =0;
        for (int i =1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
 }