package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMNotifyService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMNotifyServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMNotifyService";
  private static final String SERIALIZATION_POLICY ="7CB79A212791436EB2F8D88CFFBCE82A";
  private static final com.openkm.frontend.client.service.OKMNotifyService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMNotifyService_TypeSerializer();
  
  public OKMNotifyService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Notify", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void notify(java.lang.String docPath, java.lang.String users, java.lang.String roles, java.lang.String message, boolean attachment, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMNotifyService_Proxy.notify", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("notify");
      streamWriter.writeInt(5);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeString(docPath);
      streamWriter.writeString(users);
      streamWriter.writeString(roles);
      streamWriter.writeString(message);
      streamWriter.writeBoolean(attachment);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMNotifyService_Proxy.notify",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMNotifyService_Proxy.notify", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void subscribe(java.lang.String nodePath, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMNotifyService_Proxy.subscribe", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("subscribe");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(nodePath);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMNotifyService_Proxy.subscribe",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMNotifyService_Proxy.subscribe", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void unsubscribe(java.lang.String nodePath, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMNotifyService_Proxy.unsubscribe", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("unsubscribe");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(nodePath);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMNotifyService_Proxy.unsubscribe",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMNotifyService_Proxy.unsubscribe", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
