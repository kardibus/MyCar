<!DOCTYPE html>
<html>
<head>
    <title>Список автомобилей</title>

</head>
<body>

<form method="post" action="/prpt/create" >
    <div class="form-group">
        <input type="text" name="prpt" >
        <button type="submit" >Сохранить</button>
    </div>
</form>
<table >
    <thead>
    <tr>
        <th scope="col">№</th>
        <th scope="col">Свойства</th>
    </tr>
    </thead>
    <tbody>
    <#list propCars as prop>
        <tr>
            <th >${prop.id}</th>
            <td>${prop.prpt}</td>
            <td>
                <form method="post" action="/prpt/delete" >
                    <input type="hidden" name="id" value="${prop.id}">
                    <button type="submit" >Удалить</button>
                </form>
            </td>
            <td>
                <form method="post" action="/prpt/update" >
                    <input type="hidden"  name="id" value="${prop.id}">
                    <input type="text"  name="prpt" value="${prop.prpt}">
                    <button type="submit" >Редактировать</button>
                </form>
            </td>
        </tr>
    </#list>
    </tbody>
</table>
<form action = "/">
    <input type="submit" value="Машина">
</form>
</body>
</html>