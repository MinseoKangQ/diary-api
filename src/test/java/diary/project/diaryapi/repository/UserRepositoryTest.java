package diary.project.diaryapi.repository;

import com.zaxxer.hikari.HikariDataSource;
import diary.project.diaryapi.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static diary.project.diaryapi.connection.ConnectionConst.*;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void findById() throws SQLException {

        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
        UserRepository userRepository = new UserRepository(dataSource);

        // User 객체 save

        // User 객체 findById
    }
}