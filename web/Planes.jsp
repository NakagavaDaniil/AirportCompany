<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 01.08.2018
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Planes</title>

</head>
<style>
    .layer1 {
        background-color: #fc0; /* Цвет фона слоя */
        padding: 5px; /* Поля вокруг текста */
        float: left; /* Обтекание по правому краю */
        width: 200px; /* Ширина слоя */
    }
    .layer2 {
        background-color: #c0c0c0; /* Цвет фона слоя */
        padding: 5px; /* Поля вокруг текста */
        width: 300px; /* Ширина слоя */
        float: left; /* Обтекание по правому краю */
    }

</style>
<body>


<div class="layer1">
<h4>Add plane</h4>
<form action="/planes">

<p>type<input type="text" name="type"></p>
<p>name<input type="text" name="name"></p>
<p>fuelTankMax<input type="number" name="fuelTankMax"></p>
<p>weight<input type="number" step="any" name="weight"></p>
<p>maxSpeed<input type="number" name="maxSpeed"></p>
<p>flyRange<input type="number" name="flyRange"></p>
<p>carriage<input type="number" name="carriage"></p>
<p>maxCapacity<input type="number" name="maxCapacity"></p>
<p>fuelConsumption<input type="number" step="any" name="fuelConsumption"></p>
<button type="submit" value="Ok" title="OK">OK</button>
</form>
</div>
<div class="layer2">
    <h2>Planes</h2>

    <c:forEach items="${planes}" var="emp">
        <c:if test="${not empty emp}">
            <h3>${emp.type} ${emp.name}</h3>
            <ul>
                <li>   maxSpeed :${emp.maxSpeed} km/h</li>
                <li>  flyRange :${emp.flyRange} km</li>
                <li>   weight :${emp.weight} kg</li>
                <li>   carriage :${emp.carriage} seats</li>
                <li>  maxCapacity :${emp.maxCapacity} kg</li>
                <li>  fuelConsumption :${emp.fuelConsumption} L/h</li>
                <li>    fuelTankMax  :${emp.fuelTankMax} L</li>
            </ul>
        </c:if>
    </c:forEach>

</div>
<div class="layer1">
    <form action="/sortedPlanes">
    <h2>Sort</h2>
<button type="submit">By Max fly range</button>
    <p>Rang of fuel consumption</p>

    <%--<p> from <input type="number" step="any" name="from"></p><p> to<input  type="number" step="any" name="to">   </p>--%>
        <%--<button type="submit">Find</button>--%>
    </form>
    <p>Total carriage :
    <c:out value="${totalCarriage}"/>seats</p>
    <p>Total Capacity :
    <c:out value="${totalCapacity}"/>kg</p>
</div>

</body>
</html>
