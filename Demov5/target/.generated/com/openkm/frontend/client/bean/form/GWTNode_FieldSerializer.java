package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTNode_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTNode)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTNode)object);
    }
  }
  private static native java.lang.String getLabel(com.openkm.frontend.client.bean.form.GWTNode instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTNode::label;
  }-*/;
  
  private static native void  setLabel(com.openkm.frontend.client.bean.form.GWTNode instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTNode::label = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.form.GWTNode instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTNode::path;
  }-*/;
  
  private static native void  setPath(com.openkm.frontend.client.bean.form.GWTNode instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTNode::path = value;
  }-*/;
  
  private static native java.lang.String getUuid(com.openkm.frontend.client.bean.form.GWTNode instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTNode::uuid;
  }-*/;
  
  private static native void  setUuid(com.openkm.frontend.client.bean.form.GWTNode instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTNode::uuid = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTNode.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTNode instance) throws SerializationException {
    setLabel(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setUuid(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.form.GWTNode instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTNode();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTNode instance) throws SerializationException {
    streamWriter.writeString(getLabel(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeString(getUuid(instance));
    
  }
  
}
