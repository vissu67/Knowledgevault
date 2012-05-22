package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMKeyValueService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMKeyValueServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMKeyValueService";
  private static final String SERIALIZATION_POLICY ="1B64C5EAB3E47DB0C76000DE5EB124FF";
  private static final com.openkm.frontend.client.service.OKMKeyValueService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMKeyValueService_TypeSerializer();
  
  public OKMKeyValueService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "KeyValue", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getKeyValues(java.util.List tables, java.lang.String query, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMKeyValueService_Proxy.getKeyValues", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getKeyValues");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(tables);
      streamWriter.writeString(query);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMKeyValueService_Proxy.getKeyValues",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMKeyValueService_Proxy.getKeyValues", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
