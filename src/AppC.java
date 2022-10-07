

import java.nio.file.NoSuchFileException;

import steganographie.*;

public class AppC {
    public static void main(String []args ){
       if (args.length ==2){
         System.out.println(args[0]);
         System.out.println(args[1]);

          if (args[0].equals("-d")){
             ListerRepertoire liste = new ListerRepertoire(args[1]);
             try {
               liste.afficher();
            } catch (NoSuchFileException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
     }
   }
       
        }
      }      


