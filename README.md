# ClickerTest
Инструкция к запуску:

git clone https://github.com/Terekhov-Nikita/ClickerTest.git

cd ClickerTest

#В файле src\main\resources\application.properties поменять свойства spring.datasource.url, spring.datasource.username и spring.datasource.password на соответствующие вашей БД PostgreSQL

mvn compile

mvn package

cd target

java -jar ClickerTest-0.0.1-SNAPSHOT.jar
