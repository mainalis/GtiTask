/**
 * Created by sushilmainali on 25/02/2018.
 */


'use strict';

/**
 * Created by sushilmainali on 25/09/2016.
 */

app.controller('AnimalController',['$scope', '$rootScope','ProductService',  function($scope, $rootScope ,ProductService){



    var ctrl = this;

    $scope.testPage="InsertAnimalForm";

    $scope.animal = new Animal();

    $scope.cowRadio = false;

    $scope.mountainGoatRadio = false;
    
    $scope.animalChooser = {
    		animal: 'Cow'
    }

    
    $scope.formError = "";

    $scope.animalCollection = [];
    
    $scope.radioChanged = function (item) {
    	if(item == "Cow")
    		{
    		  console.log("cow selected");
    		}
    	if(item == "Mountain_Goat")
		{
		  console.log("Mountain_Goat selected");
		}
    }
    

    $scope.callServer =  function() {
    	
        ProductService.getAllAnimals().then(
            function(success) {
            	$scope.animalCollection = success;                
            },
            function(failure) {
                console.log("Fail to insansiate");
            }
        )

    }


    $scope.insertCow = function ()
    {
        var  aCow = new Cow($scope.animal);
        
        ProductService.insertCow(aCow);
        
        $scope.callServer();

    }
    
    
    $scope.insertGoat = function ()
    {
        var  mountainGoat = new MountainGoat($scope.animal);
        ProductService.insertGoat(mountainGoat);
        
        $scope.callServer();

    }
    
    $scope.callServer();

    $scope.insertPost = function (){
        ProductService.insertPost();

       console.log("ppp "+ ProductService.getAllAnimals());
    };
    
    $scope.save = function()
    {
    	
    	var isInputFieldValid = validate($scope.animal)
    	if($scope.animalChooser.animal == 'Cow' && isInputFieldValid)
    	{
    		$scope.insertCow();
     		//formClear();
    	}
    	
    	if($scope.animalChooser.animal == 'Mountain_Goat' && isInputFieldValid)
    	{
    		  $scope.insertGoat();
    		  //formClear();
    	}
    }
    
    function validate(animalObj)
    {
    	var ss = animalObj;
    	
    	var returnVal = false;
    	
    	if(animalObj instanceof Cow)
    	{
    		
    	}
    	
    	if(animalObj instanceof MountainGoat )
    	{
    		
    	}
    	if(typeof animalObj.birthDate != 'undefined'  
			&&	typeof animalObj.breed != 'undefined' 
			&&	typeof animalObj.color != 'undefined' 
			&&	typeof animalObj.hasHorns != 'undefined' 
			&&	typeof animalObj.height != 'undefined' 
			&&	typeof animalObj.givenName != 'undefined' 
			&&	typeof animalObj.scientificName != 'undefined' 
			&&	typeof animalObj.sex != 'undefined' 
			&&	typeof animalObj.weight != 'undefined' 
			    		
    	)
		{
    		return true;
		}
    	else
		{
    		$scope.formError = "Invalid Input";
    		return false;
		}

    }
    
    
    
    function formClear()
    {
		 $scope.animal.birthDate = '';
		 $scope.animal.breed = '' ;
		 $scope.animal.color = '' ;
		 $scope.animal.hasHorns ='' ;
		 $scope.animal.height = '' ;
		 $scope.animal.name = '' ;
		 $scope.animal.scientificName = '' ;
		 $scope.animal.sex = '' ;
		 $scope.animal.weight = '';
		 $scope.formError = '';
    }
    



}]);
