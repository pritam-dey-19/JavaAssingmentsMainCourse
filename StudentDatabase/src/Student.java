//create some getter and setter methods to create a student class where we can print student details in main class
public class Student {
	
		private int studentId;
		private String studentName;
		private String collegeName;
		private String branch;
		private String contactNumber;
		private String address;
		
		public int getStudentId() {
			return this.studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return this.studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getCollegeName() {
			return this.collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public String getBranch() {
			return this.branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String getContactNumber() {
			return this.contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

	}
