package demo.model

class User {
    private static Long incId = 0l
    private Long id = incId++
    private def fistName
    private def lastName
    private Float salary

    User(Long id, fistName, lastName, Float salary) {
        this.id = id
        this.fistName = fistName
        this.lastName = lastName
        this.salary = salary
    }

    User() {
    }

    Long getId() {
        id
    }

    def getFistName() {
        fistName
    }

    void setFistName(fistName) {
        this.fistName = fistName
    }

    def getLastName() {
        lastName
    }

    void setLastName(lastName) {
        this.lastName = lastName
    }

    Float getSalary() {
        salary
    }

    void setSalary(Float salary) {
        this.salary = salary
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        User user = (User) o

        if (fistName != user.fistName) return false
        if (id != user.id) return false
        if (lastName != user.lastName) return false
        if (salary != user.salary) return false

        return true
    }

    int hashCode() {
        int result
        result = id.hashCode()
        result = 31 * result + fistName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + salary.hashCode()
        return result
    }


    @Override
    String toString() {
        "\n User: id = $id, fistName = $fistName,  lastName = $lastName,  salary = $salary "
    }

}