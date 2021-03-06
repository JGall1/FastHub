package com.fastaccess.provider.rest;

import android.support.annotation.NonNull;

import com.fastaccess.data.dao.types.IssueState;

/**
 * Created by Kosh on 23 Mar 2017, 7:26 PM
 */

public class RepoQueryProvider {
    @NonNull public static String getIssuesPullRequerQuery(@NonNull String owner, @NonNull String repo,
                                                           @NonNull IssueState issueState, boolean isPr) {
        return "+" + "type:" + (isPr ? "pr" : "issue") +
                "+" + "repo:" + owner + "/" +
                repo + "+" + "is:" + issueState.name();
    }
}
