class Solution {
    public static boolean isRotated(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        if (m != n) {
            return false;
        }

        boolean a = true, b = true;
        for (int i = 0; i < n; i++) {
            if (a && (str1.charAt(i) != str2.charAt((i + 2) % n)))
                a = false;

            if (b && (str1.charAt(i) != str2.charAt(((i - 2) + n) % n)))
                b = false;

            if (!a && !b)
                return false;
        }

        return true;
    }
}