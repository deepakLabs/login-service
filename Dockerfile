FROM openjdk:17-jdk-alpine
USER 1001
WORKDIR /usr/app
COPY ./build/docker/rootfs/app ./
EXPOSE 8080
CMD ["java","-jar","./login-service.jar"]