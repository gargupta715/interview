package onlineTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
class MyBook{
    @Autowired
    private MyLibrary myLibrary;
    private void display(){
        System.out.println("MyBook");
    }
}

class MyLibrary{
    private void display(){
        System.out.println("MyLibrary");
    }
}

@SpringBootApplication
public class DataLoad implements ApplicationRunner {

    @Autowired
    private MyLibrary myLibrary;
    public static void main(String... args){
        SpringApplication.run(DataLoad.class,args);
//        SpringBootApplication.run();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        myLibrary.display();

    }
}
