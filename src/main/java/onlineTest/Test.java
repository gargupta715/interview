package onlineTest;

public class Test {
    public static void main(String args[]){
        AdmissionRepo rep = new AdmissionRepo();
        rep.save(new Admission("test"));
    }
}
