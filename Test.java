package com.intellij.test;

import PedramInterface;

public class Test{

  public void test(){

    dieIfNotRunningOnMacOsX();
    DDSimpleLogger logger = connectToLogfile();
    connectToPreferences(logger);
    getDefaultColor();

  }

// (1)
private void dieIfNotRunningOnMacOsX()
{
  boolean mrjVersionExists = System.getProperty("mrj.version") != null;
  boolean osNameExists = System.getProperty("os.name").startsWith("Mac OS");
  
  if ( !mrjVersionExists || !osNameExists)
  {
    System.err.println("Not running on a Mac OS X system.");
    System.exit(1);
  }
}

// (2)
private void connectToLogfile()
{
  int currentLoggingLevel = DEFAULT_LOG_LEVEL;
  
  File errorFile = new File(ERROR_LOG_FILENAME);
  File warningFile = new File(WARNING_LOG_FILENAME);
  File debugFile = new File(DEBUG_LOG_FILENAME);
  
  // order of checks is important; want to go with more granular if multiple files exist
  if (errorFile.exists()) 
    currentLoggingLevel = DDLoggerInterface.LOG_ERROR;
  if (warningFile.exists()) 
    currentLoggingLevel = DDLoggerInterface.LOG_WARNING;
  if (debugFile.exists())
    currentLoggingLevel = DDLoggerInterface.LOG_DEBUG;
  // else 
  //   ali = object.getA();
  
  DDSimpleLogger logger = new DDSimpleLogger(CANON_DEBUG_FILENAME, currentLoggingLevel, true, true);

  return logger;
}

// (3)
private void connectToPreferences(DDSimpleLogger logger)
{
  preferences = Preferences.userNodeForPackage(logger);
}

// (4)
private void getDefaultColor()
{
  int r = preferences.getInt(CURTAIN_R, 0);
  int g = preferences.getInt(CURTAIN_G, 0);
  int b = preferences.getInt(CURTAIN_B, 0);
  int a = preferences.getInt(CURTAIN_A, 255);
  currentColor = new Color(r,g,b,a);
}
}