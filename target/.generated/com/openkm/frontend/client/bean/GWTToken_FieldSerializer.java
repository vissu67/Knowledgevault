package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTToken_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTToken_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTToken)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTToken_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTToken_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTToken)object);
    }
  }
  private static native java.util.Collection getAvailableTransitions(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::availableTransitions;
  }-*/;
  
  private static native void  setAvailableTransitions(com.openkm.frontend.client.bean.GWTToken instance, java.util.Collection value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::availableTransitions = value;
  }-*/;
  
  private static native java.util.Collection getComments(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::comments;
  }-*/;
  
  private static native void  setComments(com.openkm.frontend.client.bean.GWTToken instance, java.util.Collection value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::comments = value;
  }-*/;
  
  private static native java.util.Date getEnd(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::end;
  }-*/;
  
  private static native void  setEnd(com.openkm.frontend.client.bean.GWTToken instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::end = value;
  }-*/;
  
  private static native double getId(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::id;
  }-*/;
  
  private static native void  setId(com.openkm.frontend.client.bean.GWTToken instance, double value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTToken instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::name = value;
  }-*/;
  
  private static native java.lang.String getNode(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::node;
  }-*/;
  
  private static native void  setNode(com.openkm.frontend.client.bean.GWTToken instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::node = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTToken getParent(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::parent;
  }-*/;
  
  private static native void  setParent(com.openkm.frontend.client.bean.GWTToken instance, com.openkm.frontend.client.bean.GWTToken value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::parent = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTProcessInstance getProcessInstance(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::processInstance;
  }-*/;
  
  private static native void  setProcessInstance(com.openkm.frontend.client.bean.GWTToken instance, com.openkm.frontend.client.bean.GWTProcessInstance value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::processInstance = value;
  }-*/;
  
  private static native java.util.Date getStart(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::start;
  }-*/;
  
  private static native void  setStart(com.openkm.frontend.client.bean.GWTToken instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::start = value;
  }-*/;
  
  private static native boolean getSuspended(com.openkm.frontend.client.bean.GWTToken instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTToken::suspended;
  }-*/;
  
  private static native void  setSuspended(com.openkm.frontend.client.bean.GWTToken instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTToken::suspended = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTToken.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTToken instance) throws SerializationException {
    setAvailableTransitions(instance, (java.util.Collection) streamReader.readObject());
    setComments(instance, (java.util.Collection) streamReader.readObject());
    setEnd(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readDouble());
    setName(instance, streamReader.readString());
    setNode(instance, streamReader.readString());
    setParent(instance, (com.openkm.frontend.client.bean.GWTToken) streamReader.readObject());
    setProcessInstance(instance, (com.openkm.frontend.client.bean.GWTProcessInstance) streamReader.readObject());
    setStart(instance, (java.util.Date) streamReader.readObject());
    setSuspended(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTToken instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTToken();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTToken instance) throws SerializationException {
    streamWriter.writeObject(getAvailableTransitions(instance));
    streamWriter.writeObject(getComments(instance));
    streamWriter.writeObject(getEnd(instance));
    streamWriter.writeDouble(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getNode(instance));
    streamWriter.writeObject(getParent(instance));
    streamWriter.writeObject(getProcessInstance(instance));
    streamWriter.writeObject(getStart(instance));
    streamWriter.writeBoolean(getSuspended(instance));
    
  }
  
}
