package dataStructure.testString;

public class TestString {
	public static void main(String[] args){
		testString6();
	}
	
	public static void testString1(){
		String str1 = "abc";
		String str1_ = str1 + "bc";
		String str1New = new String("abc");
		System.out.println("str1 == abc is " + (str1 == "abc")); //true
		System.out.println("abc == a + bc is " + (str1_ == "abcbc")); //false
		System.out.println("abc == new abc is " + str1 == str1New);//false
	}
	
	public static void testString2(){
		String str1 = " OK ";
		System.out.println(1 + 2 + str1 + 3 + 4); //3 OK 34
	}
	
	public static void testString3(){
		String string = "0123456789";
		String str = string.substring(3,6);
		System.out.println(str);
	}
	
	public static void testString4(){
		String str = new String("123");
		
		System.out.println(str == "123");
		str = str.intern();
		System.out.println(str);
		System.out.println(str == "123");
	}
	
	public static void testString5(){
		StringBuffer buffer = new StringBuffer().append("123");
	}
	
	public static void testString6(){
		String string = "hello";
		char[] chars = {'h','e','l','l','o'};
		System.out.println(string.length());
		System.out.println(chars.length);
	}

}
