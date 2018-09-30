### Task1

from task1 
===
to build:
```
javac -d bin/ src/Data.java
javac -cp bin/ -d bin/ src/TaskApplet.java
```
===
to execute:
```
appletviewer -J-cp -J./bin/ src/index.html
```
===
### Task2

from src 
===
to build:
```
javac -d labpackage Number.java && javac -cp labpacakge -d labpackage Main.java
```
===
to run:
from lab1/task2
java -cp labpackage lab1.task2.Main