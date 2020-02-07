/**
 * 
 */
function testCalcul(operator) {
	var a = document.getElementById("nb1").value;
	var b = document.getElementById("nb2").value;
	calcul(operator, Number(a), Number(b));
}

function calcul(operator, a, b) {
	switch (operator) {
	case '+':
		document.getElementById("answer").innerHTML = add(a, b);
		break;
	case '-':
		document.getElementById("answer").innerHTML = sous(a, b);
		break;
	case '/':
		document.getElementById("answer").innerHTML = div(a, b);
		break;
	case '*':
		document.getElementById("answer").innerHTML = mult(a, b);
		break;
	}
}

function add(a, b) {
	return a + b;
}

function mult(a, b) {
	return a * b;
}

function sous(a, b) {
	return a - b;
}

function div(a, b) {
	return a / b;
}