/**
 * 
 */

function saveFunction()
{
	var name = document.getElementById("inputName").value;
	var surname = document.getElementById("inputSurname").value;
	var age = document.getElementById("inputAge").value;
	if (surname == "" || name == "" || age == "") {
		alert("Les champs ne sont pas correctement remplis");
	} else {
		document.getElementById("nameStatus").innerHTML = "Nom: " + name.toUpperCase();
		document.getElementById("surnameStatus").innerHTML = "Prenom: " +surname.toLowerCase();
		if (age > 0 && age < 120) {
			document.getElementById("ageStatus").innerHTML =  "Age: " +age;
			age > 18 ? document.getElementById("status").innerHTML =  "Status: mineur" : document.getElementById("ageStatus").innerHTML =  "Status: mineur";
		} else {
			alert("Age incorrect");
		}
	}
	
}