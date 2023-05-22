import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

class Student{
    String name;
    Double marks;
    String className;

    public Student(String name, Double marks, String className) {
        this.name = name;
        this.marks = marks;
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(marks, student.marks) && Objects.equals(className, student.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks, className);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
public class Omnicell {

    public static void main(String args[]){
        Map<Student, Student>  mp = new HashMap<>();
        Student s1 = new Student("Test" , 46.0, "A");
        Student s2 = new Student("Test2" , 47.0, "B");
        Student s3 = new Student("Test" , 46.0, "A");
        System.out.println(s1.hashCode() + "- " + s3.hashCode());
        mp.put(s1,s2);
        mp.put(s1,s1);
        mp.put(s2,s2);
        mp.put(s3,s3);
        mp.put(s3, s1);
        mp.put(s3, s2);
        System.out.println(mp.size());

        List<Student> ll = Arrays.asList(s1,s2);

        Map<String,  Double> mp1 = ll.stream().collect(groupingBy(Student::getClassName, Collectors.averagingDouble(Student::getMarks)));
        List<Student> l = ll.stream().filter(e -> e.getClassName().equals("A")).collect(Collectors.toList());
        Double avg = ll.stream().collect(Collectors.averagingDouble(Student::getMarks));

        List<Integer> list = Arrays.asList(4,6,2,8);
        Double aveg = list.stream().collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(aveg.intValue() + " --" + (int)Math.ceil(65.6));

//        String input =  "22.3.6,2.3.6,2.8.8,2.0.1";
//        String[] nums = input.split(",");
//        for(int i=0;i<nums.length;i++){
//            nums[i] = nums[i].replaceAll("[.]", "");
//        }
//        sortArray(nums);
////        Arrays.sort(nums, Comparator.reverseOrder());
//        System.out.println(nums[0]);

    }

    private static void sortArray(String[] nums) {
        for(int i = 0;i< nums.length;i++){
            for(int j =1; j< nums.length;j++){
                if(Integer.parseInt(nums[j]) > Integer.parseInt(nums[i])){
                    swapInt(nums, i, j);
                }
            }
        }
    }

    private static void swapInt(String[] nums, int i, int j) {
        String temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
