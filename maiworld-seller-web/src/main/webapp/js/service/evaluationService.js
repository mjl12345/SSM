//服务层
		app.service('evaluationService',function($http){
			
			this.findAll=function(){
				return $http.get('../evaluation/findAll.do');
			}
			
			this.findPage=function(page,rows){
				return $http.get('../evaluation/findPage.do?page='+page+'&rows='+rows);
			}
			
			this.findOne=function(id){
				return $http.get('../evaluation/findOne.do?id='+id);
			}
			
			this.add=function(entity){
				return $http.post('../evaluation/add.do', entity);
			}
			
			this.update=function(entity){
				return $http.post('../evaluation/update.do', entity);
			}
			
			this.dele=function(ids){
				return $http.get('../evaluation/delete.do?ids='+ids);
			}
			this.search=function(page, rows, searchEntity){
				return $http.post('../evaluation/evaluationList.do?page='+page+'&rows='+rows, searchEntity);
			}
			
			this.evaluationList=function(){
				return $http.get('../evaluation/evaluationList.do')
			}
			
			
		});