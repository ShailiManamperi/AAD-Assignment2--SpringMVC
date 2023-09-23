package lk.ijse.aad.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "lk.ijse.gdse.assignment2springaad.repo")
public class JPAConfiguration {
}
