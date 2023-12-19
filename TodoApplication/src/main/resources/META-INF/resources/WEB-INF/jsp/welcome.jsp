<html>
   <head>
   		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
   		<title>welcome page</title>
   	</head>
        <body>
		<%@ include file="common/navigation.jspf" %>
		<div class="container">
			<h1>Welcome ${name}</h1>
			<a href="list">Manage</a> your todos
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
		</body>
</html>