// Setter getter methods:

class setGetAgeName{
    int age;
    String name;
    void setterAge(int age1){
		   age = age1;
	}
	
	void setterName(String name1){
		   name = name1;
	}
	
	int getterAge(){
		   return age;
	}
	
	String getterName(){
		   return name;
	}
}

public class SetAgeName1
{
	public static void main(String[] args) {
		setGetAgeName s1 = new setGetAgeName();
		
		s1.setterAge(21);
		s1.setterName("Varun Pareek");
		
		System.out.println(s1.getterAge());
		
		System.out.println(s1.getterName());
	}
}
