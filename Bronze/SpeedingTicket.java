import java.util.*;
import java.io.*;

public class SpeedingTicket{

    public static void main(String[] args) throws IOException
    {

        BufferedReader in  = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter out = new PrintWriter("speeding.out");
        
        String a = in.readLine();
        StringTokenizer s = new StringTokenizer(a);
        
        int N = Integer.parseInt(s.nextToken());
        int M = Integer.parseInt(s.nextToken());
        
        int[] cowSpeeds = new int[100];
        int[] roadSpeeds = new int[100];
        
        int totalLen = 0; 
        for(int i = 0 ; i < N; i++)
        {
            String line = in.readLine();
            s = new StringTokenizer(line);

            int segnmentLen = Integer.parseInt(s.nextToken());
            int speed = Integer.parseInt(s.nextToken());
            
            for(int j = totalLen; j < totalLen + segnmentLen; j++ ){

                roadSpeeds[j] = speed;

            }
                
            totalLen += segnmentLen;
        }

        totalLen = 0; 
        for(int i = 0 ; i < M; i++)
        {
            String line = in.readLine();
            s = new StringTokenizer(line);

            int segnmentLen = Integer.parseInt(s.nextToken());
            int speed = Integer.parseInt(s.nextToken());
            
            for(int j = totalLen; j < totalLen + segnmentLen; j++ ){

                cowSpeeds[j] = speed;

            }
            totalLen += segnmentLen;

        }

        int max = 0; 

        for(int i = 0; i < 100; i++)
        {
            if(cowSpeeds[i]>roadSpeeds[i]){
                if(cowSpeeds[i] - roadSpeeds[i] > max)
                    max = cowSpeeds[i] - roadSpeeds[i];
            }


        }

        out.print(max);


        
        in.close();
        out.close();
    }

}