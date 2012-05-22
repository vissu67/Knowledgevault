package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTTaskInstance_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTTaskInstance_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTTaskInstance)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTTaskInstance_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTTaskInstance_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTTaskInstance)object);
    }
  }
  private static native java.lang.String getActorId(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::actorId;
  }-*/;
  
  private static native void  setActorId(com.openkm.frontend.client.bean.GWTTaskInstance instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::actorId = value;
  }-*/;
  
  private static native java.util.List getComments(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::comments;
  }-*/;
  
  private static native void  setComments(com.openkm.frontend.client.bean.GWTTaskInstance instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::comments = value;
  }-*/;
  
  private static native java.util.Date getCreate(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::create;
  }-*/;
  
  private static native void  setCreate(com.openkm.frontend.client.bean.GWTTaskInstance instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::create = value;
  }-*/;
  
  private static native java.lang.String getDescription(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::description;
  }-*/;
  
  private static native void  setDescription(com.openkm.frontend.client.bean.GWTTaskInstance instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::description = value;
  }-*/;
  
  private static native java.util.Date getDueDate(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::dueDate;
  }-*/;
  
  private static native void  setDueDate(com.openkm.frontend.client.bean.GWTTaskInstance instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::dueDate = value;
  }-*/;
  
  private static native double getId(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::id;
  }-*/;
  
  private static native void  setId(com.openkm.frontend.client.bean.GWTTaskInstance instance, double value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTTaskInstance instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::name = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTProcessInstance getProcessInstance(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::processInstance;
  }-*/;
  
  private static native void  setProcessInstance(com.openkm.frontend.client.bean.GWTTaskInstance instance, com.openkm.frontend.client.bean.GWTProcessInstance value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::processInstance = value;
  }-*/;
  
  private static native java.util.Date getStart(com.openkm.frontend.client.bean.GWTTaskInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTaskInstance::start;
  }-*/;
  
  private static native void  setStart(com.openkm.frontend.client.bean.GWTTaskInstance instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTaskInstance::start = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTTaskInstance.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTTaskInstance instance) throws SerializationException {
    setActorId(instance, streamReader.readString());
    setComments(instance, (java.util.List) streamReader.readObject());
    setCreate(instance, (java.util.Date) streamReader.readObject());
    setDescription(instance, streamReader.readString());
    setDueDate(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readDouble());
    setName(instance, streamReader.readString());
    setProcessInstance(instance, (com.openkm.frontend.client.bean.GWTProcessInstance) streamReader.readObject());
    setStart(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTTaskInstance instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTTaskInstance();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTTaskInstance instance) throws SerializationException {
    streamWriter.writeString(getActorId(instance));
    streamWriter.writeObject(getComments(instance));
    streamWriter.writeObject(getCreate(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeObject(getDueDate(instance));
    streamWriter.writeDouble(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getProcessInstance(instance));
    streamWriter.writeObject(getStart(instance));
    
  }
  
}
