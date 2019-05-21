//服务层
		app.service('groundService' ,function($http){
    				this.findAll=function(){
    					return $http.get('../ground/findAll.do');
    				}
    				
    				this.findPage=function(page, rows){
    					return $http.get('../ground/findPage.do?page='+page+'&rows='+rows);
    				}
    				
    				this.findOne=function(id){
    					return $http.get('../ground/findOne.do?id='+id);
    				}
    				
    				this.add=function(entity){
    					return $http.post('../ground/add.do',entity);
    				}
    				
    				this.update=function(entity){
    					return $http.post('../ground/update.do',entity);
    				}
    				
    				this.dele=function(ids){
    					return $http.get('../ground/delete.do?ids='+ids);
    				}
    				
    				this.search=function(page, rows, searchEntity){
    					return $http.post('../ground/search.do?page='+page+'&rows='+rows, searchEntity);
    				}
    			});