package org.zerock.ex2.domain;

import lombok.*;

import javax.persistence.*;

@Entity // 엔티티를 위한 클래스, 해당 클래스의 인스턴스들은 JPA 를 통해서 관리되는 엔티티 객체임
@Table(name= "tbl_memo") // DB에서 엔티티 클래스, 테이블 정보
@ToString
@Getter // Getter 메서드 생성
@Builder // 객체 생성
@AllArgsConstructor // Builder를 이용하려면 처리해줘야 컴파일 에러 발생안 함.
@NoArgsConstructor
public class Memo {

    @Id // @Entity가 붙은 클래스의 경우 PK에 해당하는 특정필드를 @Id로 지정해야함.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 자동생성
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;

}
