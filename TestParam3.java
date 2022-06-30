package com.facebook.buck.cli;

public class Test {

  public static WorkflowConfig getWorkflowCfg(HelixManager manager,
      String workflowResource, String clusterName) {
    String workflowCfg =
        getResourceConfigMap(manager, workflowResource, Dummy.getString());
    if (workflowCfg == null) {
      return null;
    }
    WorkflowConfig.Builder b = WorkflowConfig.Builder.fromMap(workflowCfg);
    return b.build();
  }

      public static WorkflowConfig getWorkflowCfg(HelixManager manager, String workflowResource) {
    return getWorkflowCfg(manager.getConfigAccessor(), workflowResource,
        manager.getClusterName());
  }

    public static String getResourceConfigMap(HelixManager manager, String resource, String test) {

    String res = "";

    if (test = "doThis") {
      String res = doThis();
      return res;
    }else {
      return res + "Foo";
    }

  }

}