package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Spring Test Integration
 * 
 * Success
 * @SpringbootConfiguration 을 달고 있는 설정 클래스를 통해 스캔 했다.
 * 
**/

@SpringBootTest
public class MyApplicationTest02 {

	@Autowired
	private MyComponent myComponenet;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponenet);
	}
}
