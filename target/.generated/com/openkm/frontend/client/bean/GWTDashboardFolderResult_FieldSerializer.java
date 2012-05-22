package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTDashboardFolderResult_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTDashboardFolderResult_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTDashboardFolderResult)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTDashboardFolderResult_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTDashboardFolderResult_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTDashboardFolderResult)object);
    }
  }
  private static native java.util.Date getDate(com.openkm.frontend.client.bean.GWTDashboardFolderResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardFolderResult::date;
  }-*/;
  
  private static native void  setDate(com.openkm.frontend.client.bean.GWTDashboardFolderResult instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardFolderResult::date = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTFolder getFolder(com.openkm.frontend.client.bean.GWTDashboardFolderResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardFolderResult::folder;
  }-*/;
  
  private static native void  setFolder(com.openkm.frontend.client.bean.GWTDashboardFolderResult instance, com.openkm.frontend.client.bean.GWTFolder value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardFolderResult::folder = value;
  }-*/;
  
  private static native boolean getVisited(com.openkm.frontend.client.bean.GWTDashboardFolderResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardFolderResult::visited;
  }-*/;
  
  private static native void  setVisited(com.openkm.frontend.client.bean.GWTDashboardFolderResult instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardFolderResult::visited = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTDashboardFolderResult.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTDashboardFolderResult instance) throws SerializationException {
    setDate(instance, (java.util.Date) streamReader.readObject());
    setFolder(instance, (com.openkm.frontend.client.bean.GWTFolder) streamReader.readObject());
    setVisited(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTDashboardFolderResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTDashboardFolderResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTDashboardFolderResult instance) throws SerializationException {
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeObject(getFolder(instance));
    streamWriter.writeBoolean(getVisited(instance));
    
  }
  
}
