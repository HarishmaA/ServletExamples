package service;

import java.util.List;

public class OperationService {
	public String getResult(String operation, List<Integer> arrayList) {
		if (operation.equals("Addition")) {
			return "<h4>The result is  " + add(arrayList) + "</h4>";
		} else if (operation.equals("Subtraction")) {
			return "<h4>The result is  " + (arrayList.get(0) - arrayList.get(1)) + "</h4>";
		} else if (operation.equals("Multiplication")) {
			return "<h4>The result is  " + multiply(arrayList) + "</h4>";
		} else {
			return "<h4>The result is  " + (arrayList.get(0) / arrayList.get(1)) + "</h4>";
		}
	}

	public int add(List<Integer> arrayList) {
		return arrayList.stream().reduce(0, (sum, element) -> sum + element);
	}

	public int multiply(List<Integer> arrayList) {
		// int product = 1;
		// for (int i = 0; i < args.length; i++) {
		// product *= args[i];
		// }
		// return product;
		return arrayList.stream().reduce(1, (product, element) -> product * element);
	}

	public String getCodeInParticularLanguage(String operation, String language) {
		switch (operation) {
		case "Addition":
			switch (language) {
			case "C":
				return "<h2><br>int add(int args[]) {<br>" + "		int sum = 0;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			sum += args[i];<br>"
						+ "		}<br>" + "		return sum;<br>" + "	}<h2>";
			case "C++":
				return "<h2><br>int add(int args[]) {<br>" + "		int sum = 0;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			sum += args[i];<br>"
						+ "		}<br>" + "		return sum;<br>" + "	}<h2>";
			case "Java":
				return "<h2><br>public int add(int... args) {<br>" + "		int sum = 0;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			sum += args[i];<br>"
						+ "		}<br>" + "		return sum;<br>" + "	}<h2>";
			case "Python":
				return "<h2><br>def add_numbers(x,y):<br>" + "   for num in x:<br>" + "    sum=x[i]+sum";
			}
			break;

		case "Subtraction":
			switch (language) {
			case "C":
				return "<h2><br>int subtract(int arg1, int arg2){<br>" + "  return arg1-arg2;<br>}<h2>";
			case "C++":
				return "<h2><br>int subtract(int arg1, int arg2){<br>" + "  return arg1-arg2;<br>}<h2>";
			case "Java":
				return "<h2><br>public int subtract(int arg1, int arg2){<br>" + "  return arg1-arg2;<br>}<h2>";
			case "Python":
				return "<h2><br>def subtract_numbers(x,y):<br>" + "   sum = x - y<br>" + "   return sum<h2>";
			}
			break;

		case "Multiplication":
			switch (language) {
			case "C":
				return "<h2><br>int multiply(int args[]) {<br>" + "		int product = 1;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			product *= args[i];<br>"
						+ "		}<br>" + "		return product;<br>" + "	}<h2>";
			case "C++":
				return "<h2><br>int multiply(int args[]) {<br>" + "		int product = 1;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			product *= args[i];<br>"
						+ "		}<br>" + "		return product;<br>" + "	}<h2>";
			case "Java":
				return "<h2><br>public int multiply(int... args) {<br>" + "		int product = 1;<br>"
						+ "		for (int i = 0; i < args.length; i++) {<br>" + "			product *= args[i];<br>"
						+ "		}<br>" + "		return product;<br>" + "	}<h2>";
			case "Python":
				return "<h2><br>def multiply_numbers(x,y):<br>" + "   sum = x * y<br>" + "   return sum<h2>";
			}
			break;
			
		case "Division":
			switch (language) {
			case "C":
				return "<h2><br>int divide(int arg1, int arg2){<br>" + "  return arg1/arg2;<br>}<h2>";
			case "C++":
				return "<h2><br>int divide(int arg1, int arg2){<br>" + "  return arg1/arg2;<br>}<h2>";
			case "Java":
				return "<h2><br>public int divide(int arg1, int arg2){<br>" + "  return arg1/arg2;<br>}<h2>";
			case "Python":
				return "<h2><br>def divide_numbers(x,y):<br>" + "   sum = x / y<br>" + "   return sum<h2>";
			}

		}
		return "Option is not valid";

	}
}
