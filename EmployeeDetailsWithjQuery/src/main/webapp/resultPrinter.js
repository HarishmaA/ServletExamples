function printEmployeeDetails(str) {
	// First empty the <div> completely and add a title.
	$("#employeeDetails-results").empty().append(
			"<h1>EMPLOYEE DETAILS:</h1><br>").append(
			"<h2>" + JSON.stringify(str) + "</h2>");
};






