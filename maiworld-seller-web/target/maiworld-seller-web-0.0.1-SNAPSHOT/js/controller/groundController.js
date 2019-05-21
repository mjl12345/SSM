//控制层 
app.controller('groundController',function($scope,$http ,$controller, groundService){
	
	$controller('baseController' , {$scope:$scope});	//继承
    			
    			$scope.findAll=function(){
    				groundService.findAll().success(
    				function(response){
    					$scope.list=response;
    				}
    				
    			);
    		}
    			//分页
    			$scope.findPage=function(page, rows){
    				groundService.findPage(page,rows).success(
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
    					object=groundService.update($scope.entity);
    				}else{
    					object=groundService.add($scope.entity);
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
    				groundService.findOne(id).success(
    					function(response){
    						$scope.entity=response;
    					}		
    				);
    			}
    			
    			//删除
    			$scope.dele=function(){
    				groundService.dele($scope.selectIds).success(
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
    				groundService.search(page,rows,$scope.searchEntity).success(
    					function(response){
    						$scope.list=response.rows;	//显示当前页数据
							$scope.paginationConf.totalItems=response.total;	//更新总记录数
    					}		
    				);
    			}
    	});