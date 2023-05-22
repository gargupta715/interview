package onlineTest;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name = "admission")
@Entity
public class Admission {

    // unknown id generator annotation Exception
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "StudentSeq")
    @Column(name = "admission_no", updatable = false,nullable = false)
    private Long admission_no;

    @Column(name = "name")
    private String name;

    public Admission(String name) {
        this.name = name;
    }
}
