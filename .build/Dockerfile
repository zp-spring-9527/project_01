FROM openjdk:18-ea-28-jdk-oracle
ENV APP_PATH=/opt/apps
WORKDIR $APP_PATH
ADD z-chenger-gateway-web.jar $APP_PATH/app.jar
EXPOSE 9091
ENTRYPOINT ["java","-","jar"]
CMD ["app.jar"]
