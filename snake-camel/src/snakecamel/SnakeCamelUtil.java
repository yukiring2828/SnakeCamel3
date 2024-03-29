package snakecamel;

public class SnakeCamelUtil {
	
	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");//a_b ←ab
		StringBuilder sb = new StringBuilder();//文字列の結合
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));//大文字
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
		if(s.length()>0){
		char first = s.charAt(0);
		char   upperFirst = Character.toUpperCase(first);//大文字
		String rest = s.substring(1);
		return upperFirst + rest;
		}
		return s;
	}

	static String uncapitalize(String s) {
		if(s.length()>0){
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);//小文字
		String rest = s.substring(1);
		return lowerFirst + rest;
		}
		return s;
	}
	
}
