<%--
  Created by IntelliJ IDEA.
  User: dylan.kilbride
  Date: 06/12/2018
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration</h1>
    <form action="register_user" method="post">
        <table style="with: 50%">
            <tr>
                <td>Registration Email</td>
                <td><input type="text" name="email" /></td>
            </tr>
            <tr>
                <td>Registration Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>

</body>
</html>
