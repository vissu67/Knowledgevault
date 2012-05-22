package com.allen_sauer.gwt.log.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class RemoteLoggerService_Proxy extends RemoteServiceProxy implements com.allen_sauer.gwt.log.client.RemoteLoggerServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.allen_sauer.gwt.log.client.RemoteLoggerService";
  private static final String SERIALIZATION_POLICY ="97FBB296F96A1625211D3826F749C9FB";
  private static final com.allen_sauer.gwt.log.client.RemoteLoggerService_TypeSerializer SERIALIZER = new com.allen_sauer.gwt.log.client.RemoteLoggerService_TypeSerializer();
  
  public RemoteLoggerService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "gwt-log", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void log(java.util.ArrayList logRecords, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RemoteLoggerService_Proxy.log", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("log");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.ArrayList/3821976829");
      streamWriter.writeObject(logRecords);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("RemoteLoggerService_Proxy.log",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "RemoteLoggerService_Proxy.log", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
