package bwei.admin.wurui20170807;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mLeft;
    private TextView mRight;
    private TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点击了返回",Toast.LENGTH_SHORT).show();
            }
        });
        mRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点击了更多",Toast.LENGTH_SHORT).show();
            }
        });
        mTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点击了标题",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init() {
        mLeft = (TextView) findViewById(R.id.left_text);
        mRight = (TextView) findViewById(R.id.right_text);
        mTitle = (TextView) findViewById(R.id.title);
    }
}
