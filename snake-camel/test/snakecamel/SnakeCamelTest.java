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
		//String testing = "abc_def";
		//String testing2 = "abc__def___gh";
		String testing3 = "_abc_def_";
		//String expected = "AbcDef";
		//String expected2 ="AbcDefGh";
		String expected3 ="AbcDef";
		//String answer = sna.snakeToCamelcase(testing);
		//String answer2 = sna.snakeToCamelcase(testing2);
		String answer3 = sna.snakeToCamelcase(testing3);
		//assertThat(answer,is(expected));
		//assertThat(answer2,is(expected2));
		assertThat(answer3,is(expected3));
		
	}
	
	@Test
	public void capitalize‚ð‚È‚¨‚·(){
		SnakeCamelUtil sna = new SnakeCamelUtil();
		String testing = "xyz";
		String testing2  ="a";
		String testing3 =" ";
		String expected ="Xyz";
		String expected2 = "A";
		String expected3 = " ";
		String answer = sna.capitalize(testing);
		String answer2 = sna.capitalize(testing2);
		String answer3 =sna.capitalize(testing3);
		assertThat(answer,is(expected));
		assertThat(answer2,is(expected2));
		assertThat(answer3,is(expected3));
	}
	
	@Test
	public void  uncapitalize‚ð‚È‚¨‚·(){
		SnakeCamelUtil sna = new SnakeCamelUtil();
		String testing = " ";
		String testing2 = "Xyz";
		String testing3 = "A";
		String expected =" ";
		String expected2 ="xyz";
		String expected3 ="a";
		String answer = sna.uncapitalize(testing);
		String answer2 = sna.uncapitalize(testing2);
		String answer3 = sna.uncapitalize(testing3);
		assertThat(answer,is(expected));
		assertThat(answer2,is(expected2));
		assertThat(answer3,is(expected3));
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
