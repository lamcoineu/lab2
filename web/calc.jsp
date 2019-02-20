<%--
  Created by IntelliJ IDEA.
  User: LC
  Date: 2/20/2019
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
<h1>Tính toán giữa hai sô</h1>
<form action="/resultcalc" method="post" >
    <table style = width: 500px>
        <tr>
            <td><textarea name = 'number1' cols='10' rows='1'></textarea></td>
            <td><select name ='oparator'>
                <option value = 'cong'>+</option>
                <option value = 'tru'>-</option>
                <option value = 'nhan'>*</option>
                <option value = 'chia'>/</option>
            </select></td>
            <td><textarea name='number2' cols='10' rows='1'></textarea></td>

            <td><input type="submit" value="thực hiện">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
