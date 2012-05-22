package com.allen_sauer.gwt.log.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ClientStackTraceElement_Array_Rank_1_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.allen_sauer.gwt.log.client.ClientStackTraceElement_Array_Rank_1_FieldSerializer.deserialize(reader, (com.allen_sauer.gwt.log.client.ClientStackTraceElement[])object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.allen_sauer.gwt.log.client.ClientStackTraceElement_Array_Rank_1_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.allen_sauer.gwt.log.client.ClientStackTraceElement_Array_Rank_1_FieldSerializer.serialize(writer, (com.allen_sauer.gwt.log.client.ClientStackTraceElement[])object);
    }
  }
  public static Class<?> concreteType() {
    return com.allen_sauer.gwt.log.client.ClientStackTraceElement[].class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.allen_sauer.gwt.log.client.ClientStackTraceElement[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.allen_sauer.gwt.log.client.ClientStackTraceElement[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.allen_sauer.gwt.log.client.ClientStackTraceElement[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.allen_sauer.gwt.log.client.ClientStackTraceElement[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
}
