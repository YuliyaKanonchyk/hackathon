package demo.util

import demo.ConsoleSalaryOperations

class ConsoleFactory {
    static ReadFile getReader (){
        new ManuallyCreated()
    }

    static Writer getWriter (){
        new ConsoleWriter()
    }

    static SalaryOperations getSalaryOperations(){
        new ConsoleSalaryOperations()
    }
}
