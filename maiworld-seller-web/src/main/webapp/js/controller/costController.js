//控制层 
app.controller('costController',function($scope,$http ,$controller, costService){
	
	//$controller('baseController' , {$scope:$scope});	//继承
    			
    			$scope.findAll=function(){
    				costService.findAll().success(
    				function(response){
    					$scope.list=response;
    				}
    				
    			);
    		}
    			//$scope.list=costService.studentList();
	
				/*$scope.studentList=function(){
					costService.studentList().success(
							function(response){
								$scope.list=response;
							}
					);
					
				}
	
				$scope.studentList();*/	
	
				/*$scope.findAll=function(){
					costService.studentList().success(
					function(response){
						$scope.arr=response;
					}
					
				);
			}*/
			//$scope.findAll();				
				
    			$scope.paginationConf = {
       		         currentPage: 1,		//当前页码
       		         totalItems: 10,		//总录数
       		         itemsPerPage: 10,		//当前记录数
       		         perPageOptions: [10, 20, 30, 40, 50],
       		         onChange: function(){    		        	
       		        		$scope.reloadList();//重新加载
       		     	 }
       			}; 
       			
       			//刷新列表
       			$scope.reloadList=function(){
       				$scope.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
       			}
    			//分页
    			$scope.findPage=function(page, rows){
    				costService.findPage(page,rows).success(
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
    					object=costService.update($scope.entity);
    				}else{
    					object=costService.add($scope.entity);
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
    				costService.findOne(id).success(
    					function(response){
    						$scope.entity=response;
    					}		
    				);
    			}
    			
    			//删除
    			$scope.dele=function(){
    				costService.dele($scope.selectIds).success(
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
    				costService.search(page,rows,$scope.searchEntity).success(
    					function(response){
    						console.log(response);
    						$scope.list=response.rows;	//显示当前页数据
							$scope.paginationConf.totalItems=response.total;	//更新总记录数
    					}		
    				);
    			}
    			
  			
    			
    	});