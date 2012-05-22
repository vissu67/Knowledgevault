package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTWorkflowComment_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTWorkflowComment_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTWorkflowComment)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTWorkflowComment_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTWorkflowComment_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTWorkflowComment)object);
    }
  }
  private static native java.lang.String getActorId(com.openkm.frontend.client.bean.GWTWorkflowComment instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkflowComment::actorId;
  }-*/;
  
  private static native void  setActorId(com.openkm.frontend.client.bean.GWTWorkflowComment instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkflowComment::actorId = value;
  }-*/;
  
  private static native java.lang.String getMessage(com.openkm.frontend.client.bean.GWTWorkflowComment instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkflowComment::message;
  }-*/;
  
  private static native void  setMessage(com.openkm.frontend.client.bean.GWTWorkflowComment instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkflowComment::message = value;
  }-*/;
  
  private static native java.util.Date getTime(com.openkm.frontend.client.bean.GWTWorkflowComment instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkflowComment::time;
  }-*/;
  
  private static native void  setTime(com.openkm.frontend.client.bean.GWTWorkflowComment instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkflowComment::time = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTWorkflowComment.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTWorkflowComment instance) throws SerializationException {
    setActorId(instance, streamReader.readString());
    setMessage(instance, streamReader.readString());
    setTime(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTWorkflowComment instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTWorkflowComment();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTWorkflowComment instance) throws SerializationException {
    streamWriter.writeString(getActorId(instance));
    streamWriter.writeString(getMessage(instance));
    streamWriter.writeObject(getTime(instance));
    
  }
  
}
