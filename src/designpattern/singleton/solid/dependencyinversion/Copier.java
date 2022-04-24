package designpattern.singleton.solid.dependencyinversion;

public class Copier {
    public void copy(Reader reader,Writer writer){
        String text=reader.read();
        writer.write(text);
    }
}
