package com.allen_sauer.gwt.log.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;

public class RemoteLoggerService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, TypeHandler> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<Class<?>, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, TypeHandler> loadMethodsJava() {
    Map<String, TypeHandler> result = new HashMap<String, TypeHandler>();
    result.put("com.allen_sauer.gwt.log.client.ClientStackTraceElement/1554868076", new com.allen_sauer.gwt.log.client.ClientStackTraceElement_FieldSerializer.Handler());
    result.put("[Lcom.allen_sauer.gwt.log.client.ClientStackTraceElement;/3074754734", new com.allen_sauer.gwt.log.client.ClientStackTraceElement_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.allen_sauer.gwt.log.client.LogRecord/365659763", new com.allen_sauer.gwt.log.client.LogRecord_FieldSerializer.Handler());
    result.put("com.allen_sauer.gwt.log.client.WrappedClientThrowable/2147146817", new com.allen_sauer.gwt.log.client.WrappedClientThrowable_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", new com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.Handler());
    result.put("java.lang.String/2004016611", new com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.Handler());
    result.put("java.util.ArrayList/3821976829", new com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.Handler());
    result.put("java.util.HashMap/962170901", new com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer.Handler());
    result.put("java.util.LinkedHashMap/1551059846", new com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_FieldSerializer.Handler());
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.allen_sauer.gwt.log.client.ClientStackTraceElement/1554868076"] = [
        ,
        ,
        @com.allen_sauer.gwt.log.client.ClientStackTraceElement_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/allen_sauer/gwt/log/client/ClientStackTraceElement;)
      ];
    
    result["[Lcom.allen_sauer.gwt.log.client.ClientStackTraceElement;/3074754734"] = [
        ,
        ,
        @com.allen_sauer.gwt.log.client.ClientStackTraceElement_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/allen_sauer/gwt/log/client/ClientStackTraceElement;)
      ];
    
    result["com.allen_sauer.gwt.log.client.LogRecord/365659763"] = [
        ,
        ,
        @com.allen_sauer.gwt.log.client.LogRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/allen_sauer/gwt/log/client/LogRecord;)
      ];
    
    result["com.allen_sauer.gwt.log.client.WrappedClientThrowable/2147146817"] = [
        ,
        ,
        @com.allen_sauer.gwt.log.client.WrappedClientThrowable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/allen_sauer/gwt/log/client/WrappedClientThrowable;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.util.ArrayList/3821976829"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.HashMap/962170901"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.LinkedHashMap/1551059846"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<Class<?>, String> loadSignaturesJava() {
    Map<Class<?>, String> result = new HashMap<Class<?>, String>();
    result.put(com.allen_sauer.gwt.log.client.ClientStackTraceElement_FieldSerializer.concreteType(), "com.allen_sauer.gwt.log.client.ClientStackTraceElement/1554868076");
    result.put(com.allen_sauer.gwt.log.client.ClientStackTraceElement_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.allen_sauer.gwt.log.client.ClientStackTraceElement;/3074754734");
    result.put(com.allen_sauer.gwt.log.client.LogRecord_FieldSerializer.concreteType(), "com.allen_sauer.gwt.log.client.LogRecord/365659763");
    result.put(com.allen_sauer.gwt.log.client.WrappedClientThrowable_FieldSerializer.concreteType(), "com.allen_sauer.gwt.log.client.WrappedClientThrowable/2147146817");
    result.put(com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.concreteType(), "java.lang.String/2004016611");
    result.put(com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.concreteType(), "java.util.ArrayList/3821976829");
    result.put(com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer.concreteType(), "java.util.HashMap/962170901");
    result.put(com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_FieldSerializer.concreteType(), "java.util.LinkedHashMap/1551059846");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.allen_sauer.gwt.log.client.ClientStackTraceElement::class)] = "com.allen_sauer.gwt.log.client.ClientStackTraceElement/1554868076";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.allen_sauer.gwt.log.client.ClientStackTraceElement[]::class)] = "[Lcom.allen_sauer.gwt.log.client.ClientStackTraceElement;/3074754734";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.allen_sauer.gwt.log.client.LogRecord::class)] = "com.allen_sauer.gwt.log.client.LogRecord/365659763";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.allen_sauer.gwt.log.client.WrappedClientThrowable::class)] = "com.allen_sauer.gwt.log.client.WrappedClientThrowable/2147146817";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/3821976829";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/962170901";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/1551059846";
    return result;
  }-*/;
  
  public RemoteLoggerService_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
