package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.AfterClass;
import org.junit.Test;

public class SnakeCamelTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void  snakeToCamelcase‚ð‚È‚¨‚»‚¤(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String testing = "t_e_s_t";
		String expected = "TEST";
		String answer = snake.snakeToCamelcase(testing);
		assertThat(answer,is(expected));
		
		
	}
	
	@Test
	public void camelToSnakecase‚ð‚È‚¨‚»‚¤(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String testing = "quest";
		String expected ="Quest";
		String answer = snake.snakeToCamelcase(testing);
		assertThat(answer,is(expected));
	}
}
