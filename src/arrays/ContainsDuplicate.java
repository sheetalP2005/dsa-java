package arrays;
import java.util.HashSet;

public boolean ContainsDuplicate(int[] nums) {

    HashSet<Integer> set= new HashSet<>();

    for(int num:nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false;
    
}
