<%@page import="model.Personne"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Nom</th>
				<th scope="col">Prenom</th>
			</tr>
		</thead>
		<tbody>
			<%
				String res = "";
				ArrayList<Personne> liste = (ArrayList<Personne>) session.getAttribute("list");
				for (Personne p : liste) {
					res += "<tr><td>" + p.getNom() + "</td>";
					res += "<td>" + p.getPrenom() + "</td></tr>";
				}
				out.print(res);
			%>

		</tbody>
	</table>

</body>
</html>