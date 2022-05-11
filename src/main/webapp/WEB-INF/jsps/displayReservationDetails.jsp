<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details:</h2>
Airlines: ${reservation.flight.operatingAirlines} <br/>
Flight Number: ${reservation.flight.operatingAirlines} <br/>
Departure City: ${reservation.flight.departureCity} <br/>
Arrival City: ${reservation.flight.arrivalCity} <br/>
Date of Departure: ${reservation.flight.dateOfDeparture} <br/>
Estimated Departure Time: ${reservation.flight.estimatedDepartureTime} <br/>

<h2>Passenger Details:</h2>
First Name : ${reservation.passnger.firstName} <br/>
Last Name : ${reservation.passnger.lastName} <br/>
Email: ${reservation.passnger.email} <br/>
Phone : ${reservation.passnger.phone} <br/>

<form action="completeCheckin" method="post">
Enter the number of bags you want to check in- <input type="text" name="numberOfBags"/>
<input type="hidden" value="${reservation.id}"/>
<input type="submit" value="Check In"/>
</form>

</body>
</html>