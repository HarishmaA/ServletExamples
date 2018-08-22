// When the page is fully loaded...
$(document).ready(function() {
	$("button").click(function(event) {
		var identity = $("#id").val();
		if (identity === "") {
			alert("INPUT FIELD IS EMPTY!!!");
			return false;
		}
		if (isNaN(identity)) {
			alert("NOT A VALID ID!!!");
			return false;
		}
		if (!((Number(identity)>=1) && (Number(identity)<=10))) {
			console.log(Number(identity));
			alert("ENTER A NUMBER FROM 1 TO 10!!!");
			return false;
		}
		$.get('/details', {
			"identity" : identity
		}, function(data) { // on success
			printEmployeeDetails(data);
		}).fail(function() { // on failure
			alert("Request failed.");
		},"json");
	});
});
