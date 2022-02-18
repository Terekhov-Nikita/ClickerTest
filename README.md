# ClickerTest
Инструкция к запуску:

git clone https://github.com/Terekhov-Nikita/ClickerTest.git

cd ClickerTest

#В файле src\main\resources\application.properties поменять свойства spring.datasource.url, spring.datasource.username и spring.datasource.password на соответствующие вашей БД PostgreSQL

mvn clean package

java -jar target/ClickerTest-1.0.jar
