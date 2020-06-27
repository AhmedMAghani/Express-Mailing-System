package view;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class DynamicRegion implements Serializable {

    private String taskFlowId = "/WEB-INF/DashBoardTFCall.xml#DashBoardTFCall";

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String dashBoardTFCall() {
        setDynamicTaskFlowId("/WEB-INF/DashBoardTFCall.xml#DashBoardTFCall");
        return null;
    }

    public String compaiesTFCall() {
        setDynamicTaskFlowId("/WEB-INF/CompaiesTFCall.xml#CompaiesTFCall");
        return null;
    }

    public String contractTFCall() {
        setDynamicTaskFlowId("/WEB-INF/ContractTFCall.xml#ContractTFCall");
        return null;
    }

    public String trackingTFCall() {
        setDynamicTaskFlowId("/WEB-INF/TrackingTFCall.xml#TrackingTFCall");
        return null;
    }

    public String adminstraitveTFCall() {
        setDynamicTaskFlowId("/WEB-INF/AdminstraitveTFCall.xml#AdminstraitveTFCall");
        return null;
    }
}
