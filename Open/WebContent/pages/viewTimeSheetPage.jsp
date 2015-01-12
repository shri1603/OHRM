<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Open HRM Time Sheet</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
	
</script>

</head>
<body>
	<div id="wrap">
		<%@include file="sideMenu.jsp"%>
		<div id="container">
			<div id="title">Open HRM Time Sheet</div>
			<!-- 			<div id="content1 width=550 height=426"></div> -->
			<div id="filterSelect">
				<%@include file="timeSheetFilterControl.jsp"%>
			</div>
			<div id="filteredContent">
				<%@include file="viewTimeSheet.jsp"%>
			</div>
			<div id="footer">
				<%@include file="footer.jsp"%>
			</div>
		</div>
	</div>
</body>
</html>