import java.io.*;
import java.util.StringTokenizer;


/**
 * LostCow
 */
public class LostCow {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter out = new PrintWriter("lostcow.in");


        StringTokenizer s = new StringTokenizer(in.readLine());
        int x = Integer.parseInt(s.nextToken());
        int y = Integer.parseInt(s.nextToken());

        boolean reached = false;
        boolean forth = y > x;
        
        int toAdd = 1;
        
        while(!reached){


            x += toAdd;
            reached = (forth) ? x >= y : y >= x ;
            toAdd *= -2;

        }


        if(forth)
            x -= ( x - y );
        else
            x += ()
        



    }
}