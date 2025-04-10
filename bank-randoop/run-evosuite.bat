@echo off
REM Set JAVA_HOME to JDK 8 path
set "JAVA_HOME=C:\Program Files\Java\jdk1.8.0_201"
set "PATH=%JAVA_HOME%\bin;%PATH%"

REM Kiểm tra phiên bản Java
echo --- Java Version ---
java -version

REM Biên dịch lại class với target Java 8
echo --- Compiling BankAccount.java with Java 8 ---
javac -source 8 -target 8 BankAccount.java

REM Chạy EvoSuite
echo --- Running EvoSuite ---
java -jar evosuite-1.2.0.jar -class BankAccount -projectCP .

pause
