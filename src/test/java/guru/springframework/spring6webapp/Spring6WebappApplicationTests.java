package guru.springframework.spring6webapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = Spring6WebappApplication.class)
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
class Spring6WebappApplicationTests {

	@Test
	void contextLoads() {
	}

}
