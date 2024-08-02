class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int currDay = 0; currDay < temperatures.length; currDay++) {
            while(
                !stack.isEmpty() && 
                temperatures[currDay] > temperatures[stack.peek()]
            ) {
                int prevDay = stack.pop();
                res[prevDay] = currDay - prevDay;
            }
            stack.add(currDay);
        }
        return res;
    }
}
