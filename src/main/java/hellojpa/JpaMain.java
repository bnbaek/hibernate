package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by iopenu@gmail.com on 2020/07/01
 * Github : https://github.com/bnbaek
 */
public class JpaMain {

  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();
    tx.begin();

    try {
//      Member member = new Member();
//      member.setId(2L);
//      member.setName("HelloB");
//      em.persist(member);


//      Member findMember = em.find(Member.class, 1L);
//      System.out.println("findMember.id = " + findMember.getId());
//      System.out.println("findMember.name = " + findMember.getName());


//      //비영속(new,transient)
//      Member member = new Member();
//      member.setId(100L);
//      member.setName("HelloJPA");
//      //영속(manged)
//      System.out.println("=== BEFORE ===");
//      em.persist(member);
//      //준영속(detached)
//      em.detach(member);
//      System.out.println("=== AFTER ===");


//      Member member1 = em.find(Member.class, 100L);
//      Member member2 = em.find(Member.class, 100L);
//
//      System.out.println("result = "+(member1==member2));   //영속엔티티의 동일성 보장
//      //1차캐시로 반복 가능한 읽기(repeatable read)등급의 트랜젝션 격리수준을 데이터베이스가 아닌 애플리케이션 차원에서 제공

//      //영속 컨넥스트안에는 쓰기지연sql저장소 (insert쿼리를 쓰기지연sql저장소에 저장)
//      //commit을 하면 쓰기지연sql저장소에 데이터가 자장된다(플러시)
//      //persistence.xml -> <property name="hibernate.jdbc.batch_size" value="10"/>
//      Member memberA = new Member(200L, "A");
//      Member memberB = new Member(300L, "B");
//      em.persist(memberA);
//      em.persist(memberB);
//      System.out.println("==================");
//      //커밋시점에 insert 가 나간다 버퍼링같음


      //변경감지  //1차캐시상태를 snapshot을 넣어놓는다  스냅샵과 비교해서 다르면 쓰기지연sql에 변경내용을 넣어놓는다.
      Member findMember = em.find(Member.class, 200L);
      findMember.setName("zzzzzz");


      tx.commit();
    } catch (Exception e) {
      tx.rollback();
    } finally {
      em.close();
    }


    emf.close();
  }
}
