# ant-test

private repo for creating ant project

1. Print the command that ant is running 
`ant -verbose -debug`
https://stackoverflow.com/questions/14057439/how-can-i-see-the-full-command-ant-uses-in-the-java-task

/Users/nitirar/.sdkman/candidates/java/17.0.4-oracle/bin/java -classpath /Users/nitirar/mywork/ant/ant-test/lib/log4j/log4j-core/2.21.1/log4j-core-2.21.1.jar;/Users/nitirar/mywork/ant/ant-test/lib/log4j/log4j-api/2.21.1/log4j-api-2.21.1.jar;/Users/nitirar/mywork/ant/ant-test/target/jar/AntTest.jar -jar /Users/nitirar/mywork/ant/ant-test/target/jar/AntTest.jar

## IntelliJ idea hacks


1. Even without ant, I was not able to make idea detect jar files recursively in lib folder. This post helped. https://stackoverflow.com/questions/31968961/add-all-sub-directories-jars-into-dependencies-in-intellij-idea
.... https://stackoverflow.com/a/65529819/1266750

2. Not able to find how to make intelliJ idea automatically detect ant targets and ant lib and class paths. How to make intellij idea happy with ant
