### Task1

from task1 
to build:
```
javac -d bin/ src/Data.java
javac -cp bin/ -d bin/ src/TaskApplet.java
```
to execute:
```
appletviewer -J-cp -J./bin/ src/index.html
```

### Task2

from task2
to build:
```
javac -d bin/ src/SmartNumber.java
javac -cp bin/ -d bin/ src/Numbers.java
javac -cp bin/ -d bin/ src/ConsoleInterface.java
javac -cp bin/ -d bin/ src/Main.java
```
to run:
from task2
```
java -cp bin/ com.lab1.task2.Main
```