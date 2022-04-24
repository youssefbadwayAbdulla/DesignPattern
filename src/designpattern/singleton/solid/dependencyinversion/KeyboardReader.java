package designpattern.singleton.solid.dependencyinversion;

public class KeyboardReader implements Reader {
    @Override
    public String read() {
        return "text read from keyboard";
    }
}
