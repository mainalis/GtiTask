<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Animal Data Entry</title>
    <meta charset="UTF-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1,
    maximum-scale=1, user-scalable=no">


    <script src="https://code.jquery.com/jquery-3.1.0.min.js"   integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s="   crossorigin="anonymous"></script>
    <script src="${pageContext.request.contextPath}/resources/js/thirdparty/angular.min.js"></script>

    <!-- Latest compiled and minified CSS -->

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/Animal/Animal.js"></script>

    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/Animal/MountainGoat.js"></script>

    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/app.js"></script>
    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/restService.js"></script>

    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/animalController.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/thirdparty/smart_table.js"></script>


    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/site.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/site.css">

</head>

<body ng-app="gtiApp" ng-controller="AnimalController" class="container">
<h1>Insert Animal Data</h1>

<h3>{{testPage}}</h3>


<form method="POST" action="/guest">
    Name: <input type="text" name="name" />
    <input type="submit" value="Add" />
</form>


<div > Insert Animal

</div>

<button ng-click = "insertAnimal()"> Insert Animal</button>

<button ng-click = "insertPost()"> Insert Animal</button>

<form novalidate class="simple-form">
    <label>Scientific Name: <input type="text" ng-model="animal.scientificName" /></label><br />
    <label>Color: <input type="text" ng-model="animal.color" /></label><br />
    <label>Date of Birth <input type="date" ng-model="animal.birthDate" /></label><br />
    <label>Weight <input type="text" ng-model="animal.weight" /></label><br />
    <label>Name <input type="text" ng-model="animal.name" /></label><br />
    <label>Breed <input type="text" ng-model="animal.breed" /></label><br />
    <label>Sex <input type="text" ng-model="animal.sex" /></label><br />
    <label>Height <input type="text" ng-model="animal.height" /></label><br />
    <label>Horns <input type="text" ng-model="animal.hasHorns" /></label><br />



    Choose Animal Type to insert: <label><input type="radio" ng-model="cowRadio" value="Cow" />Cow</label>
    <label><input type="radio" ng-model="mountainGoatRadio" value="Mountain Goat" />Mountain Goat</label><br />

    <input type="button" ng-click="" value="Reset" />
    <input type="submit" ng-click="" value="Save" />



</form>

<div class="col-12">
    <table st-table="animalTable"  class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Scientific Name</th>
            <th>Date of Birth</th>
            <th>Weight</th>
            <th>Name</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat="row in animalCollection">
            <td>{{row.id}}</td>
            <td>{{row.scientificName}}</td>
            <td>{{row.birthDate}}</td>
            <td>{{row.weight}}</td>
            <td>{{row.givenName}}</td>
        </tr>
        </tbody>
    </table>



        <%--birthDate--%>
        <%--breed--%>
        <%--canClimbSteepSlopes--%>
        <%--color--%>
        <%--gazedOnMountainSlope--%>
        <%--givenName--%>
        <%--givesWool--%>
        <%--hasBeards--%>
        <%--hasHorns--%>
        <%--height--%>
        <%--id--%>
        <%--scientificName--%>
        <%--sex--%>
        <%--weight--%>

</div>



</body>
</html>
