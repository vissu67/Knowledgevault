package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTLock_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTLock_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTLock)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTLock_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTLock_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTLock)object);
    }
  }
  private static native java.lang.String getNodePath(com.openkm.frontend.client.bean.GWTLock instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLock::nodePath;
  }-*/;
  
  private static native void  setNodePath(com.openkm.frontend.client.bean.GWTLock instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTLock::nodePath = value;
  }-*/;
  
  private static native java.lang.String getOwner(com.openkm.frontend.client.bean.GWTLock instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLock::owner;
  }-*/;
  
  private static native void  setOwner(com.openkm.frontend.client.bean.GWTLock instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTLock::owner = value;
  }-*/;
  
  private static native java.lang.String getToken(com.openkm.frontend.client.bean.GWTLock instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLock::token;
  }-*/;
  
  private static native void  setToken(com.openkm.frontend.client.bean.GWTLock instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTLock::token = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTLock.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTLock instance) throws SerializationException {
    setNodePath(instance, streamReader.readString());
    setOwner(instance, streamReader.readString());
    setToken(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTLock instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTLock();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTLock instance) throws SerializationException {
    streamWriter.writeString(getNodePath(instance));
    streamWriter.writeString(getOwner(instance));
    streamWriter.writeString(getToken(instance));
    
  }
  
}
