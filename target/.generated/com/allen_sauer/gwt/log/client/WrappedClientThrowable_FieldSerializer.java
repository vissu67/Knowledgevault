package com.allen_sauer.gwt.log.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class WrappedClientThrowable_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.allen_sauer.gwt.log.client.WrappedClientThrowable_FieldSerializer.deserialize(reader, (com.allen_sauer.gwt.log.client.WrappedClientThrowable)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.allen_sauer.gwt.log.client.WrappedClientThrowable_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.allen_sauer.gwt.log.client.WrappedClientThrowable_FieldSerializer.serialize(writer, (com.allen_sauer.gwt.log.client.WrappedClientThrowable)object);
    }
  }
  private static native com.allen_sauer.gwt.log.client.WrappedClientThrowable getCause(com.allen_sauer.gwt.log.client.WrappedClientThrowable instance) /*-{
    return instance.@com.allen_sauer.gwt.log.client.WrappedClientThrowable::cause;
  }-*/;
  
  private static native void  setCause(com.allen_sauer.gwt.log.client.WrappedClientThrowable instance, com.allen_sauer.gwt.log.client.WrappedClientThrowable value) /*-{
    instance.@com.allen_sauer.gwt.log.client.WrappedClientThrowable::cause = value;
  }-*/;
  
  private static native com.allen_sauer.gwt.log.client.ClientStackTraceElement[] getClientStackTrace(com.allen_sauer.gwt.log.client.WrappedClientThrowable instance) /*-{
    return instance.@com.allen_sauer.gwt.log.client.WrappedClientThrowable::clientStackTrace;
  }-*/;
  
  private static native void  setClientStackTrace(com.allen_sauer.gwt.log.client.WrappedClientThrowable instance, com.allen_sauer.gwt.log.client.ClientStackTraceElement[] value) /*-{
    instance.@com.allen_sauer.gwt.log.client.WrappedClientThrowable::clientStackTrace = value;
  }-*/;
  
  private static native java.lang.String getMessage(com.allen_sauer.gwt.log.client.WrappedClientThrowable instance) /*-{
    return instance.@com.allen_sauer.gwt.log.client.WrappedClientThrowable::message;
  }-*/;
  
  private static native void  setMessage(com.allen_sauer.gwt.log.client.WrappedClientThrowable instance, java.lang.String value) /*-{
    instance.@com.allen_sauer.gwt.log.client.WrappedClientThrowable::message = value;
  }-*/;
  
  private static native java.lang.String getOriginalClassName(com.allen_sauer.gwt.log.client.WrappedClientThrowable instance) /*-{
    return instance.@com.allen_sauer.gwt.log.client.WrappedClientThrowable::originalClassName;
  }-*/;
  
  private static native void  setOriginalClassName(com.allen_sauer.gwt.log.client.WrappedClientThrowable instance, java.lang.String value) /*-{
    instance.@com.allen_sauer.gwt.log.client.WrappedClientThrowable::originalClassName = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.allen_sauer.gwt.log.client.WrappedClientThrowable.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.allen_sauer.gwt.log.client.WrappedClientThrowable instance) throws SerializationException {
    setCause(instance, (com.allen_sauer.gwt.log.client.WrappedClientThrowable) streamReader.readObject());
    setClientStackTrace(instance, (com.allen_sauer.gwt.log.client.ClientStackTraceElement[]) streamReader.readObject());
    setMessage(instance, streamReader.readString());
    setOriginalClassName(instance, streamReader.readString());
    
  }
  
  public static native com.allen_sauer.gwt.log.client.WrappedClientThrowable instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @com.allen_sauer.gwt.log.client.WrappedClientThrowable::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, com.allen_sauer.gwt.log.client.WrappedClientThrowable instance) throws SerializationException {
    streamWriter.writeObject(getCause(instance));
    streamWriter.writeObject(getClientStackTrace(instance));
    streamWriter.writeString(getMessage(instance));
    streamWriter.writeString(getOriginalClassName(instance));
    
  }
  
}
