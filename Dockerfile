FROM openjdk
COPY build/install/springboot-demo-boot /springboot-demo-boot/
ENTRYPOINT ["springboot-demo-boot/bin/springboot-demo"]
EXPOSE 8080