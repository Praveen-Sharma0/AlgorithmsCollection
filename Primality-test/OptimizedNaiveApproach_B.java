import java.util.Scanner;

class OptimizedNaiveApproach_B
{
    
    /* O (sqrt(N))  */

    static boolean isPrime(int n)
    {
        if(n<=1)    return false;
        if(n==2)    return true;

        if(n%2==0)  return false;

        int m=Math.sqrt(n);

        for (int i=3; i<=m; i+=2)  /* Skip Division test with Even Numbers */
            if (n%i==0)
                return false;

        return true;

    }
        
}