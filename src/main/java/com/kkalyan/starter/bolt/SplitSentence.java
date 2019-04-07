package com.kkalyan.starter.bolt;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

/**
 *
 *
 */
public class SplitSentence extends BaseBasicBolt {

    public SplitSentence() {
        
    }

    @Override
    public void execute(Tuple tuple, BasicOutputCollector collector) {
        String line = tuple.getString(0);
        String[] words = line.split(" ");
        for(String word:words){
            collector.emit(new Values(word));
        }
    }

      @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("word"));
    }
}
