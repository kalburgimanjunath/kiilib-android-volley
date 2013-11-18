package jp.fkmsoft.libs.kiilib;

import java.util.List;

/**
 * Provides group API. To get this instance, Please call {@link KiiAPI#groupAPI()}
 * @author fkm
 *
 */
public interface KiiGroupAPI {
    public interface ListCallback extends KiiCallback {
        void onSuccess(List<KiiGroup> result);
    }
    void getOwnedGroup(KiiUser user, ListCallback callback);
    
    void getJoinedGroup(KiiUser user, ListCallback callback);
    
    public interface GroupCallback extends KiiCallback {
        void onSuccess(KiiGroup group);
    }
    
    void create(String groupName, KiiUser owner, List<KiiUser> memberList, GroupCallback callback);
    
    public interface MemberCallback extends KiiCallback {
        void onSuccess(List<KiiUser> memberList);
    }
    
    void getMembers(KiiGroup group, MemberCallback callback);
    
    public interface AddCallback extends KiiCallback {
        void onSuccess(KiiUser user);
    }
    
    void addMember(KiiGroup group, KiiUser user, AddCallback callback);
    
    void changeName(KiiGroup group, String name, GroupCallback callback);
}
