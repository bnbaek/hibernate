package hellojpa;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by iopenu@gmail.com on 2020/07/01
 * Github : https://github.com/bnbaek
 */
@Entity
@Table(name = "MEMBER")
public class Member {
  @Id
  private Long id;

  @Column(name = "name")
  private String username;

  private Integer age;

  @Enumerated(EnumType.STRING)
  private RoleType roleType;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  @Temporal(TemporalType.TIMESTAMP)
  private Date lastModifiedDate;

  @Lob
  private String description;

  public Member() {
  }
}
