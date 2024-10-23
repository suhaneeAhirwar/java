import java.net.SocketPermission;
import java.nio.channels.Pipe.SourceChannel;

class prcit{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
        }
     /*catch(Exception e){
        System.out.println(" this is catch1");
     }
    //  catch(Exception e  ){
    //     System.err.println(" this is cathch2");
    //  }*/
    
    finally{
      System.out.println(" this is finally code");
    }
}
}