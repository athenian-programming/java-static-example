default: versioncheck

clean:
	./gradlew clean

compile:
	./gradlew build -xtest

build: compile

tests:
	./gradlew --rerun-tasks check

uberjar:
	./gradlew uberjar

run-uber: uberjar
	java -jar build/libs/server.jar

distro: clean build uberjar

run:
	./gradlew run

versioncheck:
	./gradlew dependencyUpdates

upgrade-wrapper:
	./gradlew wrapper --gradle-version=6.8.1 --distribution-type=bin