package diary.project.diaryapi.domain;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;
    private String pw;
    private String name;

    public User() { }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }
}
