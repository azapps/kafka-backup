package de.azapps.kafkabackup.sink;

import de.azapps.kafkabackup.common.offset.EndOffsetReader;
import org.apache.kafka.common.TopicPartition;

import java.util.Collection;
import java.util.Map;

public class MockEndOffsetReader extends EndOffsetReader {
  private Map<TopicPartition, Long> offsets;
  public MockEndOffsetReader(String bootstrapServers, Map<TopicPartition, Long> offsets) {
    super(bootstrapServers);
    this.offsets = offsets;
  }
  @Override
  public Map<TopicPartition, Long> getEndOffsets(Collection<TopicPartition> partitions) {
    return offsets;
  }
}
