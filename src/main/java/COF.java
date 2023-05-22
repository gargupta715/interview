import java.util.HashMap;
import java.util.Map;

public class COF {
    public static void main(String args[]){
        String s = "garima"; //ot -> g->1,a->2
        Map<String, Integer> hm = new HashMap<>();

        for(int i = 0;i< s.length();i++){
            String st = String.valueOf(s.charAt(i));
            if(hm.containsKey(st)){
                hm.put(st, hm.get(st) + 1 );
            }else{
                hm.put(st, 1);
            }
        }
        hm.entrySet().forEach(e-> System.out.println(e.getKey() + "->" + e.getValue()));
    }
}
