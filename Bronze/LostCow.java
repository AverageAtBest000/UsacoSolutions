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

        boolean reached = false;
        boolean forth = y > x;
        
        int toAdd = 1;
        int dist = 0;

        while(!reached){
            x += dist;
            dist += dist + Math.abs(toAdd);
            reached = (forth) ? x >= y : y >= x ;
            toAdd *= -2;

        }


        if(forth)
            dist -= ( Math.abs(x - y) );
        else
            dist += (Math.abs(x-y));
        
        out.print(dist);


        out.close();
        in.close();


        // BufferedReader in = new BufferedReader(new FileReader("lostcow.in"));
        // PrintWriter out = new PrintWriter("lostcow.in");


        // StringTokenizer s = new StringTokenizer(in.readLine());
        // int x = Integer.parseInt(s.nextToken());
        // int y = Integer.parseInt(s.nextToken());

        // int turns = (int) Math.ceil( Math.log( Math.abs(y) )/Math.log(2) );

        // int count = 0;
        // for(int i = 0; i <= turns ; i++)
        // {
        //     count += count + Math.pow(2, i)
        // }

    }
}