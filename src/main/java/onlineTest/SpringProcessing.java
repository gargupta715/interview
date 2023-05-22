package onlineTest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Component
public class SpringProcessing{
    List<String> ll = new ArrayList<>();

    public  List<String> setData(String data){
        if(Pattern.matches("//d", data)){
            throw new IllegalArgumentException("input value conatins numeric value");
        }

        this.ll.add(data);
        return this.ll;
    }
}
