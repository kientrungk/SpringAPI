<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title> Sản phẩm</title>
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
    <h2>sản phẩm</h2>

  <a href="./sale">Trang người bán </a> 

    <table>
        <thead>
            <tr>
                <th>STT</th>
                <th>Tên sản phẩm</th>
                <th>Mô tả</th>
                 <th>Ngày</th>
                <th>giá </th>
               
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${model.listresult}"  var="product">
         	 <tr >
         	 
                <td > ${product.id}</td>
                <td > ${product.name}</td>
                <td > ${product.decription}</td>
                <td > ${product.date}</td>
                <td > ${product.price}</td>
                </tr>
                </c:forEach>
        </tbody>
    </table>
</body>
</html>