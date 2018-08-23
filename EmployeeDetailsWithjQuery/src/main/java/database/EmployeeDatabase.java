package database;

import model.Employee;
import java.util.Map;
import java.util.HashMap;


public class EmployeeDatabase {
	Map<Integer, Employee> records;

	public EmployeeDatabase() {
		records = new HashMap<>();

		records.put(1, new Employee(1, "Jack", 22, "Junior Software Engineer", "AdaptiveU", 10000.00));
		records.put(2, new Employee(2, "Sky", 22, "Software Engineer", "AdaptiveU", 20000.00));
		records.put(3, new Employee(3, "Zee", 22, "Senior Software Engineer", "AdaptiveU", 30000.00));
		records.put(4, new Employee(4, "Zed", 22, "Junior Software Engineer", "AdaptiveU", 30000.00));
		records.put(5, new Employee(5, "Bridge", 22, "Junior Software Engineer", "AdaptiveU", 30000.00));
		records.put(6, new Employee(6, "Heera", 22, "Junior Software Engineer", "AdaptiveU", 30000.00));
		records.put(7, new Employee(7, "Monica", 22, "Junior Software Engineer", "AdaptiveU", 30000.00));
		records.put(8, new Employee(8, "Phoebe", 22, "Junior Software Engineer", "AdaptiveU", 30000.00));
		records.put(9, new Employee(9, "Dora", 22, "Junior Software Engineer", "AdaptiveU", 30000.00));
		records.put(10, new Employee(10, "Jennifer", 22, "Junior Software Engineer", "AdaptiveU", 30000.00));
	}

	public Employee getEmployeeDetails(Integer input) {
		return records.get(input);
	}
}




// for (Map.Entry<String, Employee> entry : records.entrySet()) {
// String id = entry.getKey();
// Employee employeeDetails = entry.getValue();
// if (id.equals(input))
// return employeeDetails;
// }
// return null;
