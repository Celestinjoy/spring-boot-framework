<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Add todos</title>
	</head>
	<body>
	   <%@ include file="common/navigation.jspf" %>
		<div class="container">
			<h1>Enter Todos details</h1>
			<form:form method="post" modelAttribute="todo">
            				Description: <form:input type="text" path="description"
            								required="required"/>
            								<form:errors path="description" cssClass ="text-warning"/>
            				<form:input type="hidden" path="done"/>
            				<form:input type="hidden" path="id"/>
            				<input type="submit" class="btn btn-success"/>

            			</form:form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.7.1/jquery.min.js"></script>

	</body>
</html>