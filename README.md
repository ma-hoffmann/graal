# Getting Started


### Voraussetzungen
Docker ist installiert

Image erzuegen mit

```
mvn spring-boot:build-image -Pnative
```

Das war's dann auch schon.

Starten des containers mit

```
docker run --rm -p 8888:8888 docker.io/<paste-your-docker-id>/graal-demo:1.0
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you can run the app as follows:
```
$ target/graal-demo
```

You can also run your existing tests suite in a native image.
This is an efficient way to validate the compatibility of your application.

To run your existing tests in a native image, run the following goal:

```
$ ./mvnw test -PnativeTest
```


