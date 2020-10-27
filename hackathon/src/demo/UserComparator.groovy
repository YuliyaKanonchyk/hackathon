package demo

import demo.model.User

class UserComparator implements Comparator<User>{

    @Override
    int compare(User o1, User o2) {
        o2.getSalary() <=> o1.getSalary()
    }
}