package io.github.maanaim.hbaseom.converter.strategy;

import io.github.maanaim.hbaseom.mapper.HBaseConversor;
import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public class IntegerConversor implements IConversor {

  @Override
  public Object convert(byte[] value, HBaseFormat format) {
    return HBaseConversor.convertBytesToInt(value);
  }

}
