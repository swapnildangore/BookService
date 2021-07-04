# BookService
mvn clean install -e

# If no docker compose
docker build . --tag bookservice:latest
docker run -p 8080:8080 -t bookservice:latest

#Docker compose commands
docker-compose build
docker-compose up

#General docker commands
docker kill $(docker ps -q)
docker ps
docker network ls