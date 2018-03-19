package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton, mBottomButton;
    private StorySegment[] storyDataBank = new StorySegment[] {
            new StorySegment( R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 2, 1 ),
            new StorySegment( R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 2, 3 ),
            new StorySegment( R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 5, 4 ),
            new StorySegment( R.string.T4_End, -1, -1, 0, 0 ),
            new StorySegment( R.string.T5_End, -1, -1, 0, 0 ),
            new StorySegment( R.string.T6_End, -1, -1, 0, 0 ) };
    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = storyDataBank[mStoryIndex].getTopButtonTarget();
                updateStory();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = storyDataBank[mStoryIndex].getBottomButtonTarget();
                updateStory();
            }
        });

    }

    private void updateStory() {
        mStoryTextView.setText(storyDataBank[mStoryIndex].getStoryText());
        if(storyDataBank[mStoryIndex].getTopButtonText() == -1 || storyDataBank[mStoryIndex].getBottomButtonText() == -1) {
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        } else {
            mTopButton.setText(storyDataBank[mStoryIndex].getTopButtonText());
            mBottomButton.setText(storyDataBank[mStoryIndex].getBottomButtonText());
        }
    }
}
