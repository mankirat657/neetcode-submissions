class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i  = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            String s = "";
            for(char c : arr){
                s += c;
            }
           if (map.containsKey(s)) {
                map.get(s).add(strs[i]);
            } else {
                map.put(s, new ArrayList<>(List.of(strs[i])));
            }

        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
         String key = entry.getKey();
            List<String> value = entry.getValue();

            result.add(value);
        }
       
        return result;

    }
}
