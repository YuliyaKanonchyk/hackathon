package demo

import demo.model.User
import demo.util.SalaryOperations

class ConsoleSalaryOperations implements SalaryOperations {

    def averageSalary = 0f

    @Override
    Float averageSalaryCalc(List<User> userList) {
        Float salaryCumulated = 0f
        for (
                User u : userList) {
            salaryCumulated += u.getSalary()
        }
        averageSalary = salaryCumulated / userList.size()
        averageSalary
    }

    @Override
    List<User> filterByAverageSalary(Float averageSalary, List<User> userList) {
        List<User> filteredUserList = []
        for (User u : userList) {
            if (u.getSalary() > averageSalary) {
                filteredUserList.add(u)
            }
        }
        filteredUserList
    }
}
