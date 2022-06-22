package com.facebook.buck.cli;

public class Test {

  public static WorkflowConfig getWorkflowCfg(HelixManager manager, String workflowResource) {
    String workflowCfg = getResourceConfigMap(manager, workflowResource);
    if (workflowCfg == null) {
      return null;
    }
    WorkflowConfig.Builder b = WorkflowConfig.Builder.fromMap(workflowCfg);
    return b.build();
  }

  public static String getResourceConfigMap(HelixManager manager, String resource) {
    
    String test = Dummy.getString();
    String res = "";

    if (test = "doThis") {
      String res = doThis();
    }

    return res;
  }

}