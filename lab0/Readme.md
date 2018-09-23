### Task1

```sh 
  javac -d ./bin ./src/*.java && cd ./bin && java One
```

### Tasl2

```sh 
  cd ./src && javac -d ../compiled *.java && cd ../compiled && java Main
```
Task 3

```sh 
  cd ./src && javac -d ../bin *.java && cd ../bin && java Main
```
Task 4

```sh 
  cd ./src && jar cmf Manifest tmp.jar *.java
```
Task 5

```sh 
  cd ./src && javac -d ../labpackage Hello.java
```

```sh
  javac -cp ../labpackage -d ../labpackage Main.java
```
