package mock;

public class Demo {
	public static void main(String[] args) {
	String str="T!e?c^h$w|a!@v#$e";
	str= str.replaceAll("[^a-z,A-Z,0-9]", "");
	System.out.println(str);
}
	

}
