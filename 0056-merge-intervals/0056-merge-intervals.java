class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }
        //sort intervals on basis of 1st values
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();  //make a list of arrays- named result
        int[] newInterval = intervals[0];        // strt with 0 indexed interval
        for(int[] i : intervals ){

            if(i[0] <= newInterval[1]){                // overlapping intervals [1,3],[2,6]
                newInterval[1]= Math.max(newInterval[1], i[1]);    // keep larger ending point
            }
            else{
                result.add(newInterval);
                newInterval= i;
               
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);

    }
}