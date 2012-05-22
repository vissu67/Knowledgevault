package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMGeneralService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMGeneralServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMGeneralService";
  private static final String SERIALIZATION_POLICY ="1FB15F0A449C99A914395979A69167BA";
  private static final com.openkm.frontend.client.service.OKMGeneralService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMGeneralService_TypeSerializer();
  
  public OKMGeneralService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "General", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getEnabledExtensions(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMGeneralService_Proxy.getEnabledExtensions", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getEnabledExtensions");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMGeneralService_Proxy.getEnabledExtensions",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMGeneralService_Proxy.getEnabledExtensions", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getFileUploadStatus(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMGeneralService_Proxy.getFileUploadStatus", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getFileUploadStatus");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMGeneralService_Proxy.getFileUploadStatus",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMGeneralService_Proxy.getFileUploadStatus", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void testImapConnection(java.lang.String host, java.lang.String user, java.lang.String password, java.lang.String imapFolder, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMGeneralService_Proxy.testImapConnection", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("testImapConnection");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(host);
      streamWriter.writeString(user);
      streamWriter.writeString(password);
      streamWriter.writeString(imapFolder);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMGeneralService_Proxy.testImapConnection",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMGeneralService_Proxy.testImapConnection", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
