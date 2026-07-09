class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int count = 0;
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);
        for (int i = 0; i <= s2.length() - k; i++) {
            String newStr = s2.substring(i, i + k);

            char[] chars = newStr.toCharArray();
            Arrays.sort(chars);

            if (sorted1.equals(new String(chars))) {
                return true;
            }
        }
        
        return false;
        }

}
