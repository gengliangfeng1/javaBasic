FROM java:alpine
ADD /springboot.jar springboot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/springboot.jar.","--spring.profiles.active=prod"]