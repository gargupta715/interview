class Stressed{
    String c;
    Integer startIndex;

    Integer endIndex;

}


public class Turbo {

    LinkedL root;
    class LinkedL{
        int value;
        LinkedL next;

        LinkedL random;

        LinkedL(int i){
            value = i;
            next = null;
            random = null;
        }

//        inset(int value){
//            LinkedL newNode =  new LinkedL();
//            newNode.value = value;
//            newNode.next = null;
//            if(root == null)
//                root = newNode;
//            else
//            {
//                LinkedL next
//                while()
//            }
//
//        }
    }
    public static void main(String args[]){
        //People usually text stressed words when they get excited.
        //A stressed word means one or more characters appear more than they should.
        //Ex: hellllooooo -- l and o are stressed characters here.
        //
        //Problem Statement:
        //===================
        //Write a function which take the string as input and
        //return details of stressed characters and the range they got stressed
        //
        //Ex: For "hellllooooo", returned data should contain below information
        //Character, start index and end index of stressed range
        //l stressed from index 2 to 5
        //o stressed from index 6 to 10
        //
        //Note: Consider a character is stressed if it appears more than 2 times continuously.
        //Use any collection or any custom data structure as return type.
        String s = "hellllooooo";
//        checkStressedData(s);
    }
    // gaaarimaaa
    // g -> 1
    // lastC = m
    //a -> 3 ll ->  Stres(a, 1, 3);
    // r -> 1
    // i -> 1
    // m -> 1
    // a->
    // 1->3->4->5


//    private LinkedL duplicate(LinkedL root, Map<origin, dupli> map){
//        LinkedL duplicate = null;
//        LinkedL prev = null;
//        LinkedL next = root;
//        while(next != null){
//            if(duplicate == null){
//                duplicate = new LinkedL(next.value);
//                prev = duplicate;
//            }else{
//                if(map.containsKey())
//                LinkedL newNode = new LinkedL(next.value);
//                prev.next = newNode;
//                if(next.random != null){
//                    LinkedL nn = duplicate(next.random, map);
//                }
//                prev = newNode;
//
//
//            }
//
//            next = next.next;
//        }
//
//        while(map.e){
//            map.entrySet().val.random = map.get(key.ram);
//
//        }
//
//        reutrn duplicate;
//
//
//    }
//    private static void checkStressedData(String s) {
//        Map<String , Integer> map = new HashMap<>();
//        List<Stressed> ll = new ArrayList<>();
//        String lastChar = "";
//        if(s.length() < 2)
//            System.out.println("Not a stressed word");
//        for(int i = 0; i < s.length();i++){
//            String chr = String.valueOf(s.charAt(i));
//            if(map.containsKey(chr)){
//                if(lastChar.equals(chr)) {
//                    map.put(chr, map.get(chr) + 1);
//                    if (map.get(chr) == 3) {
//                        Stressed st = new Stressed();
//                        st.c = chr;
//                        st.startIndex = i - 2;
//                        st.endIndex = i;
//                        ll.add(st);
//e
//                    }
//                }
//            }else {
//                map.put(chr, 1);
//                lastChar =  chr;
//            }
//        }
//
//        map.entrySet().stream().forEach(m -> ll.stream().filter(ss- > ss.getC().equals(m.getKey())).map( e-> e.setLastIndex(m.getValue() + e.getFirstIndex -1 )));
//
//    }





}
