var app = angular.module("pinyougou",[]);

app.filter("trustHtml",function ($sce) {
     return function (data) {
         return $sce.trustAsHtml(data);
     }
})