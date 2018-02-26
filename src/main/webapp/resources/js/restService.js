/**
 * Created by sushilmainali on 25/09/2016.
 */


'use strict';

app.factory('ProductService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/SkyProductCatlouge/getCatalogue';
    var Insert_URI = 'http://localhost:8080/insertAnimal';
    var property = 'First';

    var factory = {
        insertAnimal : insertAnimal,
        insertPost: insertPost,
        getAllAnimals: getAllAnimals
    };

    return factory;

    function insertAnimal(animal)
    {
        var deferred = $q.defer();
        $http.post('insertAnimal', animal)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise
    }

    function getAllAnimals()
    {
        var deferred = $q.defer();
        $http.get('getAllAnimal')
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Users');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;

    }

    function insertPost()
    {

        var deferred = $q.defer();
        var formData = {
            "FullName" : 'sushil',
            "City" : 'Reading',
            "Zip" : 'RG14QN'
        };


        $http.post('PostFormDataByMap', formData)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise
    }



}]);