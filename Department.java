//super class
	class SuperDepartment{
		public String departmentName() {
			
			// Return Super Department.
			return "Super Department";
		}
		// Create getTodaysWork method
		public String getTodaysWork() {
			return "No Work as of now."; // return
		}
		//Create getWorkDeadline method
		public String getWorkDeadline() {
			return "Nil"; // return
		}
		//Create isTodayAHoliday method
		public String isTodayAHoliday() {
			return "Today is not a holiday"; // return
		}
	}
	// AdminDepartment extends SuperDepartment
	class AdminDepartment extends SuperDepartment{
		@Override
		public String departmentName() { // method
			return "Admin Department"; //Override the departmentName()
		}
		@Override
		public String getTodaysWork() { // method
			return "Complete your documents Submission"; // Override
		}
		@Override
		public String getWorkDeadline() { // method
			return "Complete by EOD"; //Override method
		}
	}
	class HrDepartment extends SuperDepartment {
		@Override
		public String departmentName() {
			return "Hr Department";
		}
		@Override
		public String getTodaysWork() {
			return "Fill today's timesheet and mark your attendance";
		}
		@Override
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		public String doActivity() {
			return "team Lunch";
		}
	}
	class TechDepartment extends SuperDepartment{
		@Override
		public String departmentName() {
			return "Tech Department";
		}
		@Override
		public String getTodaysWork() {
			return "Complete coding of module 1";
		}
		@Override
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		public String getTechStackInformation() {
			return "core Java";
		} 
	}
	public class Department{
		public static void main(String[] arg) {
			
			AdminDepartment ad=new AdminDepartment();
			System.out.println("................");
			System.out.println("Welcome to " + ad.departmentName());
			System.out.println(ad.getTodaysWork());
			System.out.println(ad.getWorkDeadline());
			System.out.println(ad.isTodayAHoliday());
			System.out.println("................");
			System.out.println();
			
			HrDepartment hr=new HrDepartment();
			System.out.println("Welcome to " + hr.departmentName());
			System.out.println(hr.doActivity());
			System.out.println(hr.getTodaysWork());
			System.out.println(hr.getWorkDeadline());
			System.out.println(hr.isTodayAHoliday());
			System.out.println("................");
			System.out.println();
			
			TechDepartment tech=new TechDepartment();
			System.out.println("Welcome to " + tech.departmentName());
			System.out.println(tech.getTodaysWork());
			System.out.println(tech.getWorkDeadline());
			System.out.println(tech.getTechStackInformation());
			System.out.println(tech.isTodayAHoliday());
			System.out.println(".................");
			System.out.println();
	
		}
	}
