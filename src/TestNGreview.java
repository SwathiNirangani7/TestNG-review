import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGreview {
		@Test
		public void test() {
			System.out.println("test");
		}
		@BeforeTest
		public void beforetest() {
			System.out.println("test1");
		}
		@AfterTest
		public void aftertest() {
			System.out.println("test2");
		}			
		}

