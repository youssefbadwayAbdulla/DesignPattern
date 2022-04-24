package designpattern.singleton.solid.dependencyinversion;

public class PrinterWriter  implements Writer{
    @Override
    public void write(String text) {
        System.out.println("text send to printer....."+text);
    }
}
