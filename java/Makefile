.PHONY: format lint test build debug clean distclean

format:
	./mvnw spotless:apply

lint:
	./mvnw spotless:check

test:
	./mvnw test

build:
	./mvnw package

debug: build
	java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=*:5005 -cp target/classes com.example.App

clean:
	./mvnw clean

distclean: clean
	rm -rf .mvn/wrapper/apache-maven-*
