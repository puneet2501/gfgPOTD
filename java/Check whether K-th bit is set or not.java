class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        n=n>>k; // move bits of integer to right by k digits
        if((n&1)==1) return true;  
        return false;
    }
    
}
/*
class CheckBit{
    static boolean checkKthBit(int n, int k){
        if((n>>k&1)==1) return true;
        return false;
    }
}
*/

/*
class CheckBit{
    static boolean checkKthBit(int n, int k){
        return ((n>>k&1)==1)?true:false;
    }
}
*/