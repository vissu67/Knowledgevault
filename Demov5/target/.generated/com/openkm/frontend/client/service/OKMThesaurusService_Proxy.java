package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMThesaurusService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMThesaurusServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMThesaurusService";
  private static final String SERIALIZATION_POLICY ="8D37AA0DE750165BBF048F13A657FF64";
  private static final com.openkm.frontend.client.service.OKMThesaurusService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMThesaurusService_TypeSerializer();
  
  public OKMThesaurusService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Thesaurus", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getKeywords(java.lang.String filter, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMThesaurusService_Proxy.getKeywords", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getKeywords");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(filter);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMThesaurusService_Proxy.getKeywords",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMThesaurusService_Proxy.getKeywords", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
