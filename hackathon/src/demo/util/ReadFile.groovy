package demo.util

import demo.model.User

interface ReadFile {
    List<User> textRead() throws IOException
}