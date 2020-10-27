package demo.util

import demo.model.User

class ManuallyCreated implements ReadFile{
    List<User> userList = []

    @Override
    List<User> textRead() {
        userList << new User(0, "Vasilii", "Vasiliev", 1000.01f)
        userList << new User(1,"Victor", "Victorov", 4000.63f)
        userList << new User(2,"Petr", "Petrov", 2000.99f)
        userList << new User(3,"Vladimir", "Vladimirov", 6000.45f)
        userList << new User(4,"Fedor", "Fedorov", 3000.71f)
        userList << new User(5,"Aleksei", "Alekseev", 5000.42f)
        userList << new User(6,"Sergei", "Sergeev", 9000.89f)
        userList << new User(7,"Ivan", "Ivanov", 7000.01f)
        userList << new User(8,"Nikolai", "Nikolaev", 1800.01f)
        userList << new User(9,"Aleksandr", "Aleksandrov", 7860.01f)
        userList << new User(10,"Artem", "Ivanov", 2360.01f)
        userList << new User(11,"Gennadii", "Sidorov", 5100.01f)
        userList << new User(12,"Timofei", "Korneev", 900.85f)
        userList << new User(13,"Kornei", "Chukovskii", 3300.12f)
        userList << new User(14,"Dmitrii", "Dmitriev", 2610.51f)
        userList << new User(15,"Serhei", "Esenin", 2150.61f)
        userList << new User(16,"Lev", "Tolstoi", 899.66f)
        userList << new User(17,"Nikolai", "Gogol", 1900.81f)
        userList << new User(18,"Aleksandr", "Pushkin", 5600.21f)
        userList << new User(19,"Anton", "Chehov", 6890.31f)
        userList << new User(20,"Fedor", "Dostoevskii", 4511.45f)
        userList << new User(21,"Ivan", "Turgenev", 3568.99f)
        userList << new User(22,"Michail", "Lermontov", 8462.63f)
        userList << new User(23,"Maksim", "Gorkii", 8941.44f)
        userList << new User(24,"Vladimir", "Nabokov", 6320.33f)
        userList << new User(25,"Michail", "Bulgakov", 1324.22f)
        userList << new User(26,"Aleksandr", "Gerzen", 3321.11f)
        userList << new User(27,"Afanasii", "Fet", 6014.77f)
        userList << new User(28,"Gleb", "Yspenskii", 2457.88f)
        userList << new User(29,"Aleksandr", "Grin", 4521.00f)
        userList << new User(30,"Michail", "Lomonosov", 5213.04f)
        userList
    }


}
