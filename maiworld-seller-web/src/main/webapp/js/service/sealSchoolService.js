//服务层
		app.service('sealSchoolService' ,function($http){
    				this.findAll=function(){
    					return $http.get('../sealSchool/findAll.do');
    				}
    				
    				this.findPage=function(page, rows){
    					return $http.get('../sealSchool/findPage.do?page='+page+'&rows='+rows);
    				}
    				
    				this.findOne=function(id){
    					return $http.get('../sealSchool/findOne.do?id='+id);
    				}
    				
    				this.add=function(entity){
    					return $http.post('../sealSchool/add.do',entity);
    				}
    				
    				this.update=function(entity){
    					return $http.post('../sealSchool/update.do',entity);
    				}
    				
    				this.dele=function(ids){
    					return $http.get('../sealSchool/delete.do?ids='+ids);
    				}
    				
    				this.search=function(page, rows, searchEntity){
    					return $http.post('../sealSchool/search.do?page='+page+'&rows='+rows, searchEntity);
    				}
    			});