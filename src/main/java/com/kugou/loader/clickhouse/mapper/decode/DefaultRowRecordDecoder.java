package com.kugou.loader.clickhouse.mapper.decode;

import org.apache.hadoop.conf.Configuration;


/**
 * Created by jaykelin on 2017/4/5.【包装类，内含RecordDecoderConfigurable实例】
 */
public class DefaultRowRecordDecoder<K, V> extends RowRecordDecoderConfigurable<K, V> {

    public DefaultRowRecordDecoder(Configuration configuration, RecordDecoderConfigurable recordDecoder) {
        super(configuration, recordDecoder);
    }


}
