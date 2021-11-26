FROM openjdk:11.0.13-jre-slim
EXPOSE 8080
EXPOSE 8081

# place application into /app
RUN mkdir -p /app
WORKDIR /app

# Copy the jar to /app
COPY target/calculator*.jar /app/application.jar

# Copy the dropwizard service config to /app
COPY config.yml /app/config.yml

# Copy the entrypoint script to app folder, make it executable
COPY scripts/entrypoint.sh /app/entrypoint.sh
RUN ["chmod", "+x", "/app/entrypoint.sh"]

# Run this ...
ENTRYPOINT /app/entrypoint.sh java -jar /app/application.jar server /app/config.yml
