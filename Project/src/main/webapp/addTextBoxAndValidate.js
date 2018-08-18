function add(type) {
	if (document.forms[0]["operation"].value == "Subtraction"
			|| document.forms[0]["operation"].value == "Division")
		document.getElementById("button").disabled = true;

	// Create an input type dynamically.
	var element = document.createElement("input");

	// Assign different attributes to the element.
	element.setAttribute("type", "text");
	// element.setAttribute("value", "input");
	element.setAttribute("name", "input");
	// element.setAttribute("required", "");

	var foo = document.getElementById("spanId");

	// Append the element in page (in span).
	foo.appendChild(element);

}

// This function here is only a cross-browser events stopper
stopEvent = function(ffevent) {

	ffevent.stopPropagation();
	ffevent.preventDefault();

}

function validateAllInputBoxes(ffevent) {
	var inputs = document.getElementsByTagName('input');
	for (var i = 0; i < inputs.length; ++i)
		if (inputs[i].type === 'text') {
			if (inputs[i].value === '') {
				alert("EMPTY INPUT FIELDS!!!");
				stopEvent(ffevent);
			}
			if (isNaN(inputs[i].value)) {
				alert("NOT A VALID NUMBER!!! ");
				stopEvent(ffevent);
			}
		}
}