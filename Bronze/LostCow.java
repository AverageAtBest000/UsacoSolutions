import java.io.*;
import java.util.StringTokenizer;

/**
 * LostCow
 */
public class LostCow {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter out = new PrintWriter("lostcow.out");

        StringTokenizer s = new StringTokenizer(in.readLine());
        int x = Integer.parseInt(s.nextToken());
        int y = Integer.parseInt(s.nextToken());



        int diff = Math.abs(y-x);
        int turns = (int) Math.ceil(Math.log(diff) / Math.log(2));

        if (y > x && turns % 2 != 0) {
            turns++;
        } else if (y < x && turns % 2 == 0) {
            turns++;
        }

        int count = 1;
        int toAdd = 3;
        int doubler = (int)Math.pow(2,turns);
        doubler = (turns % 2 ==  0)? doubler : -doubler;

        for(int i = 0; i < turns ; i++)
        {
            count += toAdd;
            toAdd *= 2;
        }

        int pos = x + doubler;


        count -= Math.abs(pos - y);

        out.print(count);

        out.close();
        in.close();



    }
}