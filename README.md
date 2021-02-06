# Math Operations API

API calculates the minimum, maximum, average, median and percentile of given list of numbers.

## Database Requirements

PostgreSQL is installed.

```bash
CREATE USER 'harshadarade'@'localhost' WITH PASSWORD 'test@123'; 
GRANT ALL PREVILEGES ON *.* TO 'harshadarade'@'localhost' WITH GRANT OPTION;
```

## Execution
Navigate to project folder

```bash
mvn clean install
mvn compile
java -jar target/math-api-0.0.1-SNAPSHOT.jar
OR
mvn spring-boot:run
```

## Usage
1. `/min` accepts two arguments, List of numbers and a quantifier value from the body of the request.
```
{
  "numberList" : [1,2,3,4,5],
  "quantifier" : 2
}
```
2. `/max` accepts two arguments, List of numbers and a quantifier value from the body of the request.
```
{
  "numberList" : [1,2,3,4,5],
  "quantifier" : 2
}
```

3. `/avg` accepts one arguments, List of numbers from the body. Returns average value of the list of numbers
```
{
  "numberList" : [1,2,3,4,5]
}
```
4. `/median` accepts one arguments, List of numbers from the body. Returns median of the list of numbers.
```
{
  "numberList" : [1,2,3,4,5]
}
```
4. `/percentile` accepts two arguments, List of numbers and quantifier(q) from the body.
Returns the qth percentile from the list.
```
{
  "numberList" : [20,40,90,70],
  "quantifier" : 90
}
```