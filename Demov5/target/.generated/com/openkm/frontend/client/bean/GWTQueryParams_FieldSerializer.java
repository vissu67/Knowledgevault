package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTQueryParams_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTQueryParams_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTQueryParams)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTQueryParams_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTQueryParams_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTQueryParams)object);
    }
  }
  private static native java.lang.String getAuthor(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::author;
  }-*/;
  
  private static native void  setAuthor(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::author = value;
  }-*/;
  
  private static native java.lang.String getCategoryPath(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::categoryPath;
  }-*/;
  
  private static native void  setCategoryPath(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::categoryPath = value;
  }-*/;
  
  private static native java.lang.String getCategoryUuid(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::categoryUuid;
  }-*/;
  
  private static native void  setCategoryUuid(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::categoryUuid = value;
  }-*/;
  
  private static native java.lang.String getContent(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::content;
  }-*/;
  
  private static native void  setContent(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::content = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getDomain(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::domain;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setDomain(com.openkm.frontend.client.bean.GWTQueryParams instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::domain = value;
  }-*/;
  
  private static native java.lang.String getGrpName(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::grpName;
  }-*/;
  
  private static native void  setGrpName(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::grpName = value;
  }-*/;
  
  private static native int getId(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::id;
  }-*/;
  
  private static native void  setId(com.openkm.frontend.client.bean.GWTQueryParams instance, int value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::id = value;
  }-*/;
  
  private static native boolean getIsDashboard(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::isDashboard;
  }-*/;
  
  private static native void  setIsDashboard(com.openkm.frontend.client.bean.GWTQueryParams instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::isDashboard = value;
  }-*/;
  
  private static native boolean getIsShared(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::isShared;
  }-*/;
  
  private static native void  setIsShared(com.openkm.frontend.client.bean.GWTQueryParams instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::isShared = value;
  }-*/;
  
  private static native java.lang.String getKeywords(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::keywords;
  }-*/;
  
  private static native void  setKeywords(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::keywords = value;
  }-*/;
  
  private static native java.util.Date getLastModifiedFrom(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::lastModifiedFrom;
  }-*/;
  
  private static native void  setLastModifiedFrom(com.openkm.frontend.client.bean.GWTQueryParams instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::lastModifiedFrom = value;
  }-*/;
  
  private static native java.util.Date getLastModifiedTo(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::lastModifiedTo;
  }-*/;
  
  private static native void  setLastModifiedTo(com.openkm.frontend.client.bean.GWTQueryParams instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::lastModifiedTo = value;
  }-*/;
  
  private static native java.lang.String getMailFrom(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::mailFrom;
  }-*/;
  
  private static native void  setMailFrom(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::mailFrom = value;
  }-*/;
  
  private static native java.lang.String getMailSubject(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::mailSubject;
  }-*/;
  
  private static native void  setMailSubject(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::mailSubject = value;
  }-*/;
  
  private static native java.lang.String getMailTo(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::mailTo;
  }-*/;
  
  private static native void  setMailTo(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::mailTo = value;
  }-*/;
  
  private static native java.lang.String getMimeType(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::mimeType;
  }-*/;
  
  private static native void  setMimeType(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::mimeType = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::name = value;
  }-*/;
  
  private static native java.lang.String getOperator(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::operator;
  }-*/;
  
  private static native void  setOperator(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::operator = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::path;
  }-*/;
  
  private static native void  setPath(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::path = value;
  }-*/;
  
  private static native java.util.Map getProperties(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::properties;
  }-*/;
  
  private static native void  setProperties(com.openkm.frontend.client.bean.GWTQueryParams instance, java.util.Map value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::properties = value;
  }-*/;
  
  private static native java.lang.String getQueryName(com.openkm.frontend.client.bean.GWTQueryParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryParams::queryName;
  }-*/;
  
  private static native void  setQueryName(com.openkm.frontend.client.bean.GWTQueryParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryParams::queryName = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTQueryParams.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTQueryParams instance) throws SerializationException {
    setAuthor(instance, streamReader.readString());
    setCategoryPath(instance, streamReader.readString());
    setCategoryUuid(instance, streamReader.readString());
    setContent(instance, streamReader.readString());
    setDomain(instance, streamReader.readLong());
    setGrpName(instance, streamReader.readString());
    setId(instance, streamReader.readInt());
    setIsDashboard(instance, streamReader.readBoolean());
    setIsShared(instance, streamReader.readBoolean());
    setKeywords(instance, streamReader.readString());
    setLastModifiedFrom(instance, (java.util.Date) streamReader.readObject());
    setLastModifiedTo(instance, (java.util.Date) streamReader.readObject());
    setMailFrom(instance, streamReader.readString());
    setMailSubject(instance, streamReader.readString());
    setMailTo(instance, streamReader.readString());
    setMimeType(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setOperator(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setProperties(instance, (java.util.Map) streamReader.readObject());
    setQueryName(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTQueryParams instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTQueryParams();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTQueryParams instance) throws SerializationException {
    streamWriter.writeString(getAuthor(instance));
    streamWriter.writeString(getCategoryPath(instance));
    streamWriter.writeString(getCategoryUuid(instance));
    streamWriter.writeString(getContent(instance));
    streamWriter.writeLong(getDomain(instance));
    streamWriter.writeString(getGrpName(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeBoolean(getIsDashboard(instance));
    streamWriter.writeBoolean(getIsShared(instance));
    streamWriter.writeString(getKeywords(instance));
    streamWriter.writeObject(getLastModifiedFrom(instance));
    streamWriter.writeObject(getLastModifiedTo(instance));
    streamWriter.writeString(getMailFrom(instance));
    streamWriter.writeString(getMailSubject(instance));
    streamWriter.writeString(getMailTo(instance));
    streamWriter.writeString(getMimeType(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getOperator(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeObject(getProperties(instance));
    streamWriter.writeString(getQueryName(instance));
    
  }
  
}
