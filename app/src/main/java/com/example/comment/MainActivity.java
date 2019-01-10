package com.example.comment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements CommentDataFactory{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public Map createCommentStructure(List list) {
        
        return null;
    }
}
