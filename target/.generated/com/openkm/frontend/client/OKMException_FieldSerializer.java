package com.openkm.frontend.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class OKMException_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.OKMException_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.OKMException)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.OKMException_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.OKMException_FieldSerializer.serialize(writer, (com.openkm.frontend.client.OKMException)object);
    }
  }
  private static native java.lang.String getCode(com.openkm.frontend.client.OKMException instance) /*-{
    return instance.@com.openkm.frontend.client.OKMException::code;
  }-*/;
  
  private static native void  setCode(com.openkm.frontend.client.OKMException instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.OKMException::code = value;
  }-*/;
  
  private static native java.lang.String getMsg(com.openkm.frontend.client.OKMException instance) /*-{
    return instance.@com.openkm.frontend.client.OKMException::msg;
  }-*/;
  
  private static native void  setMsg(com.openkm.frontend.client.OKMException instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.OKMException::msg = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.OKMException.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.OKMException instance) throws SerializationException {
    setCode(instance, streamReader.readString());
    setMsg(instance, streamReader.readString());
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.OKMException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.OKMException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.OKMException instance) throws SerializationException {
    streamWriter.writeString(getCode(instance));
    streamWriter.writeString(getMsg(instance));
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
