package com.londonappbrewery.destini;

/**
 * Created by talsl on 19/03/2018.
 */

class StorySegment {

    private int mStoryText;
    private int mTopButtonText;
    private int mBottomButtonText;
    private int mTopButtonTarget;
    private int mBottomButtonTarget;

    public StorySegment (int storyText, int topButotnText, int bottomButtonText, int topButtonTarget, int bottomButtonTarget) {
        mStoryText = storyText;
        mTopButtonText = topButotnText;
        mBottomButtonText = bottomButtonText;
        mTopButtonTarget = topButtonTarget;
        mBottomButtonTarget = bottomButtonTarget;
    }


    //-- Getter and Setters!

    public int getStoryText() {
        return mStoryText;
    }

    public void setStoryText(int storyText) {
        mStoryText = storyText;
    }

    public int getTopButtonText() {
        return mTopButtonText;
    }

    public void setTopButtonText(int topButtonText) {
        mTopButtonText = topButtonText;
    }

    public int getBottomButtonText() {
        return mBottomButtonText;
    }

    public void setBottomButtonText(int bottomButtonText) {
        mBottomButtonText = bottomButtonText;
    }

    public int getTopButtonTarget() {
        return mTopButtonTarget;
    }

    public void setTopButtonTarget(int topButtonTarget) {
        mTopButtonTarget = topButtonTarget;
    }

    public int getBottomButtonTarget() {
        return mBottomButtonTarget;
    }

    public void setBottomButtonTarget(int bottomButtonTarget) {
        mBottomButtonTarget = bottomButtonTarget;
    }
}
