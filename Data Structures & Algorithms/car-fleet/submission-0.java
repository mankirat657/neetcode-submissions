class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        double[][] unit = new double[n][2];

        for (int i = 0; i < n; i++) {
            unit[i][0] = position[i];
            unit[i][1] = (double) (target - position[i]) / speed[i];
        }

        Arrays.sort(unit, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || unit[i][1] > st.peek()) {
                st.push(unit[i][1]);
            }
        }

        return st.size();
    }
}