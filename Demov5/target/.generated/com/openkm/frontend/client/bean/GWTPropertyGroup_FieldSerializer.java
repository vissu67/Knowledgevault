package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTPropertyGroup_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTPropertyGroup_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTPropertyGroup)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTPropertyGroup_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTPropertyGroup_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTPropertyGroup)object);
    }
  }
  private static native java.lang.String getLabel(com.openkm.frontend.client.bean.GWTPropertyGroup instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPropertyGroup::label;
  }-*/;
  
  private static native void  setLabel(com.openkm.frontend.client.bean.GWTPropertyGroup instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTPropertyGroup::label = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTPropertyGroup instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPropertyGroup::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTPropertyGroup instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTPropertyGroup::name = value;
  }-*/;
  
  private static native boolean getReadonly(com.openkm.frontend.client.bean.GWTPropertyGroup instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPropertyGroup::readonly;
  }-*/;
  
  private static native void  setReadonly(com.openkm.frontend.client.bean.GWTPropertyGroup instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTPropertyGroup::readonly = value;
  }-*/;
  
  private static native boolean getVisible(com.openkm.frontend.client.bean.GWTPropertyGroup instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPropertyGroup::visible;
  }-*/;
  
  private static native void  setVisible(com.openkm.frontend.client.bean.GWTPropertyGroup instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTPropertyGroup::visible = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTPropertyGroup.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTPropertyGroup instance) throws SerializationException {
    setLabel(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setReadonly(instance, streamReader.readBoolean());
    setVisible(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTPropertyGroup instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTPropertyGroup();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTPropertyGroup instance) throws SerializationException {
    streamWriter.writeString(getLabel(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeBoolean(getReadonly(instance));
    streamWriter.writeBoolean(getVisible(instance));
    
  }
  
}
