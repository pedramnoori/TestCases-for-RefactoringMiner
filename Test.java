package com.intellij.test;

public class Test{

public void test(){
// (1) make sure the code only runs on mac os x
boolean mrjVersionExists = System.getProperty("mrj.version") != null;
boolean osNameExists = System.getProperty("os.name").startsWith("Mac OS");

if ( !mrjVersionExists || !osNameExists)
{
  System.err.println("Not running on a Mac OS X system.");
  System.exit(1);
}

// (2) do all the logfile setup stuff
int currentLoggingLevel = DEFAULT_LOG_LEVEL;

File errorFile = new File(ERROR_LOG_FILENAME);
File warningFile = new File(WARNING_LOG_FILENAME);
File debugFile = new File(DEBUG_LOG_FILENAME);

// order of checks is important; want to go with more granular if multiple files exist
if (errorFile.exists()) currentLoggingLevel = DDLoggerInterface.LOG_ERROR;
if (warningFile.exists()) currentLoggingLevel = DDLoggerInterface.LOG_WARNING;
if (debugFile.exists()) currentLoggingLevel = DDLoggerInterface.LOG_DEBUG;

DDSimpleLogger logger = new DDSimpleLogger(CANON_DEBUG_FILENAME, currentLoggingLevel, true, true);

// (3, 4) do all the preferences stuff, and get the default color
preferences = Preferences.userNodeForPackage(logger);
int r = preferences.getInt(CURTAIN_R, 0);
int g = preferences.getInt(CURTAIN_G, 0);
int b = preferences.getInt(CURTAIN_B, 0);
int a = preferences.getInt(CURTAIN_A, 255);
currentColor = new Color(r,g,b,a);
  }
}