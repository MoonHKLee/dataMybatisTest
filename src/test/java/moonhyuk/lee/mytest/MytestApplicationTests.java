package moonhyuk.lee.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Sql(scripts = "classpath:test-init.sql")
class MytestApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	void test() {
		User user = userMapper.findUserWithOrders(1L);
		assertThat(user).isNotNull();
	}

}

