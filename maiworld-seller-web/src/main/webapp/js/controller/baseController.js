app.controller('baseController' ,function($scope){	
	
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
	
	
	
	$scope.selectIds=[];		//我勾选的ID集合
	//用户勾选复选框
	$scope.updateSelection=function($event,id){
		if($event.target.checked){
			$scope.selectIds.push(id);  //push向集合中添加元素    				   					
		 }else{
			var index = $scope.selectIds.indexOf(id);
			$scope.selectIds.splice(index, 1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	$scope.jsonToString=function(jsonString,key){
		
		var json= JSON.parse(jsonString);
		var value="";
		
		for(var i=0;i<json.length;i++){
			if(i>0){
				value+=",";
			}			
			value +=json[i][key];			
		}
				
		return value;
	}
	
});	