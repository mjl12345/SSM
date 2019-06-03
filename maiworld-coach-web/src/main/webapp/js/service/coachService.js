//服务层

app.service('coachService' ,function($http){
    				this.findAll=function(){
    					return $http.get('../coach/findAll.do');
    				}
    				
    				this.findPage=function(page, rows){
    					return $http.get('../coach/findPage.do?page='+page+'&rows='+rows);
    				}
    				
    				this.findOne=function(cid){
    					return $http.get('../coach/findOne.do?cid='+cid);
    				}
    				
    				this.add=function(entity){
    					return $http.post('../coach/add.do',entity);
    				}
    				
    				this.update=function(entity){
    					return $http.post('../coach/update.do',entity);
    				}
    				
    				this.dele=function(cids){
    					return $http.get('../coach/delete.do?cids='+cids);
    				}
    				
    				this.search=function(page, rows, searchEntity){
    					return $http.post('../coach/search.do?page='+page+'&rows='+rows, searchEntity);
    				}
    			});