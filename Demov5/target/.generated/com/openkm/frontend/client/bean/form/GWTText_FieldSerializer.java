package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTText_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTText_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTText)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTText_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTText_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTText)object);
    }
  }
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTText instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTText::data;
  }-*/;
  
  private static native void  setData(com.openkm.frontend.client.bean.form.GWTText instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTText::data = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTText.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTText instance) throws SerializationException {
    setData(instance, streamReader.readString());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTText instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTText();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTText instance) throws SerializationException {
    streamWriter.writeString(getData(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
