<%--
  Created by IntelliJ IDEA.
  User: LC
  Date: 2/19/2019
  Time: 10:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Đặt Hàng</title>
</head>
<body>
<h1>Đặt Hàng</h1>
<form method='post' action=''/order'>
<table>
    <tr>
        <td>Họ Tên:</td>
        <td><input name = 'name'/></td>
    </tr>
    <tr>
        <td>Địa Chỉ:</td>
        <td><textarea name='address' cols = '40' rows='5'></textarea></td>
    </tr>
    <tr>
        <td>Thành Phố:</td>
        <td>
            <select name = 'city'>
                <option>Hà Nội</option>
                <option>Thành Phố Hồ Chí Minh</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>Vận Chuyển:</td>
        <td>
            <input type = 'radio' name = 'deliveryMethod' value='HanoiPost'/>Hà Nội Post
            <input type = 'radio' name = 'deliveryMethod' value='GiaoHangTiemKiem'/>Giao Hàng Tiết Kiệm
        </td>
    </tr>
    <tr>
        <td>Ghi Chú</td>
        <td><textarea name='note' cols = '40' rows=' 5'></textarea></td>
    </tr>

    <tr>
        <td>Đăng Kí Nhận Bản Tin</td>
        <td><input type = 'checkbox' name = 'catalogRequest' /></td>
    </tr>

    <tr>
        <td>&nbsp;</td>
        <td><input type = 'reset' value = 'nhập lại' />
            <input type = 'submit' value='xác nhận'/>
        </td>
    </tr>

</table>
</form>

</body>
</html>
