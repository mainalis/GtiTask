/**
 * Created by sushilmainali on 25/09/2016.
 */


'use strict';

app.factory('ProductService', ['$http', '$q', function($http, $q){

    var factory = {
    	insertGoat : insertGoat,
        insertPost: insertPost,
        getAllAnimals: getAllAnimals,
        insertCow : insertCow
    };

    return factory;

    function insertGoat(animal)
    {
        var deferred = $q.defer();
        $http.post('insertGoat', animal)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while inserting mountainGoat');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise
    }
    
    function insertCow(animal)
    {
        var deferred = $q.defer();
        $http.post('insertCow', animal)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while inserting cow');
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
            "Zip" : 'RG14XX'
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