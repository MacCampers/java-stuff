<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page1</title>
</head>
<body>
<form action="Servlet2" method="post">
  <div class="form-example">
    <label for="name">Enter your nom: </label>
    <input type="text" name="nom" id="name" required>
  </div>
  <div class="form-example">
    <label for="email">Enter your prenom: </label>
    <input type="text" name="prenom" id="prenom" required>
  </div>
    <div class="form-example">
    <label for="age">Enter your age: </label>
    <input type="number" name="age" id="age" required>
  </div>
  <div class="form-example">
    <input type="submit" value="Submit">
  </div> 
</form>

</body>
</html>