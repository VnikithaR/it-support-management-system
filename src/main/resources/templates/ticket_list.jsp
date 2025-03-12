<!DOCTYPE html>
<html>
<head>
    <title>Ticket List</title>
</head>
<body>
    <h1>Ticket List</h1>
    <table>
        <thead>
            <tr>
                <th>Ticket ID</th>
                <th>Description</th>
                <th>Status</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ticket" items="${tickets}">
                <tr>
                    <td>${ticket.ticketId}</td>
                    <td>${ticket.description}</td>
                    <td>${ticket.status}</td>
                    <td><a href="/ticketDetails?ticketId=${ticket.ticketId}">View Details</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
