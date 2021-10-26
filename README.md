# TodoItem

# Swagger-UI  URL
http://localhost:8082/swagger-ui/index.html 

#Create Todo Item endpoint
	- http://localhost:8082/create-todoItem
	- Accept groupId as Request header and Request Body as For example ( {"description":"Chocolate item"})
	-groupId as request header in order to map and  create Todo Item

# Update Todo Item endpoint
	-http://localhost:8082/update-todoItem/{itemId} 
	-For Example :http://localhost:8082/update-todoItem/1
	-Accept Request Body as ( {"description":"Chocolate item"}). Accept only one property to be modified.
	
#Get Todo Item endpoint
	-http://localhost:8082/todoItems
	-Fetch all the todoItems list

#Delete Todo Item endpoint
	-http://localhost:8082/delete-group/{itemID}
	-For example :http://localhost:8082/delete-group/2
	-Delete record by itemId


#H2 Database url
http://localhost:8082/h2-console
	