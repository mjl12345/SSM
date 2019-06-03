//控制层
app.controller('reservationController' , function($scope, $http, $controller,reservationService){
	
	$controller('baseController' ,{$scope:$scope});
	
			$scope.findAll=function(){
				reservationService.findAll().success(
						function(response){
							$scope.list=response;
						}
				);
			}
			
			$scope.findPage=function(page,rows){
				reservationService.findPage(page,rows).success(
						function(response){
							$scope.list=response.rows;
							$scope.paginationConf.totalItems=response.total;
						}
				);
			}
			
			$scope.save=function(){
				var object=null;
				if($scope.entity.id!=null){
					object=reservationService.update($scope.entity);
				}else {
					object=reservationService.add($scope.entity);
				}
				object.success(
						function(respnse){
							if(response.success){
								$scope.reloadList();
							}else {
								alert(response.message);
							}
						}
				);
			}
	
			$scope.findOne=function(id){
				reservationService.findOne(id).success(
						function(response){
							$scope.entity=response;
						}
				
				);
			}
			
			$scope.dele=function(){
				reservationService.dele($scope.selectIds)
			}
	
	
	
});