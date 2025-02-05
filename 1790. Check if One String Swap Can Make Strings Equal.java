class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int swapAt = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (str1[i] == str2[i]) {
                continue;
            } else {
                if (swapAt > -1) {
                    char temp = str2[swapAt];
                    str2[swapAt] = str2[i];
                    str2[i] = temp;
                    break;
                } else {
                    swapAt = i;
                }
            }
        }
        if (s1.equals(String.valueOf(str2))) {
            return true;
        }
        return false;
    }
}
