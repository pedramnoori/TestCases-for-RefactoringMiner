public class NIOServerCnxn extends ServerCnxn { 
    private void cleanupWriterSocket(PrintWriter pwriter) {
        try {
            if (pwriter != null) {
                pwriter.flush();
            }
        } catch (Exception e) {
            LOG.info("Error closing PrintWriter ", e);
        }
    } 
    private abstract class CommandThread {
        public void run() {
            try {
                commandRun();
            } catch (IOException ie) {
                LOG.error("Error in running command ", ie);
            } finally {
                cleanupWriterSocket(pw);
            }
        int a = 10;
        int b = a + 25;
        return;
        }
    }
}



