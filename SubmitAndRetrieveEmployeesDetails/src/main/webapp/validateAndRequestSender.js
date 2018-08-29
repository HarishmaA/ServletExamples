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
		if (!((Number(identity)>=1) && (Number(identity)<=100))) {
			$(".error-messages").text("ENTER A NUMBER FROM 1 TO 100!!!").fadeIn();
			return false;
		}
		$(".error-messages").empty().fadeOut();
		$.get('/details', {
			"identity" : identity
		}, function(data) { // on success
			printEmployeeDetails(data);
		},"json").fail(function(data) { // on failure
			$(".error-messages").html("<h3>REQUEST FAILED!!!</h3>").fadeIn();
			$(".id-not-exist").html(data.responseText).fadeIn();
		});
		$(".error-messages").empty().fadeOut();
		$(".id-not-exist").empty().fadeOut();
	});
});
