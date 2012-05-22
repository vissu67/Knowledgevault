package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTButton_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTButton)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTButton)object);
    }
  }
  private static native java.lang.String getConfirmation(com.openkm.frontend.client.bean.form.GWTButton instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTButton::confirmation;
  }-*/;
  
  private static native void  setConfirmation(com.openkm.frontend.client.bean.form.GWTButton instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTButton::confirmation = value;
  }-*/;
  
  private static native java.lang.String getTransition(com.openkm.frontend.client.bean.form.GWTButton instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTButton::transition;
  }-*/;
  
  private static native void  setTransition(com.openkm.frontend.client.bean.form.GWTButton instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTButton::transition = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTButton.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTButton instance) throws SerializationException {
    setConfirmation(instance, streamReader.readString());
    setTransition(instance, streamReader.readString());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTButton instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTButton();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTButton instance) throws SerializationException {
    streamWriter.writeString(getConfirmation(instance));
    streamWriter.writeString(getTransition(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
