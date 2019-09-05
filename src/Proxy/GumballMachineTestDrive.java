package Proxy;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;
        String location = "";

        count = 112;
        location = "Seattle";

        GumballMachine gumballMachine = new GumballMachine(location, count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
