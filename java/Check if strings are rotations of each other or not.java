class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        s1 = s1+s1;
        return s1.contains(s2);
    }
    
}