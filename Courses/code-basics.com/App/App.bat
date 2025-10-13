:: chcp 65001
chcp 1251

del App.class

javac -encoding Cp1251 App.java

java -Dfile.encoding=Cp1251 App

pause
