// first solution : brute force traverse
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i < nums.length - 1;i++){
            int complement = target - nums[i];
            for(int j = i+1;j < nums.length;j++){
              if(nums[j] == complement){
                  return new int[]{i,j};
              }
          }  
        }
        return null;
    }
}

// second solution : using hashmap two path hash
class Solution{
    public int[] twoSum(int[] nums,int target){
        // using HashMap to store the mapping of number and index
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        
        for(int i = 0;i < nums.length;i++){
            hashMap.put(nums[i],i);
        }
        
        for(int i = 0;i < nums.length;i++){
            int complement = target - nums[i];
            
            // to find whether the hashMap contains the complement key
            // and to void a number being used twice
            if(hashMap.containsKey(complement) && hashMap.get(complement) != i){
                return new int[]{hashMap.get(complement),i};
            }
        }
        return null;
    }
}

// second solution : using hashmap one path
class Solution{
    public int[] twoSum(int[] nums,int target){
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        
        for(int i = 0;i < nums.length;i++){
            
            int complement = target - nums[i];
            
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement),i};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }
    
}

// second solution : using hashmap one path optimized

class Solution{
    public int[] twoSum(int[] nums,int target){
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        
        for(int i = 0;i < nums.length;i++){
            
            int complement = target - nums[i];
            if(hashMap.containsKey(nums[i])){
                return new int[]{hashMap.get(nums[i]),i};
            }
            
            hashMap.put(complement,i);
        }
        return null;
    }
}
