package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTSeparator_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTSeparator)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTSeparator)object);
    }
  }
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTSeparator.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTSeparator instance) throws SerializationException {
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTSeparator instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTSeparator();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTSeparator instance) throws SerializationException {
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
