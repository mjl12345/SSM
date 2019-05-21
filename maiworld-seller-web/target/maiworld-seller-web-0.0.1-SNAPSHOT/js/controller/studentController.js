//控制层 
app.controller('studentController',function($scope,$http ,$controller, studentService){
	
	$controller('baseController' , {$scope:$scope});	//继承
    			
    			$scope.findAll=function(){
    				studentService.findAll().success(
    				function(response){
    					$scope.list=response;
    				}
    				
    			);
    		}
    			//分页
    			$scope.findPage=function(page, rows){
    				studentService.findPage(page,rows).success(
    						function(response){
    							$scope.list=response.rows;	//显示当前页数据
    							$scope.paginationConf.totalItems=response.total;	//更新总记录数
    						}
    				);
    			}
    			
    			//增加
    			$scope.save=function(){
    				var object=null; //方法名
    				if($scope.entity.sid!=null){
    					object=studentService.update($scope.entity);
    				}else{
    					object=studentService.add($scope.entity);
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
    			$scope.findOne=function(sid){
    				studentService.findOne(sid).success(
    					function(response){
    						$scope.entity=response;
    					}		
    				);
    			}
    			
    			//删除
    			$scope.dele=function(){
    				studentService.dele($scope.selectsIds).success(
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
    				studentService.search(page,rows,$scope.searchEntity).success(
    					function(response){
    						$scope.list=response.rows;	//显示当前页数据
							$scope.paginationConf.totalItems=response.total;	//更新总记录数
    					}		
    				);
    			}
    	});