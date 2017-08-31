package luyao;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by luyao
 * on 2017/8/31 10:26
 */
public class Write {

    public static void main(String[] args) {

        FileWriter writer=null;
        int count=1;
        try {
            writer=new FileWriter("D:/test.txt");

            for (int i=0;i<1500;i++){
               if (i%2==0)
                   writer.write("|");
               else
                   writer.write(count+++"    ");
               if (i%20==0 && i!=0)
                   writer.write("\r\n|");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
