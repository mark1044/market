/**
 * Created by marksmelendez on 2/1/17.
 */
/**
 * usually module and controllers live in different js files
 * directives
 *      ng-app
 *      ng-init
 *      ng-model
 */

/*
 marketApp refers to an html element in which the application will run
 */
var app = angular.module('marketApp', []);



/*
 marketControl refers to the controller with the ng-controller directive

app.controller('marketControl', function($scope, $http){


    $http.get('/products/JKD%20boxing%20glove').then(function(response) {
        console.log(response.data.description);
        $scope.product = response.data;
    });

});


*/

app.controller('marketControl', function($scope, $http){

    $http({
        method : "GET",
        url : "/products/JKD%20boxing%20glove"
    }).then(function mySucces(response) {
        $scope.product = response.data;
    }, function myError(response) {
        $scope.product = response.statusText;
    });


});