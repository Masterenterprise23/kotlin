// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrSymbolTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbolTable)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbolData symbols = 1;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbolData> 
      getSymbolsList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbolData symbols = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbolData getSymbols(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbolData symbols = 1;</code>
   */
  int getSymbolsCount();
}