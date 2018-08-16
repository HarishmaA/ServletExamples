function add(type) {
	if (document.forms[0]["operation"].value == "Subtraction" ||document.forms[0]["operation"].value == "Division")
		document.getElementById("button").disabled = true;
	// Create an input type dynamically.
	var element = document.createElement("input");

	// Assign different attributes to the element.
	element.setAttribute("type", "number");
	element.setAttribute("value", "input");
	element.setAttribute("name", "input");
	element.setAttribute("required", "");
	var foo = document.getElementById("spanId");

	// Append the element in page (in span).
	foo.appendChild(element);

}
//not working properly
function validate() {
	var input = document.forms[0]["input"].value;
	if (input =="") {
		alert("The textbox should be filled out with number!!!");
		return false;
	}
}