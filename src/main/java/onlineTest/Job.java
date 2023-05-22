package onlineTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// -2
@Entity
@Table(name = "job_tbl")
public class Job {

    @Id
    @Column(columnDefinition = "job_id")
    private long jobId;
    private String jobType;


}
