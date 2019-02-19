package task2;

public class Command implements ICommand {
    @Override
    public void execute(String str) {
        System.out.println(str + " use class");
    }
}
