package com.rohit;

public class Alien {

    private Computer computer;
    /// constructor injection

    public Alien(Computer computer){
        this.computer=computer;
    }

//    setter injection
//    public void setComputer(Computer computer) {
//        this.computer = computer;
//    }

    public void code() {
        computer.compile();
        System.out.println("Alien is coding...");
    }
}