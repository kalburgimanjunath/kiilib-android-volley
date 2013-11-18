package jp.fkmsoft.libs.kiilib;

import java.util.List;

/**
 * Provides topic API.
 * @author fkm
 *
 */
public interface KiiTopicAPI {
    public interface TopicCallback extends KiiCallback {
        void onSuccess(KiiTopic topic);
    }
    void create(BucketOwnable owner, String name, TopicCallback callback);
    
    void subscribe(KiiTopic topic, TopicCallback callback);
    
    public interface SendMessageCallback extends KiiCallback {
        void onSuccess(String pushMessageId);
    }
    
    void sendMessage(KiiTopic topic, KiiTopicMessage message, SendMessageCallback callback);
    
    public interface TopicListCallback extends KiiCallback {
        void onSuccess(List<KiiTopic> list);
    }
    
    void getList(BucketOwnable owner, TopicListCallback callback);
}
