# OpenJDK 21 기반 이미지 사용
FROM eclipse-temurin:21-jdk

WORKDIR /app

# JAR 파일 복사
COPY target/eventor-eureka-0.0.1-SNAPSHOT.jar eventor-eureka.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "eventor-eureka.jar"]