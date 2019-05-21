//服务层

app.service('studentService' ,function($http){
    				this.findAll=function(){
    					return $http.get('../student/findAll.do');
    				}
    				
    				this.findPage=function(page, rows){
    					return $http.get('../student/findPage.do?page='+page+'&rows='+rows);
    				}
    				
    				this.findOne=function(sid){
    					return $http.get('../student/findOne.do?sid='+sid);
    				}
    				
    				this.add=function(entity){
    					return $http.post('../student/add.do',entity);
    				}
    				
    				this.update=function(entity){
    					return $http.post('../student/update.do',entity);
    				}
    				
    				this.dele=function(sids){
    					return $http.get('../student/delete.do?sids='+sids);
    				}
    				
    				this.search=function(page, rows, searchEntity){
    					return $http.post('../student/search.do?page='+page+'&rows='+rows, searchEntity);
    				}
    			});