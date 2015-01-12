<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<form action="" id="timesheetViewTable" name="timesheetViewTable">
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
					<td>Location/Branch : </td>
					<td>Location/Branch : </td>
					<td>Location/Branch : </td>
					<td>Location/Branch : </td>
					<td>Location/Branch : </td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" id="" name="" value="Submit"> <input
			type="button" id="" name="" value="Cancel">
	</form>
</body>
</html>