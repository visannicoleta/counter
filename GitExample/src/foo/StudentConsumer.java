package foo;

public class StudentConsumer {
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setAge(21);
		s1.setName("Ion");
		
		System.out.println(s1.getName()+" "+s1.getAge());
	}
}
