class Solution {
    public List<Integer> partitionLabels(String str) {
        List<Integer> partitions = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            int strtIndx=i;
            int endIndx= str.lastIndexOf(str.charAt(strtIndx));
            for(int s= strtIndx+1; s<=endIndx; s++){
                int endIndxofNextchar=str.lastIndexOf(str.charAt(s));
                if(endIndxofNextchar > endIndx){
                    endIndx = endIndxofNextchar;
                }
            }
            partitions.add(endIndx - strtIndx +1);
            i= endIndx;
        }
        return partitions;  
    }
}