package com.openkm.frontend.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class OKMLanguageService_Proxy extends RemoteServiceProxy implements com.openkm.frontend.client.service.OKMLanguageServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.openkm.frontend.client.service.OKMLanguageService";
  private static final String SERIALIZATION_POLICY ="52E4B729A93659B1B0C8C13ACEB85253";
  private static final com.openkm.frontend.client.service.OKMLanguageService_TypeSerializer SERIALIZER = new com.openkm.frontend.client.service.OKMLanguageService_TypeSerializer();
  
  public OKMLanguageService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "Language", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getFrontEndTranslations(java.lang.String lang, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMLanguageService_Proxy.getFrontEndTranslations", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getFrontEndTranslations");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(lang);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("OKMLanguageService_Proxy.getFrontEndTranslations",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "OKMLanguageService_Proxy.getFrontEndTranslations", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
