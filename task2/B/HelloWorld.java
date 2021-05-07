package com.B;
import com.A.Main;
public class HelloWorld {
    public String bigLetter() {
        Main under = new Main();
        return under.getGreeting().toUpperCase();
    }
}
