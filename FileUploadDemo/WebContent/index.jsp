<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload Form</title>
</head>
<body>

<form action="/FileUploadDemo/MyServlet" method="post" enctype="multipart/form-data">
	<input type="text" name="description" />
    <input type="file" name="file" />
    <input type="submit" />
</form>


</body>
</html>