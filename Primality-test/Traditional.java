
class Traditional
{
    
    /*  O(N)  */


    static boolean isPrime(int n)
    {
        if(n<2)
            return false;

        for(int i=2;i<n;i++)          /* n --> =(n/2) because a Number can be divided by
                                         'i' if 'i' is half or less  
                                      */
        {
            if(n%i ==0)
                return false;
        }
        return true;
    }
}
