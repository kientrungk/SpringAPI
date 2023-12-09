<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title> Nhân Viên</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        #addButton {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>Danh sách bán</h2>

  <a href="./product">Trang sản phẩm </a> 

    <table>
        <thead>
            <tr>
                <th>ID người bán</th>
                <th>ID sản phẩm</th>
                <th>Tên người bán</th>
                 <th>DOS</th>
                <th>Sino </th>
               
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${model.listresult}" var="item">
         	 <tr >
                <td > ${item.saleid}</td>
                <td > ${item.productid}</td>
                <td > ${item.salename}</td>
                <td > ${item.dos}</td>
                <td > ${item.slno}</td>
                </tr>
                </c:forEach>
        </tbody>
    </table>
</body>
</html>