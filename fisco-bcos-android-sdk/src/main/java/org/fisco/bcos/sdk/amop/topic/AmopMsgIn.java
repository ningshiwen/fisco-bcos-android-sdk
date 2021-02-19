package org.fisco.bcos.sdk.amop.topic;

import io.netty.channel.ChannelHandlerContext;
import org.fisco.bcos.sdk.log.Logger;
import org.fisco.bcos.sdk.log.LoggerFactory;

public class AmopMsgIn {
    private static Logger logger = LoggerFactory.getLogger(AmopMsgIn.class);
    private String messageID;
    private byte[] content;
    private String topic;
    private Integer result;
    protected Short type = 0;
    private TopicType topicType = TopicType.NORMAL_TOPIC;
    private ChannelHandlerContext ctx;

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ChannelHandlerContext getCtx() {
        return ctx;
    }

    public void setCtx(ChannelHandlerContext ctx) {
        this.ctx = ctx;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public TopicType getTopicType() {
        return topicType;
    }

    public void setTopicType(TopicType topicType) {
        this.topicType = topicType;
    }
}
