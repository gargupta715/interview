//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class OSFf {
//    static class Student {
//        int studentId;
//        String studentName;
//        String branch;
//        Student(int id, String name, String brnach){
//            this.studentId = id;
//            this.studentName = name;
//            this.branch =brnach;
//        }
//
//    }
//
//    // Care and race anagram or not
//    // listen silent
//
//    public static void main(String args[]){
//        String s1 = "Care";
//        String s2 = "race";
//        System.out.println(isAnagram(s1, s2));
//
//        String s3= "Hello World";
//        isPresent(s3);
//
//        List<Student> ll =  new ArrayList<>();
//        Student student1 = new Student(1,"test11", "EC");
//        Student student2 = new Student(2,"test21", "CS");
//        Student student3 = new Student(3,"test31", "EC");
//        ll.add(student1);
//        ll.add(student2);
//        ll.add(student3);
//        Map<String, List<Student>>  map = new HashMap<>();
//
//        //  Get the branch names which are having students count more than 10 except CS branch
//        //ii) Get the Student who is having least result
//
////        select branch,count(*) from Student where branch != "CS" groupBy branch having count(*)>10;
////        select * from student order by ASEC LIMIT 1,1;
//
//
//       ll.stream().map(student ->
//                {
//                    if(map.containsKey(student.branch)){
//                        List<Student> l1 = map.get(student.branch);
//                        l1.add(student);
//                    }else {
//                        List<Student> l2 = new ArrayList<>();
//                        l2.add(student);
//                        map.put(student.branch, l2);
//                    }
//                    return null;
//                }
//        );
//
//        //[{
//        //  studentId:"1",
//        //  studentName:"test11",
//        //  branch:"EC"
//        //},
//        //{
//        //  studentId:"1",
//        //  studentName:"test21",
//        //  branch:"CS"
//        //},
//        //{
//        //  studentId:"1",
//        //  studentName:"test11",
//        //  branch:"EC"
//        //},
//        //{
//        //  studentId:"1",
//        //  studentName:"test21",
//        //  branch:"ME"
//        //}]
//
//    }
//
//    private static boolean isPresent(String s) {
//        char[] cos = {'a', 'e','i','o','u'};
//        for(int i=0;i<5;i++){
//            char c = cos[i];
//
//            if(s.contains(String.valueOf(c)))
//                return true;
//        }
//        char[] ss = s.toCharArray();
////        for (int i=0;i< ss.length;i++){
////            for()
////        }
//    }
//
//    private static boolean isAnagram(String s1, String s2) {
//        if(s1.length() != s2.length())
//            return false;
//
//        int len = s1.length();
//
//        char[] chars = new char[26];
//        for(int i=0;i< len;i++){
//            chars[s1.charAt(i)]++;
//            chars[s2.charAt(i)]--;
//        }
//
//        for(int i=0;i<26 ;i++)
//        {
//            if(chars[i] !=0)
//                return false;
//            else return true;
//        }
//
//        return false;
//    }
//}