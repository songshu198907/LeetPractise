package algorithm.leet_351_365;

import java.util.*;

/**
 * Created by songheng on 8/23/16.
 */
public class Twitter {
    Map<Integer, List<Msg>> tweetsMap;
    Map<Integer, List<Integer>> followersMap;
    int step;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {
        tweetsMap = new HashMap<>();
        followersMap = new HashMap<>();
        step = 0;
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        Msg msg = new Msg(tweetId, userId, step);
        if (!tweetsMap.containsKey(userId))
            tweetsMap.put(userId, new ArrayList<>());
        tweetsMap.get(userId).add(0, msg);
        step++;
        if (followersMap.containsKey(userId)) {
            List<Integer> followers = followersMap.get(userId);
            for (Integer uid : followers) {
                if (!tweetsMap.containsKey(uid))
                    tweetsMap.put(uid, new ArrayList<>());
                tweetsMap.get(uid).add(0, msg);
            }
        }

    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        if (tweetsMap.containsKey(userId)) {
            List<Msg> msg = tweetsMap.get(userId);
            System.out.println("origin: \n");
            System.out.println(msg);
            List<Integer> ids = new ArrayList<>();
            for (int i = 0; i < msg.size() && i < 10; i++)
                ids.add(msg.get(i).val);
            return ids;
        } else return new ArrayList<>();
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        if (followeeId == followerId) return;
        if (!followersMap.containsKey(followeeId)) {
            followersMap.put(followeeId, new ArrayList<>());
        }
        if (followersMap.get(followeeId).contains(followerId)) return;
        followersMap.get(followeeId).add(followerId);
        if (tweetsMap.containsKey(followeeId)) {
            if (!tweetsMap.containsKey(followerId))
                tweetsMap.put(followerId, new ArrayList<>());
            List<Msg> followerMsgs = tweetsMap.get(followerId);
//            followerMsgs.addAll(tweetsMap.get(followeeId));
            tweetsMap.get(followeeId).forEach(msg -> {
                if (!followerMsgs.contains(msg) && msg.userId == followeeId) {
                    followerMsgs.add(msg);
                }
            });
            Collections.sort(followerMsgs, (o1, o2) -> o2.step - o1.step);
        }
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        if (!followersMap.containsKey(followeeId) || !followersMap.get(followeeId).contains(followerId))
            return;
        List<Integer> followers = followersMap.get(followeeId);
        followers.remove(followers.indexOf(followerId));
        if (tweetsMap.containsKey(followerId)) {
            List<Msg> msgs = tweetsMap.get(followerId);
            msgs.removeIf(msg -> msg.userId == followeeId);
        }
    }

    class Msg {
        int val;
        int userId;
        int step;

        public Msg(int val, int userId, int step) {
            this.val = val;
            this.step = step;
            this.userId = userId;
        }

        public Msg() {
            this(0, 0, 0);
        }

        @Override
        public String toString() {
            return "[" + step + "#" + val + "]";
        }
    }
}
