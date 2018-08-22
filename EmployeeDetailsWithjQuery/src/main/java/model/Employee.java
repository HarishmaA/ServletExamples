package model;


public class Employee {
	private static String companyName = "Full";
	private int employeeId;
	private String employeeName;
	private int employeeAge;
	private String employeeDesignation;
	private String teamName;
	private double employeeSalary;

	// Constructor
	public Employee(int employeeId, String employeeName, int employeeAge, String employeeDesignation, String teamName,
			double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeDesignation = employeeDesignation;
		this.teamName = teamName;
		this.employeeSalary = employeeSalary;
	}

//	@Override
//	public String toString() {
//		return "<h2>\tCOMPANY NAME - " + companyName + "<br>\n\tEMPLOYEE-ID - " + employeeId + "<br>\n\tEMPLOYEE-NAME -" + employeeName + "<br>\n\tAGE-" + employeeAge + "<br>\n\tDESIGNATION - "
//				+ employeeDesignation + "<br>\n\tTEAMNAME - " + teamName + "<br>\n\tEMPLOYEE-SALARY - " + employeeSalary+"</h2>";
//	}

}
