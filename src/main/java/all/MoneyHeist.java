import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MoneyHeist {
    private final static String statement = "{\n" +
            "    Money Heist Info\n" +
            "    {\n" +
            "        The most important character is the Professor\n" +
            "    }\n" +
            "    {\n" +
            "        Another character is that of Berlin\n" +
            "        {\n" +
            "            Berlin is in charge of the money heist\n" +
            "        }\n" +
            "    }\n" +
            "    {\n" +
            "        Another character is that of Moscow\n" +
            "        {\n" +
            "            Moscow is Denver's dad\n" +
            "        }\n" +
            "    }\n" +
            "    {\n" +
            "        Another character is that of Rio\n" +
            "        {\n" +
            "            Rio is a programmer\n" +
            "            {\n" +
            "                Rio is also a decent hacker\n" +
            "                {\n" +
            "                    Rio is quite happy to be a part of the heist\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "    {\n" +
            "        Another character is that of Denver\n" +
            "    }\n" +
            "}";


    public static void main(String[] args){
//        String hierarchicalData = "";

        String s = "{\\n    Money Heist\\n    {\\n        The most important character Professor\\n    }\\n    {\\n        Another character is Berlin\\n        {\\n            Berlin is in charge of the heist\\n        }\\n    }\\n    {\\n        Another character is Moscow\\n        {\\n            Moscow is Denver's father\\n        }\\n    }\\n    {\\n        Another character is Rio\\n        {\\n            Rio is a computer programmer\\n            {\\n                Rio is also a good hacker\\n                {\\n                    Rio is very happy to be a part of the heist\\n                }\\n            }\\n        }\\n    }\\n    {\\n        Another character is Denver\\n    }\\n}\\n";
        s.replaceAll("\\n", "\n");
        extractData(s, 1);
    }

    public static List<String> extractData(String hierarchicalData, int level) {
        String[] str = hierarchicalData.split("\\r?\r\n|\\r|\\s+");
        Stack<String> stack = new Stack<>();
        List<String> output =  new ArrayList<>();
        Arrays.stream(str).map(s -> stack.push(s));
        int count = 0;
        for (String s : str) {
            if (s.trim().equals("{")) {
                stack.push(s);
                count++;
            } else if (s.trim().equals("}")) {
                if (count == level)
                    output.add(stack.peek());
                stack.pop();
                count--;
            } else if (count == level)
                stack.push(s.trim());
        }
        output.stream().forEach(s -> System.out.println(s));

        return output;
    }
}
