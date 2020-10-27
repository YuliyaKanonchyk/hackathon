package demo.util

class ConsoleWriter implements Writer {
    @Override
    def write(String message) {
        println message
    }
}
