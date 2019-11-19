<!DOCTYPE html>
<html>
<head>
    <title>Список автомобилей</title>
</head>
<body>

<form method="post" action="/create" >
    <div class="form-group">
        <input type="text" name="marka" >
        <select name="property">
            <#list propCars as prp>
            <option value="${prp.id}">${prp.prpt}</option>
            </#list>
        </select>
        <button type="submit" >Сохранить</button>
    </div>
</form>
<table >
    <thead>
    <tr>
        <th scope="col">№</th>
        <th scope="col">Марка</th>
        <th scope="col">Свойства</th>
    </tr>
    </thead>
    <tbody>
    <#list car as cars>
        <tr>
            <th >${cars.id}</th>
            <td>${cars.marka}</td>
            <td>${cars.prptscar.prpt}</td>
            <td><form method="post" action="/delete" >
                    <input type="hidden" name="id" value="${cars.id}">
                <button type="submit" >Удалить</button>
                </form>
            </td>
            <td><form method="post" action="/update" >
                    <input type="hidden"  name="id" value="${cars.id}">
                    <input type="text"  name="marka" value="${cars.marka}">
                    <select name="prpt">
                        <#list propCars as prp>
                            <option value="${prp.id}">${prp.prpt}</option>
                        </#list>
                    </select>
                    <button type="submit" >Редактировать</button>
                </form>
            </td>
        </tr>
    </#list>
    </tbody>
</table>
<form action = "/prpt">
    <input type="submit" value="Добавить свойства">
</form>
</body>
</html>
