package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private ICommand comLambda = str -> System.out.println(str + " use Lambda");
    private ICommand comMetRef = App::execute;
    private ICommand comAnonClass = new ICommand() {
        @Override
        public void execute(String str) {
            System.out.println(str + " use AnonClass");
        }
    };
    private ICommand comClass = new Command();

    private static Map<String,ICommand> map = new HashMap<>();

    private static void execute(String str) {
        System.out.println(str + " use MetRef");
    }

    private void setMap(){
        map.put("Lambda",comLambda);
        map.put("MetRef",comMetRef);
        map.put("AnonClass",comAnonClass);
        map.put("Class",comClass);
    }

    public static void main(String[] args) {
        new App().setMap();
        String name;
        String arg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi user!");
        while (!sc.nextLine().equals("Q")){
            System.out.println("Enter command name: ");
            name = sc.nextLine();
            System.out.println("Enter argument");
            arg = sc.nextLine();
            map.get(name).execute(arg);
        }
    }
}
