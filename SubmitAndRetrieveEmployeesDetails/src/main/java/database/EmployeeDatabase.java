package database;

import model.Employee;
import java.util.Map;
import java.util.HashMap;

public class EmployeeDatabase {
	private Map<Integer, Employee> records;

	public EmployeeDatabase() {
		records = new HashMap<>();
	}

	// Singleton methods
	private static EmployeeDatabase dbInstance = null;

	public static EmployeeDatabase getInstance() {
		if (dbInstance == null) {
			dbInstance = new EmployeeDatabase();
		}
		return dbInstance;
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
