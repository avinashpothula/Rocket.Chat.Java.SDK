package io.rocketchat.livechat.callback;

import io.rocketchat.livechat.model.MessageObject;

import java.util.ArrayList;

/**
 * Created by sachin on 9/6/17.
 */

/**
 * Used to get messages available in the history
 */

public interface LoadHistoryListener extends Listener {
    void onLoadHistory(ArrayList <MessageObject> list, int unreadNotLoaded);
}
