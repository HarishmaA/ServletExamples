package database;

import model.Employee;
import java.util.Map;
import java.util.HashMap;

public class EmployeeDatabase {
	private static Map<Integer, Employee> records = new HashMap<>();

	public boolean containsId(Integer id) {
		return records.containsKey(id);
	}

	public void addDetails(Integer id, Employee employee) {

		records.put(id, employee);
	}

	public Employee getEmployeeDetails(Integer input) {
		if (!records.containsKey(input)) {
			return null;
		}
		return records.get(input);
	}
}
