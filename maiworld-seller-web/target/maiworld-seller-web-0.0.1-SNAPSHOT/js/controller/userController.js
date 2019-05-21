//控制层 
app.controller('userController',function($scope,$http ,$controller, userService){
	
	$controller('baseController' , {$scope:$scope});	//继承
    			
    			$scope.findAll=function(){
    				userService.findAll().success(
    				function(response){
    					$scope.list=response;
    				}
    				
    			);
    		}
    			//分页
    			$scope.findPage=function(page, rows){
    				userService.findPage(page,rows).success(
    						function(response){
    							$scope.list=response.rows;	//显示当前页数据
    							$scope.paginationConf.totalItems=response.total;	//更新总记录数
    						}
    				);
    			}
    			
    			//增加
    			$scope.save=function(){
    				var object=null; //方法名
    				if($scope.entity.id!=null){
    					object=userService.update($scope.entity);
    				}else{
    					object=userService.add($scope.entity);
    				}
    				
    				object.success(
    					function(response){
    						if(response.success){
    							$scope.reloadList();	//刷新
    						}else{
    							alert(response.message);
    						}
    					}	
    				);
    			}
    			
    			//查询实体
    			$scope.findOne=function(id){
    				userService.findOne(id).success(
    					function(response){
    						$scope.entity=response;
    					}		
    				);
    			}
    			
    			//删除
    			$scope.dele=function(){
    				userService.dele($scope.selectIds).success(
    					function(response){
    						if(response.success){
    							$scope.reloadList();
    						}else{
    							alert(response.message);
    						}
    					}		
    				);
    			}
    			
    			$scope.searchEntity={};
    			//条件查询
    			$scope.search=function(page, rows){
    				userService.search(page,rows,$scope.searchEntity).success(
    					function(response){
    						$scope.list=response.rows;	//显示当前页数据
							$scope.paginationConf.totalItems=response.total;	//更新总记录数
    					}		
    				);
    			}
    	});