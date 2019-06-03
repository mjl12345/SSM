//服务层
		app.service('costService' ,function($http){
			
    				this.findAll=function(){    					
    					return $http.get('../cost/findAll.do');
    				}
    				
    				this.findPage=function(page, rows){
    					return $http.get('../cost/findPage.do?page='+page+'&rows='+rows);
    				}
    				
    				this.findOne=function(id){
    					return $http.get('../cost/findOne.do?id='+id);
    				}
    				
    				this.add=function(entity){
    					return $http.post('../cost/add.do',entity);
    				}
    				
    				this.update=function(entity){
    					return $http.post('../cost/update.do',entity);
    				}
    				
    				this.dele=function(ids){
    					return $http.get('../cost/delete.do?ids='+ids);
    				}
    				
    				this.search=function(page, rows, searchEntity){
    					return $http.post('../cost/studentList.do?page='+page+'&rows='+rows,searchEntity);
    				}
    				
    				this.studentList=function(){					
    					return $http.get('../cost/studentList.do');						
    				}			
    				
    			});