//main class of the student database project
public class MainStudent {

	public static void main(String[] args) {
		Student pritam = new Student();
		pritam.setStudentId(1);
		pritam.setStudentName("Pritam Dey");
		pritam.setContactNumber("8274XXXXX8");
		pritam.setCollegeName("RCC Institute Of Information Technology");
		pritam.setBranch("Computer Science & Engineering");
		pritam.setAddress("Kolkata");
		
		System.out.println(pritam.getStudentId());
		System.out.println(pritam.getStudentName());
		System.out.println(pritam.getContactNumber());
		System.out.println(pritam.getBranch());
		System.out.println(pritam.getCollegeName());
		System.out.println(pritam.getAddress());


	}

}
