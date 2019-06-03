//控制层 
app.controller('coachController',function($scope,$http , coachService){
    			
    			$scope.findAll=function(){
    				coachService.findAll().success(
    				function(response){
    					$scope.list=response;
    				}
    				
    			);
    		}
    			//分页
    			$scope.findPage=function(page, rows){
    				coachService.findPage(page,rows).success(
    						function(response){
    							$scope.list=response.rows;	//显示当前页数据
    							$scope.paginationConf.totalItems=response.total;	//更新总记录数
    						}
    				);
    			}
    			
    			//分页控件配置 
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
    			
    			
    			//增加
    			/*$scope.save=function(){
    				var object=null; //方法名
    				if($scope.entity.cid!=null){
    					object=coachService.update($scope.entity);
    				}else{
    					object=coachService.add($scope.entity);
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
    			}*/
    			
    			//增加
    			$scope.add=function(){
    				coachService.add($scope.entity).success(
    					function(response){
    						if(response.success){
    							//如果注册成功，跳转登录页面
    							location.href="shoplogin.html";   							
    						}else{
    							alert(response.message);
    						}
    					}	
    				);
    			}
    			//查询实体
    			$scope.findOne=function(cid){
    				coachService.findOne(cid).success(
    					function(response){
    						$scope.entity=response;
    					}		
    				);
    			}
    			
    			$scope.selectcIds=[];		//我勾选的ID集合
    			//用户勾选复选框
    			$scope.updateSelection=function($event,cid){
    				if($event.target.checked){
    					$scope.selectcIds.push(cid);  //push向集合中添加元素    				   					
    				 }else{
    					var index = $scope.selectcIds.indexOf(cid);
    					$scope.selectcIds.splice(index, 1);
    				}
    			}
    			
    			
    			//删除
    			$scope.dele=function(){
    				coachService.dele($scope.selectcIds).success(
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
    				coachService.search(page,rows,$scope.searchEntity).success(
    					function(response){
    						$scope.list=response.rows;	//显示当前页数据
							$scope.paginationConf.totalItems=response.total;	//更新总记录数
    					}		
    				);
    			}
    	});