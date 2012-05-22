package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTPropertyGroup_Array_Rank_1_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTPropertyGroup_Array_Rank_1_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTPropertyGroup[])object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTPropertyGroup_Array_Rank_1_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTPropertyGroup_Array_Rank_1_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTPropertyGroup[])object);
    }
  }
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTPropertyGroup[].class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTPropertyGroup[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.GWTPropertyGroup[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.openkm.frontend.client.bean.GWTPropertyGroup[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTPropertyGroup[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
}
