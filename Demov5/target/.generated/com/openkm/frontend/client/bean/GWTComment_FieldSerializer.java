package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTComment_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTComment_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTComment)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTComment_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTComment_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTComment)object);
    }
  }
  private static native java.lang.String getActorId(com.openkm.frontend.client.bean.GWTComment instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTComment::actorId;
  }-*/;
  
  private static native void  setActorId(com.openkm.frontend.client.bean.GWTComment instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTComment::actorId = value;
  }-*/;
  
  private static native java.lang.String getMessage(com.openkm.frontend.client.bean.GWTComment instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTComment::message;
  }-*/;
  
  private static native void  setMessage(com.openkm.frontend.client.bean.GWTComment instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTComment::message = value;
  }-*/;
  
  private static native java.util.Date getTime(com.openkm.frontend.client.bean.GWTComment instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTComment::time;
  }-*/;
  
  private static native void  setTime(com.openkm.frontend.client.bean.GWTComment instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTComment::time = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTComment.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTComment instance) throws SerializationException {
    setActorId(instance, streamReader.readString());
    setMessage(instance, streamReader.readString());
    setTime(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTComment instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTComment();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTComment instance) throws SerializationException {
    streamWriter.writeString(getActorId(instance));
    streamWriter.writeString(getMessage(instance));
    streamWriter.writeObject(getTime(instance));
    
  }
  
}
