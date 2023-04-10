package telsoft.docker.app;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.metadata.HikariDataSourcePoolMetadata;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@SpringBootApplication
@RestController
public class AppApplication {
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
    public String helloDocker() {
        Integer idleConnection = new HikariDataSourcePoolMetadata((HikariDataSource) dataSource).getIdle();

        return "Hello Docker! Idle connection to database is " + idleConnection;
    }

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
