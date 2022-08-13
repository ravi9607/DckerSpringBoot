FROM openjdk:11
ADD target/NewSpringBoot-0.0.1-SNAPSHOT.jar newSpringBoot.jar
#EXPOSE 8080
CMD ["java", "-jar", "newSpringBoot.jar"]

#docker build -t(image name) image_name(only lowercase) .(current directory)
#docker run --name {container-name} -p{port} 8081(docker port):8080(file port))  -it {image name}

# Push to docker hub
#docker login
#docker tag image_name:TAG username/image_name
#docker push username/image_name

#pull to docker hub
#docker pull username/image_name
#docker run -it -p 8081:8080 username/image_name --name {container-name}

#--------------------------For My Machine ---------------------------------------------------

#First "Turn windows featuer on or off" -> "Virtual Machine Platform"->Uncheck-> Restart

#minikube start
#kubectl apply -f deployment.yaml
#kubectl apply -f service.yaml


#kubectl get pods
#kubectl get services //only service
#kubectl get deployments  //only deployment



