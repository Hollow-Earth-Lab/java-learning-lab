Rem cls
Rem @java -Dfile.encoding=UTF-8 CheckingTheParity
Rem @echo off
Rem --- chcp 1251

chcp 65001

echo === Проверка числа на чётность ===
echo.

javac CheckingTheParity.java

java -Dfile.encoding=UTF-8 CheckingTheParity

pause
