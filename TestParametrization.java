package com.facebook.buck.cli;

public class Test {

  public static WorkflowConfig getWorkflowCfg(HelixManager manager,
      String workflowResource, String clusterName) {
    String workflowCfg =
        manager.getResourceConfigMap(manager, workflowResource, "bar", "foo");
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

    public static String getResourceConfigMap(HelixManager manager, String resource, String test2, String res) {


    if (test2 = "doThis") {
      String res = doThis();
    }

    return res;

  }

}