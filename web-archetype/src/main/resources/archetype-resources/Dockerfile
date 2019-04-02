{% if docker.enabled %}
FROM openjdk:11
EXPOSE 8080
ADD target/{{ project.artifactId }}-capsule.jar /opt/bin/{{ project.artifactId }}-capsule.jar
ENTRYPOINT java $JAVA_OPTS -jar /opt/bin/{{ project.artifactId }}-capsule.jar
{% endif %}
