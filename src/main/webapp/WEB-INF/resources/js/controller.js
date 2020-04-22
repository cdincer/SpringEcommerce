var cartApp = angular.module("cartApp", []);

cartApp.controller('cartCtrl', function ($scope, $http) {
    $scope.refreshCart = function () {
        $http.get('/rest/cart/' + $scope.cartId).success(function (data) {
            $scope.cart = data;
        });
    };

    $scope.clearCart = function () {
        $http.delete('/rest/cart/' + $scope.cartId).success($scope.refreshCart($scope.cartId));

    };
    

    $scope.initCartId = function (cartId) {
        $scope.cartId = cartId;
        $scope.refreshCart(cartId);
    };

    $scope.addToCart = function (productId) {
        $http.put('/rest/cart/add/' + productId).success(function data() {
                $scope.refreshCart($http.get('Ecommerce/rest/cart/cartId'));
                alert("Product succesfully added to the cart!")
            });
    };

    $scope.removeFromCart = function (productId) {
        $http.put('Ecommerce/rest/cart/remove/' + productId)
            .success(function data() {
                $scope.refreshCart($http.get('/Ecommerce/rest/cart/cartId'));
           
        });
    };



});