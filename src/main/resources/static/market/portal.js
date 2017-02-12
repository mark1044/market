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
var app = angular.module('marketApp', ['ui.router']).config(function($stateProvider, $urlRouterProvider){

    $urlRouterProvider.otherwise('/home');
    $stateProvider.state('home',{

        url:'/home',
        templateUrl:'Portal.html'


    }).state('addProduct', {

        url:'/addProduct',
        templateUrl:'Products/Add_Product.html'

    });
});




