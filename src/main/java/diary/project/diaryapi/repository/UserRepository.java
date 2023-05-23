package diary.project.diaryapi.repository;

import diary.project.diaryapi.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.NoSuchElementException;

@Slf4j
public class UserRepository {

    private final DataSource dataSource;

    public UserRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // 로그인 로직에서 호출하는 메서드
    public User findById(Connection con, String id) throws SQLException {

        String sql = "select * from where user_id = ?";

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();
            if(rs.next()) {
                User user = new User();
                user.setId(rs.getString("user_id"));
                user.setPw(rs.getString("user_pw"));
                user.setName(rs.getString("user_name"));
                return user;
            }
            else { // 데이터가 없음
                throw new NoSuchElementException();
            }
        } catch (SQLException e) {
            log.error("데이터 없음", e);
            throw e;
        } finally {

        }
    }
}
