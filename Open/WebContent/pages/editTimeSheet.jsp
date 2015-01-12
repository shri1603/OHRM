<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script language="javascript" type="text/javascript"></script>
</head>
<body>
	<form action="" id="timesheetTableForm" name="timesheetTableForm">
		<table class="table table-bordered table-condensed">
			<tr>
				<th>Select</th>
				<th>Start hours</th>
				<th>End hours</th>
				<th>Lunch start time</th>
				<th>Lunch end time</th>
				<th>Total hours</th>
			</tr>
			<c:forEach var="i" begin="1" end="5">
				<tr>
					<td><input type="checkbox"></td>
					<td><input type="text"></td>
					<td><input type="text"></td>
					<td><input type="text"></td>
					<td><input type="text"></td>
					<td><input type="text"></td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" id="" name="" value="Submit"> <input
			type="button" id="" name="" value="Cancel">
	</form>
</body>
</html>