
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;
public class Calculator{
        public static void main(String[] args) throws ScriptException {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine js = manager.getEngineByName("js");
            System.out.println(js.eval(s));
        }
}