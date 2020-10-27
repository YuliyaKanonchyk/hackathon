package demo

import demo.model.User
import demo.util.ConsoleFactory
import demo.util.ReadFile
import demo.util.SalaryOperations
import demo.util.Writer
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

static void main(String[] args) {
    homeTask()
}

private static void demo() {
    Demo demo = new Demo("Hello World")

    println demo
    println demo as String
    println demo as Integer
    println demo as int

    def jsonObj = [a: "AAA", b: "BBB"]
    println jsonObj

    def json = JsonOutput.toJson(jsonObj)
    println json

    def parsedJson = new JsonSlurper().parseText(json)
    println parsedJson
}

/**
 * Есть коллекция пользователей от 15 до 30(на ваше усмотрение).
 * У пользователя есть следующие поля:
 * id(long), fistName(String), lastName(String), salary(float) (как вы будете их заполнять решать вам)
 * Необходимо:
 * 1. Вывести всех пользователей в порядке уменьшения зп
 * 2. Найти среднюю зп
 * 3. Вывести всех пользователей у которых зп выше средней
 *
 * Важно: Будет плюсом если вы будете использовать groovy-style при решении задачи
 */
static homeTask() {
    ReadFile reader = ConsoleFactory.getReader()
    Writer writer = ConsoleFactory.getWriter()
    SalaryOperations salaryOperations = ConsoleFactory.getSalaryOperations()

    List<User> userList = reader.textRead()
    Float avSal = salaryOperations.averageSalaryCalc(userList)

    writer.write(userList.toSorted(new UserComparator()).toString())
    writer.write("Average salary = ${avSal}")
    writer.write("List of Users fileterd by Average salary:\n  ${salaryOperations.filterByAverageSalary(avSal,userList.toSorted(new UserComparator()))}")


}
