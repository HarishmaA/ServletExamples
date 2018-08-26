$(document).ready(function() {

	$("#submit-info").click(function() {
		var employeeId = $("#employeeId").val();
		var employeeName = $("#employeeName").val();
		var employeeAge = $("#employeeAge").val();
		var employeeDesignation = $("#employeeDesignation").val();
		var teamName = $("#teamName").val();
		var employeeSalary = $("#employeeSalary").val();
		
		if(employeeId.length==0||employeeName.length==0||employeeAge.length==0||employeeDesignation.length==0||teamName.length==0||employeeSalary.length==0){
			$(".error-messages-while-submitting").text("INPUT FIELD IS EMPTY!!!").fadeIn();
		return false;
	}

		var name_regex = /^[a-zA-Z]+$/;
		var number_regex=/^[0-9]+$/;
		var decimalNumber_regex=/^[0-9]+(\.[0-9]+)?$/;
		if(!employeeId.match(number_regex)||!employeeName.match(name_regex)||!employeeAge.match(number_regex)||!employeeSalary.match(decimalNumber_regex)){
			$(".error-messages-while-submitting").text("NOT A VALID INPUT!!!").fadeIn();
		return false;
	}
	
			$.post('details-submission', {
			"employeeId" : employeeId,
			"employeeName" : employeeName,
			"employeeAge" : employeeAge,
			"employeeDesignation" : employeeDesignation,
			"teamName" : teamName,
			"employeeSalary" : employeeSalary
		}, function() { // on success
			$(".message").text("INSERTION SUCCESSFUL!!!").fadeIn();
		}, "json").fail(function() { // on failure
			$(".message").text("INSERTION FAILED!!!").fadeIn();

		});
		$(".message").empty().fadeOut();
	});

});




// $.ajax({
// type: 'POST',
// url: '/details',
// data: {"employeeId" : employeeId,
// "employeeName" : employeeName,
// "employeeAge" : employeeAge,
// "employeeDesignation" : employeeDesignation,
// "teamName" : teamName,
// "employeeSalary":employeeSalary},
// dataType: 'json',
// complete: function(data){
// alert(data);
// }
// });
