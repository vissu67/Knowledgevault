package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMTestService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMTestServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMTestService";
  private static final String SERIALIZATION_POLICY ="8956B20B9D3FA37CC8F036D7DA23116D";
  private static final com.openkm.frontend.client.service.OKMTestService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMTestService_TypeSerializer();
  
  public OKMTestService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Test", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void StringTest(int size, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMTestService_Proxy.StringTest", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("StringTest");
      streamWriter.writeInt(1);
      streamWriter.writeString("I");
      streamWriter.writeInt(size);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMTestService_Proxy.StringTest",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "OKMTestService_Proxy.StringTest", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void documentText(int size, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMTestService_Proxy.documentText", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("documentText");
      streamWriter.writeInt(1);
      streamWriter.writeString("I");
      streamWriter.writeInt(size);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMTestService_Proxy.documentText",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMTestService_Proxy.documentText", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void folderText(int size, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMTestService_Proxy.folderText", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("folderText");
      streamWriter.writeInt(1);
      streamWriter.writeString("I");
      streamWriter.writeInt(size);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMTestService_Proxy.folderText",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMTestService_Proxy.folderText", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
