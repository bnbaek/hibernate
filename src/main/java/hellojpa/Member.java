package hellojpa;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

  @Column(name = "name", columnDefinition = "varchar(100) default 'EMPTY'")
  private String username;

  private Integer age;

  @Column(precision = 10, scale = 2) //precision 전체자리수 ,scale 소수점자리수
  private BigDecimal money;

  @Enumerated(EnumType.STRING)
  private RoleType roleType;

//  @Temporal(TemporalType.TIMESTAMP)
//  private Date createdDate;
//
//  @Temporal(TemporalType.TIMESTAMP)
//  private Date lastModifiedDate;

  private LocalDate createdDate;

  private LocalDateTime lastModifiedDate;

  @Lob
  private String description;

  @Transient  //DB에서 ignore
  private int temp;

  public Member() {
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public BigDecimal getMoney() {
    return money;
  }

  public void setMoney(BigDecimal money) {
    this.money = money;
  }

  public RoleType getRoleType() {
    return roleType;
  }

  public void setRoleType(RoleType roleType) {
    this.roleType = roleType;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getTemp() {
    return temp;
  }

  public void setTemp(int temp) {
    this.temp = temp;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public LocalDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }
}
