//服务层
		app.service('reservationService' ,function($http){
    				this.findAll=function(){
    					return $http.get('../reservation/findAll.do');
    				}
    				
    				this.findPage=function(page, rows){
    					return $http.get('../reservation/findPage.do?page='+page+'&rows='+rows);
    				}
    				
    				this.findOne=function(id){
    					return $http.get('../reservation/findOne.do?id='+id);
    				}
    				
    				this.add=function(entity){
    					return $http.post('../reservation/add.do',entity);
    				}
    				
    				this.update=function(entity){
    					return $http.post('../reservation/update.do',entity);
    				}
    				
    				this.dele=function(ids){
    					return $http.get('../reservation/delete.do?ids='+ids);
    				}
    				
    				this.search=function(page, rows, searchEntity){
    					return $http.post('../reservation/search.do?page='+page+'&rows='+rows, searchEntity);
    				}    					
    			});