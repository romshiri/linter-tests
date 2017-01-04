package com.example;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;

import java.util.ArrayList;
import java.util.List;

public class MyIssueRegistry extends IssueRegistry {

  @Override
  public List<Issue> getIssues() {
    return new ArrayList<Issue>() {{
      add(MyAnnotationDetector.CAREFUL_NOW_ISSUE);
      add(LoggerUsageDetector.ISSUE);
    }};
  }

}