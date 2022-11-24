//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package gradle_2;

import java.io.PrintStream;

import org.apache.commons.cli.*;
import org.apache.commons.lang.WordUtils;

import static java.lang.System.out;

public final class App {

    String message;
    public App() {

        message = "hello world!";
    }

    public App(String Message) {
        message = Message;
    }
    public String[] UpperCaseOfMessage() {
        String out1 =  "standard message : " + message;
        String out2 = "capitalized by " + WordUtils.class.getName() + " : " + WordUtils.capitalizeFully(message);
        return new String[] {out1, out2};
    }

    public static void main(String[] Message) {
        App MessageApp;
        if (Message.length == 0) {
            MessageApp = new App();
        }
        else {
            MessageApp = new App(Message[0]);
        }
        String[] Result = MessageApp.UpperCaseOfMessage();

        out.println(Result[0]);
        out.println(Result[1]);
    }
}
