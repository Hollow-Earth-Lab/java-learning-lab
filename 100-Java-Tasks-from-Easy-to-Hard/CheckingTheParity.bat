Rem cls
Rem @java -Dfile.encoding=UTF-8 CheckingTheParity
Rem @pause

@echo off

chcp 65001
Rem --- chcp 1251

cls

echo === Проверка числа на чётность ===
Rem echo.
echo.
java -Dfile.encoding=UTF-8 CheckingTheParity
pause
