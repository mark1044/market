/**
 * Created by marksmelendez on 2/1/17.
 */


/*
 marketApp refers to an html element in which the application will run
 */
var app = angular.module('marketApp', ['ui.router']).config(function($stateProvider, $urlRouterProvider){

    $urlRouterProvider.otherwise('/home');
    $stateProvider.state('home',{

        url:'/home',
        templateUrl:'Portal.html'


    }).state('addProduct', {

        url:'/addProduct',
        templateUrl:'Products/Add_Product.html',
        controller:'addProductController'


    });
});

    app.controller('addProductController', ['$scope','$http',function($scope,$http){




        $scope.SendData = function(){

            var data = {
                description : $scope.product.description,
                sellerUserName : $scope.product.sellerUserName,
                productName : $scope.product.productName,
                price : $scope.product.price
            };

            console.log("sending now");
            console.log(data);

            console.log(data, null, 2);
            $http.post("/bagua",data, {headers: {'Content-Type': 'application/json'}}).then(function(response){
                console.log(response);
            });
        };


}]);
