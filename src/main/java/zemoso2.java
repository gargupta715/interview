import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class zemoso2 {
    // using streams api
    //[1,4,3,8,5,6,9]
    //can you return sum of all odd numbers from this list

    public static void main(String args[]){
        List<Integer>  ll = Arrays.asList(1,4,3,8,5,6,9); // 1,3,5,9
        long sum = ll.stream().filter(e->e%2!=0).collect(Collectors.summarizingInt(e-> e)).getSum();
        System.out.println(sum);


        //    book reviews . com

        //    book details
        // Book -> id, name , price, title, publication, @OneToMany List<Book_Review> , authorid, rating

        //

        //    author biogr
        // Author -> id , author_name, dob, contact, address , @OnetoMany List<Book>,

        //    book reviews

        // Book_Review - > id , comment, user_name/user_id, date, book_id;

        //    given by users
        // User - > is, user_name, phone no, addre,

        //    db schema

        //    tables coln

    }
}
