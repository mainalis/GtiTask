/**
 * Created by sushilmainali on 25/02/2018.
 */


'use strict';

/**
 * Created by sushilmainali on 25/09/2016.
 */

app.controller('AnimalController',['$scope', '$rootScope','ProductService',  function($scope, $rootScope ,ProductService){


    $scope.testPage="animal Controller";

    $scope.animal = new Animal();

    $scope.cowRadio = true;

    $scope.mountainGoatRadio = false;


    $scope.animalCollection = [];



    initAnimalData();

    function initAnimalData() {
        ProductService.getAllAnimals().then(
            function(success) {
                $scope.animalCollection = success;
            },
            function(failure) {
                console.log("Fail to insansiate");
            }
        )

    }


    $scope.insertAnimal = function ()
    {
        var  mountainGoat = new MountainGoat(12);
        ProductService.insertAnimal(mountainGoat);

    }

    $scope.insertPost = function (){
        ProductService.insertPost();

       console.log("ppp "+ ProductService.getAllAnimals());
    };



}]);
