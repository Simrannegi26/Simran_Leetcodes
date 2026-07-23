class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }
        //sort intervals on basis of 1st values
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();  //make a list of arrays- named result
        int[] newInterval = intervals[0];        // strt with 0 indexed interval , ex - [1,3]= newInterval
        for(int[] i : intervals ){

            if(i[0] <= newInterval[1]){                // overlapping intervals [2,6],[1,3], 2<=3 they overlap
                newInterval[1]= Math.max(newInterval[1], i[1]);    // keep larger ending point, newInterval=[1,6]
            }
            else{
                result.add(newInterval);            // no overlap , ex- [1,6],[8,10]
                newInterval= i;                     // newInterval= [8,10]
               
            }
        }
        result.add(newInterval);
        // Convert ArrayList<int[]> into int[][].
        return result.toArray(new int[result.size()][]);     

    }
}