class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int n1=nums[i];
            hm.put(n1,hm.getOrDefault(n1,0)+1);
        }
        for(int key:hm.keySet()){
            if(hm.get(key)!=1){
                return true;
                
            }
        }
        return false;
        
    }
}