//服务层
		app.service('userService' ,function($http){
    				this.findAll=function(){
    					return $http.get('../user/findAll.do');
    				}
    				
    				this.findPage=function(page, rows){
    					return $http.get('../user/findPage.do?page='+page+'&rows='+rows);
    				}
    				
    				this.findOne=function(id){
    					return $http.get('../user/findOne.do?id='+id);
    				}
    				
    				this.add=function(entity){
    					return $http.post('../user/add.do',entity);
    				}
    				
    				this.update=function(entity){
    					return $http.post('../user/update.do',entity);
    				}
    				
    				this.dele=function(ids){
    					return $http.get('../user/delete.do?ids='+ids);
    				}
    				
    				this.search=function(page, rows, searchEntity){
    					return $http.post('../user/search.do?page='+page+'&rows='+rows, searchEntity);
    				}
    			});