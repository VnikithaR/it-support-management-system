<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
</head>
<body>
    <h1>Admin Dashboard</h1>
    <h2>Users</h2>
    <table>
        <thead>
            <tr>
                <th>Username</th>
                <th>Role</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.username}</td>
                    <td>${user.role}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
