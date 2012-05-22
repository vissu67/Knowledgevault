package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMWorkflowService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMWorkflowServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMWorkflowService";
  private static final String SERIALIZATION_POLICY ="9B500AD208FC57A2C8C4C03087B98005";
  private static final com.openkm.frontend.client.service.OKMWorkflowService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMWorkflowService_TypeSerializer();
  
  public OKMWorkflowService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Workflow", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void addComment(double tokenId, java.lang.String message, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.addComment", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("addComment");
      streamWriter.writeInt(2);
      streamWriter.writeString("D");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeDouble(tokenId);
      streamWriter.writeString(message);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.addComment",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMWorkflowService_Proxy.addComment", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void findLatestProcessDefinitions(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.findLatestProcessDefinitions", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("findLatestProcessDefinitions");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.findLatestProcessDefinitions",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMWorkflowService_Proxy.findLatestProcessDefinitions", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void findPooledTaskInstances(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.findPooledTaskInstances", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("findPooledTaskInstances");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.findPooledTaskInstances",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMWorkflowService_Proxy.findPooledTaskInstances", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void findUserTaskInstances(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.findUserTaskInstances", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("findUserTaskInstances");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.findUserTaskInstances",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMWorkflowService_Proxy.findUserTaskInstances", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getProcessDefinitionForms(double id, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.getProcessDefinitionForms", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getProcessDefinitionForms");
      streamWriter.writeInt(1);
      streamWriter.writeString("D");
      streamWriter.writeDouble(id);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.getProcessDefinitionForms",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMWorkflowService_Proxy.getProcessDefinitionForms", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void runProcessDefinition(java.lang.String UUID, double id, java.util.List formElements, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.runProcessDefinition", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("runProcessDefinition");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("D");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString(UUID);
      streamWriter.writeDouble(id);
      streamWriter.writeObject(formElements);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.runProcessDefinition",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMWorkflowService_Proxy.runProcessDefinition", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void setTaskInstanceActorId(double id, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.setTaskInstanceActorId", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("setTaskInstanceActorId");
      streamWriter.writeInt(1);
      streamWriter.writeString("D");
      streamWriter.writeDouble(id);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.setTaskInstanceActorId",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMWorkflowService_Proxy.setTaskInstanceActorId", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void setTaskInstanceValues(double id, java.lang.String transitionName, java.util.List formElements, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.setTaskInstanceValues", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("setTaskInstanceValues");
      streamWriter.writeInt(3);
      streamWriter.writeString("D");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeDouble(id);
      streamWriter.writeString(transitionName);
      streamWriter.writeObject(formElements);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.setTaskInstanceValues",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMWorkflowService_Proxy.setTaskInstanceValues", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void startTaskInstance(double id, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.startTaskInstance", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("startTaskInstance");
      streamWriter.writeInt(1);
      streamWriter.writeString("D");
      streamWriter.writeDouble(id);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkflowService_Proxy.startTaskInstance",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMWorkflowService_Proxy.startTaskInstance", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
