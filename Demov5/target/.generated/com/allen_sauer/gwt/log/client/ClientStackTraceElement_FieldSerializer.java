package com.allen_sauer.gwt.log.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ClientStackTraceElement_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.allen_sauer.gwt.log.client.ClientStackTraceElement_FieldSerializer.deserialize(reader, (com.allen_sauer.gwt.log.client.ClientStackTraceElement)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.allen_sauer.gwt.log.client.ClientStackTraceElement_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.allen_sauer.gwt.log.client.ClientStackTraceElement_FieldSerializer.serialize(writer, (com.allen_sauer.gwt.log.client.ClientStackTraceElement)object);
    }
  }
  private static native java.lang.String getDeclaringClass(com.allen_sauer.gwt.log.client.ClientStackTraceElement instance) /*-{
    return instance.@com.allen_sauer.gwt.log.client.ClientStackTraceElement::declaringClass;
  }-*/;
  
  private static native void  setDeclaringClass(com.allen_sauer.gwt.log.client.ClientStackTraceElement instance, java.lang.String value) /*-{
    instance.@com.allen_sauer.gwt.log.client.ClientStackTraceElement::declaringClass = value;
  }-*/;
  
  private static native java.lang.String getFileName(com.allen_sauer.gwt.log.client.ClientStackTraceElement instance) /*-{
    return instance.@com.allen_sauer.gwt.log.client.ClientStackTraceElement::fileName;
  }-*/;
  
  private static native void  setFileName(com.allen_sauer.gwt.log.client.ClientStackTraceElement instance, java.lang.String value) /*-{
    instance.@com.allen_sauer.gwt.log.client.ClientStackTraceElement::fileName = value;
  }-*/;
  
  private static native int getLineNumber(com.allen_sauer.gwt.log.client.ClientStackTraceElement instance) /*-{
    return instance.@com.allen_sauer.gwt.log.client.ClientStackTraceElement::lineNumber;
  }-*/;
  
  private static native void  setLineNumber(com.allen_sauer.gwt.log.client.ClientStackTraceElement instance, int value) /*-{
    instance.@com.allen_sauer.gwt.log.client.ClientStackTraceElement::lineNumber = value;
  }-*/;
  
  private static native java.lang.String getMethodName(com.allen_sauer.gwt.log.client.ClientStackTraceElement instance) /*-{
    return instance.@com.allen_sauer.gwt.log.client.ClientStackTraceElement::methodName;
  }-*/;
  
  private static native void  setMethodName(com.allen_sauer.gwt.log.client.ClientStackTraceElement instance, java.lang.String value) /*-{
    instance.@com.allen_sauer.gwt.log.client.ClientStackTraceElement::methodName = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.allen_sauer.gwt.log.client.ClientStackTraceElement.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.allen_sauer.gwt.log.client.ClientStackTraceElement instance) throws SerializationException {
    setDeclaringClass(instance, streamReader.readString());
    setFileName(instance, streamReader.readString());
    setLineNumber(instance, streamReader.readInt());
    setMethodName(instance, streamReader.readString());
    
  }
  
  public static native com.allen_sauer.gwt.log.client.ClientStackTraceElement instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @com.allen_sauer.gwt.log.client.ClientStackTraceElement::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, com.allen_sauer.gwt.log.client.ClientStackTraceElement instance) throws SerializationException {
    streamWriter.writeString(getDeclaringClass(instance));
    streamWriter.writeString(getFileName(instance));
    streamWriter.writeInt(getLineNumber(instance));
    streamWriter.writeString(getMethodName(instance));
    
  }
  
}
