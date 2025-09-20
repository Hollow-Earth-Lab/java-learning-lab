:: @echo off

chcp 1251

:: chcp 65001

javac -encoding Cp1251 HelloRu.java

java -Dfile.encoding=Cp1251 HelloRu
:: java -Dfile.encoding=UTF-8 HelloRu

pause
