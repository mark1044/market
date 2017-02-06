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
var app = angular.module('marketApp', ['ngRoute']).config(function($routeProvider){
    $routeProvider
        .when('/',{

            templateUrl: 'inkdex.html',
            controller: 'marketControl'

            }
        )

        .when('/add_product',{

            templateUrl : 'Products/Add_Product.html',


         })


});


/*
 marketControl refers to the controller with the ng-controller directive
 */
app.controller('marketControl', function($scope,$http){



    $scope.loadProducts = function() {
        $http.get('/products/' + $scope.searchText).then(function (response) {
            console.log(response.data.description);
            $scope.productDescription = response.data.description;
        });
    }



    $scope.loadProducts();




});

app.controller('addProductController', function($scope,$http){
   $scope.note = "sell a product";
});