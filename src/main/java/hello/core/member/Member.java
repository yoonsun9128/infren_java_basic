package hello.core.member;

public class Member {

    private Long id;
    private String name;
    private Grade grade;

    // 단축기 : command + n
    //생성자 만들기
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //getter setter -> 데이터를 가지고오는 세팅도 가능함
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
