import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class epam {
    // String strSentence = " Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM"; //
    // Output should be exactly like --> {BYE-3 ,EPAM-6, HI-2}

    public static void main(String args[]){
        String strSentence = " Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";
        String[] strArr = strSentence.trim().split(" ");
        Map<String, Long> mp1= Arrays.stream(strArr).map(i -> i.trim().toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1 , TreeMap::new));

        //.collect( toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        mp1.entrySet().forEach(e-> System.out.println(e.getKey() +":" + e.getValue()));


//        Map<String, Long> mp = Arrays.stream(strArr).map(i -> i.trim().toUpperCase())
//        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        TreeMap<String, Long> t = new TreeMap<>();
//        t.putAll(mp);
//        t.entrySet().stream().filter(e -> e.getValue() > 1)
//                .forEach(m -> System.out.println(m.getKey().toUpperCase()  + "-" + m.getValue()));
    }
    //There is a MyProduct class ( ID, NAME & Description ) if you delete MyLineItem,
    // then Product should exist ( ID , QUANTITY & PRODUCT ) if you delete MYOrder,
    // then all LineItem must be deleted. ( ID , NAME & ARRAY of LineItem )

    class MyProduct{
        private Integer id;
        private String name;
        private String description;

//        @OnetoMany
//        private List<MyLineItem> myLineItemList;
    }
    class MyLineItem{
        private Integer id;
        private Integer qty;

        private MyProduct p;

    }

    // Imaging you are creating a video game where there are vehicles of different types and you want to first draw them then move
    // them, but your java design must not care about which vehicles you have and you will add later
//    Vehicle{
//
//    }
//    VelService
//    {
//        a()
//    }
//    Vehicles
//    {
//        paint();
//
//    }
//
//    class TruckSerive implements Vehicles
//    class TempoService implements  Vehi
//    TempoService  = new TempoService();






}
