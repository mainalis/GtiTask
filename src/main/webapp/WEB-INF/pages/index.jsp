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
	  <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/Animal/Cow.js"></script>
    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/Animal/MountainGoat.js"></script>

    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/app.js"></script>
    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/restService.js"></script>
	    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/thirdparty/smart-table.debug.js"></script>
    <script rel="javascript"  src="${pageContext.request.contextPath}/resources/js/animalController.js"></script>



    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/site.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/site.css">

</head>

<body ng-app="gtiApp" ng-controller="AnimalController" class="container">
<h1>Animal Insert JPA/Hibernate </h1>

<h3>{{testPage}}</h3>



<form  id="insertAnimal" class="simple-form">
    <label class="field">Scientific Name: <input class="inputForm" type="text" ng-model="animal.scientificName" required/></label><br />
    <label class="field">Color: <input class="inputForm" type="text" ng-model="animal.color" required/></label><br />
    <label class="field">Date of Birth <input class="inputForm" type="date" ng-model="animal.birthDate" required /></label><br />
    <label class="field">Weight <input class="inputForm" type="number" ng-model="animal.weight"  min="1" max="1000000" required/></label><br />
    <label class="field">Name <input class="inputForm" type="text" ng-model="animal.givenName" required/></label><br />
    <label class="field">Breed <input class="inputForm" type="text" ng-model="animal.breed" required/></label><br />
    <label class="field">Sex <input class="inputForm" type="text" ng-model="animal.sex" required/></label><br />
    <label class="field">Height <input class="inputForm" type="number" ng-model="animal.height" min="1" max="1000000" required/></label><br />
    <label class="field">Horns <input class="inputForm" type="text" ng-model="animal.hasHorns" ng-init="animal.hasHorns = true" disabled="true"/></label><br />
    <div ng-show="animalChooser.animal == 'Cow'">
    	<label class="field" ng-show="animalChooser.animal == 'Cow'">EarTagId <input class="inputForm" type="number" ng-model="animal.earTagId" min="1" max="1000000" required/></label><br />
		<label class="field"ng-show="animalChooser.animal == 'Cow'">Ear Tag Color <input class="inputForm" type="text" ng-model="animal.tagColor" required/></label><br />
		<label class="field" ng-show="animalChooser.animal == 'Cow'" >Tagged Date <input class="inputForm" type="date" ng-model="animal.taggedDate" required/></label><br />
    </div>
    <div ng-show="animalChooser.animal == 'Mountain_Goat'">
	    <label class="field" ng-show="animalChooser.animal == 'Mountain_Goat'" >Gaze On Slope <input class="inputForm" type="text" ng-model="animal.gazedOnMountainSlope" ng-init="animal.gazedOnMountainSlope = true" disabled="true"/></label><br />
		<label class="field" ng-show="animalChooser.animal == 'Mountain_Goat'" >Can Climb Steep Slopes <input class="inputForm" type="text" ng-model="animal.canClimbSteepSlopes" ng-init="animal.canClimbSteepSlopes = true" disabled="true" required/></label><br />
		<label class="field" ng-show="animalChooser.animal == 'Mountain_Goat'" >Has Beard <input class="inputForm" type="text" ng-model="animal.hasBeards" ng-init="animal.hasBeards = true" disabled="true" required/></label><br />    
	 </div>
	

     Choose Animal Type to insert: <br /> 
    <label><input name="animal" type="radio"  ng-model = "animalChooser.animal" value="Cow"  ng-change="radioChanged('Cow')"/>Cow</label> <br />
    <label><input name="amimal" type="radio"  ng-model = "animalChooser.animal" value="Mountain_Goat" ng-change="radioChanged('Mountain_Goat')"/>Mountain Goat</label><br />
         
	<br />
    <input type="submit" ng-click="save()" value="Save" />

</form>

<hr />
<div class="row">
<div class="col col-lg-12">
    <table st-safe-src="animalCollection" st-table="displayCollection"  class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Scientific Name</th>
            <th>Date of Birth</th>
            <th>Weight</th>
            <th>Name</th>
            <th>Animal Type</th>
        </tr>
        </thead>
        <tbody >
        
        <tr ng-repeat="row in displayCollection">
            
            <td>{{row.id}}</td>
            <td>{{row.scientificName}}</td>
            <td>{{row.birthDate | date:'dd-MM-yyyy'}}</td>
            <td>{{row.weight}}</td>
            <td>{{row.givenName}}</td>
            <td>{{row.animalType}}</td>
        </tr>
        </tbody>
    </table>

</div>
</div>


</body>
</html>
