package javaCodePractice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Java Program";  // Create in pool area
		String str2=new String("JAVA"); // created in heap area
        //Different method  to creating String;
		
		//1.
		char c[]={'H','e','l','l','o'};
        //String str3=new String(c);
        String str3=new String(c,1,3);
        System.out.println(str3);
        
        byte b[]={65,66,67,68};
        //String str4=new String(b);
        String str4=new String(b,1,2);
        System.out.println(str4);
        
        
        String str5="Java";
        //String str6="Java";
        String str6=new String("Java");
        System.out.println(str5==str6);
	}

}
