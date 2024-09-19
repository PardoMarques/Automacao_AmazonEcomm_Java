package caiomarques.projeto.selenium.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeTest extends BaseTest {

	@Test
	void test() {
		//when
		// this.loginPage.signin();
		
		//then
		Assertions.assertTrue(this.homePage.getCategoryTitleText().equals("ABC"));
		Assertions.assertFalse(this.homePage.getCurrentUrl().equals(this.URL));
	}

}
