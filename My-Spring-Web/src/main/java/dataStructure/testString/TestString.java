package dataStructure.testString;

public class TestString {
	public static void main(String[] args){
		 String str1 = "abc";
		String str1_ = str1 + "bc";
		String str1New = new String("abc");
		
		System.out.println("abc == a + bc is " + (str1_ == "abcbc"));
		System.out.println("abc == new abc is " + str1 == str1New);
	}
	
//	public void test(){
//		System.out.println("abc == a + bc is" + str1 == "abc");
//		System.out.println("str1");
//		System.out.println(str1 == "abc");
//		System.out.println("str1_");
//		System.out.println(str1_ == "abc");
//	}

}
