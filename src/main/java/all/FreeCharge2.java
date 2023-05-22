package all;

class MyThread1{

    int c = 1;
    public void printEvenNumber(int n){
        synchronized(this) {
            while (c < n) {
                try {
                    wait();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                if (c % 2 == 0)
                    System.out.println(Thread.currentThread() + ":" + c);
                c++;
            }
        }

    }

    public  void printOddNumber(int n){
        synchronized(this) {
            while (c < n) {
                try {
                    wait();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                if (c % 2 != 0)
                    System.out.println(Thread.currentThread() + ":" + c);
                c++;
                notify();
            }
        }

    }

//    @Override
//    public void run() {
//        for(int i = 1 ;i <=10 ; i++){
//            if(i%2 == 0) {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(i);
//            }else {
//                System.out.println(i);
//                notify();
//            }
//        }
//
//    }
}
public class FreeCharge2 {
    public static void main(String args[]){
        MyThread1 m = new MyThread1();
        Thread t1 = new Thread(() -> {
            m.printEvenNumber(10);
        });
        Thread t2 = new Thread(() -> {
            m.printOddNumber(10);
        });
        t1.start();
        t2.start();
    }
}

//final class Employ implements Comparable<Employ>{
//    final int id;
//    final String name;
//    final List<String> subjects = new ArrayList<>();
//
//    final String date;
//
//
//    Employ(int id, String name, List<String> subjects, String date) {
//        this.id = id;
//        this.name = name;
//        this.subjects.addAll(subjects);
//        this.date = date;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public List<String> getSubjects() {
//        List<String> temp = new ArrayList<>();
//        temp.addAll(subjects);
//        return temp;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    @Override
//    public int compareTo(Employ o) {
//        return 0;
//    }
//}
