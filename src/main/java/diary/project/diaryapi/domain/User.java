package diary.project.diaryapi.domain;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;
    private String pw;

    public User() { }

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
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

    @Override
    public String toString() {
        return String.format("diary.project.diaryapi.domain.User[id:%s, pw:%s]", id, pw);
    }

}
