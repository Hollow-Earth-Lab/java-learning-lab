:: chcp 65001
chcp 1251

del TheNumberOfDaysBetweenTwoDates.class

javac -encoding Cp1251 TheNumberOfDaysBetweenTwoDates.java

java -Dfile.encoding=Cp1251 TheNumberOfDaysBetweenTwoDates

pause
