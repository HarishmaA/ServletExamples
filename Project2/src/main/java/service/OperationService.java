package service;

public class OperationService {
	public String getResult(String operation, int... input) {
		if (operation.equals("Addition")) {
			return "<h4>The result is  " + add(input) + "</h4>";
		} else if (operation.equals("Subtraction")) {
			return "<h4>The result is  " + (input[0] - input[1]) + "</h4>";
		} else if (operation.equals("Multiplication")) {
			return "<h4>The result is  " + multiply(input) + "</h4>";
		} else {
			return "<h4>The result is  " + (input[0] / input[1]) + "</h4>";
		}
	}

	public int add(int... args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return sum;
	}

	public int multiply(int... args) {
		int product = 1;
		for (int i = 0; i < args.length; i++) {
			product *= args[i];
		}
		return product;
	}

	public String getCodeInParticularLanguage(String operation, String language) {
		switch (operation) {
		case "Addition":
			if (language.equals("C")) {
				return "<h2><br>int add(int args[]) {<br>" + "		int sum = 0;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			sum += args[i];<br>"
						+ "		}<br>" + "		return sum;<br>" + "	}<h2>";
			} else if (language.equals("C++")) {
				return "<h2><br>int add(int args[]) {<br>" + "		int sum = 0;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			sum += args[i];<br>"
						+ "		}<br>" + "		return sum;<br>" + "	}<h2>";
			} else if (language.equals("Java")) {
				return "<h2><br>public int add(int... args) {<br>" + "		int sum = 0;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			sum += args[i];<br>"
						+ "		}<br>" + "		return sum;<br>" + "	}<h2>";
			} else if (language.equals("Python")) {
				return "<h2><br>def add_numbers(x,y):<br>" + "   for num in x:\r\n" + "    sum=x[i]+sum";
			}
			break;

		case "Subtraction":
			if (language.equals("C")) {
				return "<h2><br>int subtract(int arg1, int arg2){<br>" + "  return arg1-arg2;<br>}<h2>";
			} else if (language.equals("C++")) {
				return "<h2><br>int subtract(int arg1, int arg2){<br>" + "  return arg1-arg2;<br>}<h2>";
			} else if (language.equals("Java")) {
				return "<h2><br>public int subtract(int arg1, int arg2){<br>" + "  return arg1-arg2;<br>}<h2>";
			} else if (language.equals("Python")) {
				return "<h2><br>def subtract_numbers(x,y):<br>" + "   sum = x - y<br>" + "   return sum<h2>";
			}
			break;

		case "Multiplication":
			if (language.equals("C")) {
				return "<h2><br>int multiply(int args[]) {<br>" + "		int product = 1;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			product *= args[i];<br>"
						+ "		}<br>" + "		return product;<br>" + "	}<h2>";
			} else if (language.equals("C++")) {
				return "<h2><br>int multiply(int args[]) {<br>" + "		int product = 1;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			product *= args[i];<br>"
						+ "		}<br>" + "		return product;<br>" + "	}<h2>";
			} else if (language.equals("Java")) {
				return "<h2><br>public int multiply(int... args) {<br>" + "		int product = 1;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			product *= args[i];<br>"
						+ "		}<br>" + "		return product;<br>" + "	}<h2>";
			} else if (language.equals("Python")) {
				return "<h2><br>def multiply_numbers(x,y):<br>" + "   sum = x * y<br>" + "   return sum<h2>";
			}
			break;
		case "Division":
			if (language.equals("C")) {
				return "<h2><br>int divide(int arg1, int arg2){<br>" + "  return arg1/arg2;<br>}<h2>";
			} else if (language.equals("C++")) {
				return "<h2><br>int divide(int arg1, int arg2){<br>" + "  return arg1/arg2;<br>}<h2>";
			} else if (language.equals("Java")) {
				return "<h2><br>public int divide(int arg1, int arg2){<br>" + "  return arg1/arg2;<br>}<h2>";
			} else if (language.equals("Python")) {
				return "<h2><br>def divide_numbers(x,y):<br>" + "   sum = x / y<br>" + "   return sum<h2>";
			}
			break;
		}
		return "";

	}
}
