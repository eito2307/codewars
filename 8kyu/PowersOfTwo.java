/*
 *  Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).
 */
public class powersOfTwo {
    public static long[] powersOfTwo(int n) {
      long ret[] = new long[n + 1];
      for (int i = 0; i <= n; i++) ret[i] = 1L << i;
      return ret;
    }
  
  }