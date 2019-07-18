FROM registry.saas.hand-china.com/tools/javabase:0.5.0

VOLUME /vol/development

RUN mkdir -p /vol/development

WORKDIR /vol/development

COPY Exam1/target/Exam1-1.0-SNAPSHOT.jar /vol/development/app.jar

CMD ["java","-jar","/vol/development/app.jar"]
