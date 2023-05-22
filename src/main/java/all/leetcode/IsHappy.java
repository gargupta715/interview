package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsHappy {
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while(true){
            int num=pow(n);
            if(num==1) return true;
            if(map.containsKey(num)) return false;
            else map.put(num, 1);
            n=num;
        }
    }
    public int pow(int n){
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum=sum+(temp*temp);
            n/=10;
        }
        return sum;
    }
}
