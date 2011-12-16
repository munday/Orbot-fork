/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/matt/Documents/workspace/orbot/src/org/torproject/android/service/ITorService.aidl
 */
package org.torproject.android.service;
/**
 * an interface for calling on to a remote service
 */
public interface ITorService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.torproject.android.service.ITorService
{
private static final java.lang.String DESCRIPTOR = "org.torproject.android.service.ITorService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.torproject.android.service.ITorService interface,
 * generating a proxy if needed.
 */
public static org.torproject.android.service.ITorService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.torproject.android.service.ITorService))) {
return ((org.torproject.android.service.ITorService)iin);
}
return new org.torproject.android.service.ITorService.Stub.Proxy(obj);
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
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
org.torproject.android.service.ITorServiceCallback _arg0;
_arg0 = org.torproject.android.service.ITorServiceCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
org.torproject.android.service.ITorServiceCallback _arg0;
_arg0 = org.torproject.android.service.ITorServiceCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setProfile:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setProfile(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_updateConfiguration:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _result = this.updateConfiguration(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_processSettings:
{
data.enforceInterface(DESCRIPTOR);
this.processSettings();
reply.writeNoException();
return true;
}
case TRANSACTION_saveConfiguration:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.saveConfiguration();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getConfiguration:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getConfiguration(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.torproject.android.service.ITorService
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
     * This allows Tor service to send messages back to the GUI
     */
public void registerCallback(org.torproject.android.service.ITorServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Remove registered callback interface.
     */
public void unregisterCallback(org.torproject.android.service.ITorServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Get a simple int status value for the state of Tor
    */
public int getStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    * The profile value is the start/stop state for Tor
    */
public void setProfile(int profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
mRemote.transact(Stub.TRANSACTION_setProfile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Set configuration
    */
public boolean updateConfiguration(java.lang.String name, java.lang.String value, boolean saveToDisk) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeString(value);
_data.writeInt(((saveToDisk)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_updateConfiguration, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    * Set configuration
    */
public void processSettings() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_processSettings, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * Set configuration
    */
public boolean saveConfiguration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_saveConfiguration, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
    * Get current configuration value from torrc
    */
public java.lang.String getConfiguration(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_getConfiguration, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_updateConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_processSettings = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_saveConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getConfiguration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
/**
     * This allows Tor service to send messages back to the GUI
     */
public void registerCallback(org.torproject.android.service.ITorServiceCallback cb) throws android.os.RemoteException;
/**
     * Remove registered callback interface.
     */
public void unregisterCallback(org.torproject.android.service.ITorServiceCallback cb) throws android.os.RemoteException;
/**
    * Get a simple int status value for the state of Tor
    */
public int getStatus() throws android.os.RemoteException;
/**
    * The profile value is the start/stop state for Tor
    */
public void setProfile(int profile) throws android.os.RemoteException;
/**
    * Set configuration
    */
public boolean updateConfiguration(java.lang.String name, java.lang.String value, boolean saveToDisk) throws android.os.RemoteException;
/**
    * Set configuration
    */
public void processSettings() throws android.os.RemoteException;
/**
    * Set configuration
    */
public boolean saveConfiguration() throws android.os.RemoteException;
/**
    * Get current configuration value from torrc
    */
public java.lang.String getConfiguration(java.lang.String name) throws android.os.RemoteException;
}
