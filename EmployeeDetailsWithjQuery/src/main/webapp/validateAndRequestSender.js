// When the page is fully loaded...
$(document).ready(function() {
	$("#identityNumber").click(function(event) {
		var identity = $("#id").val();
		if (identity === "") {
			$(".error-messages").text("INPUT FIELD IS EMPTY!!!").fadeIn();
			return false;
		}
		if (isNaN(identity)) {
			$(".error-messages").text("NOT A VALID NUMBER!!!").fadeIn();
			return false;
		}
		if (!((Number(identity)>=1) && (Number(identity)<=10))) {
			$(".error-messages").text("ENTER A NUMBER FROM 1 TO 10!!!").fadeIn();
			return false;
		}
		$(".error-messages").empty().fadeOut();
		$.get('/details', {
			"identity" : identity
		}, function(data) { // on success
			printEmployeeDetails(data);
		},"json").fail(function() { // on failure
			$(".error-messages").text("<h3>REQUEST FAILED!!!</h3>").fadeIn();;
		});
	});
});
