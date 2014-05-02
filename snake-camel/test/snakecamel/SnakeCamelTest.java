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
	public void  snakeToCamelcase‚ð‚È‚¨‚·(){
		SnakeCamelUtil sna = new SnakeCamelUtil();
		String testing = "test_est_st_t";
		String expected = "TestEstStT";
		String answer = sna.snakeToCamelcase(testing);
		assertThat(answer,is(expected));
		
		
	}
	
	@Test
	public void capitalize‚ð‚È‚¨‚·(){
		SnakeCamelUtil sna = new SnakeCamelUtil();
		String testing = "xyz";
		String expected ="Xyz";
		String answer = sna.capitalize(testing);
		assertThat(answer,is(expected));
	}
	
	@Test
	public void  uncapitalize‚ð‚È‚¨‚·(){
		SnakeCamelUtil sna = new SnakeCamelUtil();
		String testing = "Xyz";
		String expected ="xyz";
		String answer = sna.uncapitalize(testing);
		assertThat(answer,is(expected));
	}
	
	@Test
	public void camelToSnakecase‚ð‚È‚¨‚·(){
		SnakeCamelUtil sna = new SnakeCamelUtil();
		String testing = "AbcDef";
		String expected ="abc_def";
		String answer = sna.camelToSnakecase(testing);
		assertThat(answer,is(expected));
	}
	@Test
	public void camelToSnakecase‚ð‚È‚¨‚·2(){
		SnakeCamelUtil sna = new SnakeCamelUtil();
		String testing = "Abc";
		String expected ="abc";
		String answer = sna.camelToSnakecase(testing);
		assertThat(answer,is(expected));
	}
}
