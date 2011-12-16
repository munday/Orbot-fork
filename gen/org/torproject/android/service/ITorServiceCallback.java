/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/matt/Documents/workspace/orbot/src/org/torproject/android/service/ITorServiceCallback.aidl
 */
package org.torproject.android.service;
/**
 * Callback interface used to send
 * synchronous notifications back to its clients.  Note that this is a
 * one-way interface so the server does not block waiting for the client.
 */
public interface ITorServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.torproject.android.service.ITorServiceCallback
{
private static final java.lang.String DESCRIPTOR = "org.torproject.android.service.ITorServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.torproject.android.service.ITorServiceCallback interface,
 * generating a proxy if needed.
 */
public static org.torproject.android.service.ITorServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.torproject.android.service.ITorServiceCallback))) {
return ((org.torproject.android.service.ITorServiceCallback)iin);
}
return new org.torproject.android.service.ITorServiceCallback.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_statusChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.statusChanged(_arg0);
return true;
}
case TRANSACTION_logMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.logMessage(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.torproject.android.service.ITorServiceCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Called when the service has a something to display to the user
     */
public void statusChanged(java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_statusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the service has something to add to the log
     */
public void logMessage(java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_logMessage, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_statusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_logMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Called when the service has a something to display to the user
     */
public void statusChanged(java.lang.String value) throws android.os.RemoteException;
/**
     * Called when the service has something to add to the log
     */
public void logMessage(java.lang.String value) throws android.os.RemoteException;
}
