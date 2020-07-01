package hellojpa;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by iopenu@gmail.com on 2020/07/01
 * Github : https://github.com/bnbaek
 */
@Entity
public class Member {
    @Id
    private Long id;
    private String name;
    //031-355-5947

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
