package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMSearchService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMSearchServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMSearchService";
  private static final String SERIALIZATION_POLICY ="9312087E6A2D1BCB0831CE712770A2B7";
  private static final com.openkm.frontend.client.service.OKMSearchService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMSearchService_TypeSerializer();
  
  public OKMSearchService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Search", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void deleteSearch(int id, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.deleteSearch", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteSearch");
      streamWriter.writeInt(1);
      streamWriter.writeString("I");
      streamWriter.writeInt(id);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.deleteSearch",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMSearchService_Proxy.deleteSearch", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void find(com.openkm.frontend.client.bean.GWTQueryParams params, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.find", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("find");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.openkm.frontend.client.bean.GWTQueryParams/416604666");
      streamWriter.writeObject(params);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.find",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMSearchService_Proxy.find", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void findPaginated(com.openkm.frontend.client.bean.GWTQueryParams params, int offset, int limit, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.findPaginated", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("findPaginated");
      streamWriter.writeInt(3);
      streamWriter.writeString("com.openkm.frontend.client.bean.GWTQueryParams/416604666");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeObject(params);
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.findPaginated",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMSearchService_Proxy.findPaginated", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getAllSearchs(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.getAllSearchs", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAllSearchs");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.getAllSearchs",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMSearchService_Proxy.getAllSearchs", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getKeywordMap(java.util.List filter, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.getKeywordMap", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getKeywordMap");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(filter);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.getKeywordMap",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMSearchService_Proxy.getKeywordMap", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void saveSearch(com.openkm.frontend.client.bean.GWTQueryParams params, java.lang.String type, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.saveSearch", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("saveSearch");
      streamWriter.writeInt(2);
      streamWriter.writeString("com.openkm.frontend.client.bean.GWTQueryParams/416604666");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(params);
      streamWriter.writeString(type);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.saveSearch",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMSearchService_Proxy.saveSearch", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void share(int qpId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.share", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("share");
      streamWriter.writeInt(1);
      streamWriter.writeString("I");
      streamWriter.writeInt(qpId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.share",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMSearchService_Proxy.share", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void unshare(int qpId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.unshare", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("unshare");
      streamWriter.writeInt(1);
      streamWriter.writeString("I");
      streamWriter.writeInt(qpId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMSearchService_Proxy.unshare",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "OKMSearchService_Proxy.unshare", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
