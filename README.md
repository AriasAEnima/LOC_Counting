# LOC Counting

Esta aplicacion permite contar las lineas fisicas y de codigo java existentes en un archivo, dando parametros por la terminal

## Para empezar

Se debe ejecutar en la carpeta raiz
```
git clone https://github.com/AriasAEnima/LOC_Counting.git
```
### Prerequisitos

Java Jdk 1.8, Maven y Git.

### Instalación

Primero ejecutamos maven en la carpeta raiz

```
mvn package
```

Para correr por terminal :

```
> java -cp target/LOC_Counting-1.0-SNAPSHOT.jar edu.escuelaing.arsw.intro.App <opt> <path>
// Ejemplo:
> java -cp target/LOC_Counting-1.0-SNAPSHOT.jar edu.escuelaing.arsw.intro.App phy resources/prueba.java
```

## Corriendo las Pruebas

Al ejecutar mvn packge se correran 4 test

### Pruebas especificas

Se corrio 2 pruebas para cada uno de los dos archivos de pruebas que esta en la carpeta /resources (prueba.java y prueba2.java)

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Desarollo

Add additional notes about how to deploy this on a live system

## Construido con

* [JAVA JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html) - Version de Java
* [Maven](https://maven.apache.org/) - Maven
* [JUnit 3.8.1](https://mvnrepository.com/artifact/junit/junit/3.8.1) - Para Pruebas


## Authors

* **J. Eduardo Arias Barrera** - *Initial work* - [AriasAEnima](https://github.com/AriasAEnima)


## License

This project is licensed under the GNU General Public License - see the [LICENSE](LICENSE) file for details
