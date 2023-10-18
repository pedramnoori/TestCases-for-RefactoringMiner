public abstract class AbstractFourLetterCommand {
   protected ServerCnxn serverCnxn;

   public void run() {
      try {
         commandRun();
      } catch (IOException ie) {
         LOG.error("Error in running command ", ie);
      } finally {
         serverCnxn.cleanupWriterSocket(pw);
      }
      extractedRun();
   }
   public void extractedRun() {
        int a = 10;
        int b = a + 25;
        return;
   }
}
public abstract class ServerCnxn {
       public void cleanupWriterSocket(PrintWriter pwriter) {
        try {
            if (pwriter != null) {
                pwriter.flush();
            }
        } catch (Exception e) {
            LOG.info("Error closing PrintWriter ", e);
        }
    }
}

