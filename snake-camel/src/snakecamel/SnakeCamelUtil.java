package snakecamel;

public class SnakeCamelUtil {
	
	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("[_]+");//a_b ©ab
		//char a = '_';
		StringBuilder sb = new StringBuilder();//•¶š—ñ‚ÌŒ‹‡
		for (int i = 0; i < words.length; i++) {
			//char s =words[i].charAt(0);
			//if(s==a) words[i]=words[i].substring(1,3);
			sb.append(capitalize(words[i]));//‘å•¶š
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j,i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0);
		char   upperFirst = Character.toUpperCase(first);//‘å•¶š
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);//¬•¶š
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
	//public static void main(String args[]){
	//	String ab = "aiueo";
	//	uncapitalize(ab);
	//	System.out.println(ab);
	//}
	
	
}
