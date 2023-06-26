package compositeDP;

public class CompositePatternDemo {
	public static int countEmployee(Employee position) {
		int count = 0;
		if (position.getSubordinates().size() == 0) {
			return 0;
		}
		else {
			return () // @@@
		}
		
//		for (Employee headEmployee : position.getSubordinates()) {
//			count++;
//
//			for (Employee employee : headEmployee.getSubordinates()) {
//				count++;
//			}
//		}
		return count;

	}

	public static void main(String[] args) {

		Employee CEO = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee headHRM = new Employee("Dan", "Head Human Resource", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);
		CEO.add(headHRM);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		System.out.println(countEmployee(headSales));

		// print all employees of the organization
		// System.out.println(CEO);

		for (Employee headEmployee : CEO.getSubordinates()) {
			if (headEmployee.getSubordinates().isEmpty()) {
				System.out.println("No subordinates " + headEmployee);
			}

			for (Employee employee : headEmployee.getSubordinates()) {
				if (employee.getSubordinates().isEmpty()) {
					System.out.println(employee);
				}
			}
		}

	}
}
