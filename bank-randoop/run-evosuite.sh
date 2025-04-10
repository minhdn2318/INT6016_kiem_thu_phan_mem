#!/bin/bash
# Đường dẫn đến Java 8
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk
export PATH=$JAVA_HOME/bin:$PATH

echo "--- Java Version ---"
java -version

echo "--- Compiling BankAccount.java with Java 8 ---"
javac -source 8 -target 8 BankAccount.java

echo "--- Running EvoSuite ---"
java -jar evosuite-1.2.0.jar -class BankAccount -projectCP .
