import java.util.Scanner;

class OptimizedNaiveApproach_A
{
    
    /* O (sqrt(N))  */

    static boolean isPrime(int n)
    {
        if(n<=1)    return false;
        if(n<=3)    return true;
        if(n%2==0 || n%3==0)
            return false;

        int m=(int)(Math.sqrt(n));

        for(int i=5;i<=m;i=i+6)                 //Any Prime Number is of the form 6k(+ or -)1 except 2,3
            if(n%i ==0 || n%(i+2)==0)           //If (N*N) > P then 'P' isn't Prime if any Prime Number <=N divides it !
                return false;

        return true;

    }
        
}