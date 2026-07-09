class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            str.append(strs.get(i).length()).append(":").append(strs.get(i));
        }
        return str.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int separator = str.indexOf(":", i);
            int length = Integer.parseInt(str.substring(i, separator));
            i = separator + 1;
            result.add(str.substring(i, i + length));
            i += length;

        }

        return result;
    }
}
