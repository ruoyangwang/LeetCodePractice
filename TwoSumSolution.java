public class TwoSumSolution {
    static HashMap<Integer, Integer> cache = new HashMap<Integer,Integer>();
    
    public int[] twoSum(int[] nums, int target) {
        int i = 1;
        for(int num: nums){       //first iteration put everything into hashtable for lookups
            cache.put(num,i);
            i++;
        }
        
        for(int num:nums){       //second iteration looks up the remainder
            if(cache.get(target-num)!=null) //found the pairs
            {
                if(cache.get(num)<cache.get(target-num)){
                    int[] ret= {cache.get(num),cache.get(target-num)};
                    return ret;
                }
                else if(cache.get(num)>cache.get(target-num)){
                    int[] ret= {cache.get(target-num),cache.get(num)};
                    return ret;
                }
            }
            
        }
        return null;
    }
}
