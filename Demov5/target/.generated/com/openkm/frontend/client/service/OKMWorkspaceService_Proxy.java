package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMWorkspaceService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMWorkspaceServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMWorkspaceService";
  private static final String SERIALIZATION_POLICY ="9B219498A0AFEA0EF886347FA26C668D";
  private static final com.openkm.frontend.client.service.OKMWorkspaceService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMWorkspaceService_TypeSerializer();
  
  public OKMWorkspaceService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Workspace", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void deleteMailAccount(int id, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.deleteMailAccount", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteMailAccount");
      streamWriter.writeInt(1);
      streamWriter.writeString("I");
      streamWriter.writeInt(id);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.deleteMailAccount",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMWorkspaceService_Proxy.deleteMailAccount", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getUserDocumentsSize(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.getUserDocumentsSize", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getUserDocumentsSize");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.getUserDocumentsSize",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMWorkspaceService_Proxy.getUserDocumentsSize", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getUserWorkspace(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.getUserWorkspace", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getUserWorkspace");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.getUserWorkspace",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMWorkspaceService_Proxy.getUserWorkspace", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void isValidPassword(java.lang.String password, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.isValidPassword", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("isValidPassword");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(password);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.isValidPassword",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "OKMWorkspaceService_Proxy.isValidPassword", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void updateUserWorkspace(com.openkm.frontend.client.bean.GWTWorkspace workspace, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.updateUserWorkspace", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("updateUserWorkspace");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.openkm.frontend.client.bean.GWTWorkspace/3564998046");
      streamWriter.writeObject(workspace);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMWorkspaceService_Proxy.updateUserWorkspace",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMWorkspaceService_Proxy.updateUserWorkspace", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
