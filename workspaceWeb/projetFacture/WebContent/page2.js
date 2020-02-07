var text1, text2, newBoisson, Commandes, type, nom, total;
Commandes = [];

function Commande(quantity, name, price, totalPrice) {
	this.quantity = quantity;
	this.name = name;
	this.price = price;
	this.totalPrice = totalPrice;
}

function getInformation() {
	if (nom && nom !== document.getElementById("inputName").value)
		Commandes = [];
	nom = document.getElementById("inputName").value;
	if (document.getElementById('gridRadios1').checked)
		type = document.getElementById('gridRadios1').value;
	else
		type = document.getElementById('gridRadios2').value;
	var quantity = document.getElementById("inputQuantity").value;
	var e = document.getElementById("inputState");
	var price = e.options[e.selectedIndex].value;
	var name = e.options[e.selectedIndex].text;
	if (quantity && nom) {
		newBoisson = new Commande(Number(quantity), name, Number(price),
				Number(price * quantity));
		Commandes.push(newBoisson);
		document.getElementById("inputQuantity").value = "";
		printClient();
		printDetail();
		printTotal();
	} else {
		alert("Veuillez saisir une quantité");
	}
}

function printClient() {
	if (type && nom)
		document.getElementById("person").innerHTML = "<p>" + type + " " + nom
				+ "</p>";
}

function printDetail() {
	if (document.getElementById("gridCheck1").checked == true) {
		text1 = "<table class=\"table\"><tbody>"
		for ( var x in Commandes) {
			text1 += "<tr>";
			text1 += "<td>" + Commandes[x].name + "</td>";
			text1 += "<td>" + Commandes[x].quantity + "</td>";
			text1 += "<td>" + Commandes[x].price + "€</td>";
			text1 += "<td>" + Commandes[x].totalPrice + "€</td>";
			text1 += "</tr>";
		}
		text1 += "</tbody></table>";
		document.getElementById("detail").innerHTML = text1;
	} else {
		document.getElementById("detail").innerHTML = "";
	}
}

function printTotal() {
	if (document.getElementById("gridCheck2").checked == true) {
		text2 = "<p>Total : ";
		total = 0;
		for ( var x in Commandes) {
			total += Number(Commandes[x].totalPrice);
		}
		text2 += total + "€</p>";
		document.getElementById("total").innerHTML = text2;
	} else {
		document.getElementById("total").innerHTML = "";
	}
}

function changeBackground() {
	var e = document.getElementById("inputState");
	var name = e.options[e.selectedIndex].text;
	switch (name) {
	case "Sprite":
		document.getElementById("boissonBackground").className = "sprite";
		break;
	case "Eau":
		document.getElementById("boissonBackground").className = "eau";
		break;
	default:
		document.getElementById("boissonBackground").className = "coca";
	}
}
