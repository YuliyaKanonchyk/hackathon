package demo.util

import demo.model.User

interface SalaryOperations {

    Float averageSalaryCalc(List<User> userList)

    List<User> filterByAverageSalary (Float avS, List<User> userList)
}