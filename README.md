To clone your repository and get all the code on another machine, follow these steps:

1. Clone the repository:
	git clone https://github.com/PallaviSonwane/angular-springboot-docker-app-final.git
2. Navigate to the project directory/ open terminal from this directory.
3. Navigate to the HazelcastSever project directory :
	cd HazelcastSever
4. Build the Spring Boot HazelcastSever application to generate the jar file:
	.\gradlew.bat clean build -x test
	cd..
5. Navigate to the rcpModule angular project directory :
	cd RCPModule
6. Build the Spring Boot rcpModule application to generate the /dist folder under static folder in java aplication file:
	npm install          -- install dependecy
	ng build
	cd..
7. Navigate to the rcpApp project directory :
	cd rcpApp
8. Build the Spring Boot rcpApp application to generate the WAR file(frontend and backend):
	.\gradlew.bat clean build -x test
	cd..
9. Run Docker Compose:
	docker-compose up --build	
10. The application should be available at:
	http://localhost:8080
	

