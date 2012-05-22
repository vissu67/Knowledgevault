package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMUserConfigService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMUserConfigServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMUserConfigService";
  private static final String SERIALIZATION_POLICY ="BACD63B6D4E1136441B66191053DD091";
  private static final com.openkm.frontend.client.service.OKMUserConfigService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMUserConfigService_TypeSerializer();
  
  public OKMUserConfigService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "UserConfig", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getUserHome(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMUserConfigService_Proxy.getUserHome", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getUserHome");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMUserConfigService_Proxy.getUserHome",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMUserConfigService_Proxy.getUserHome", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void setUserHome(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMUserConfigService_Proxy.setUserHome", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("setUserHome");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMUserConfigService_Proxy.setUserHome",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMUserConfigService_Proxy.setUserHome", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
