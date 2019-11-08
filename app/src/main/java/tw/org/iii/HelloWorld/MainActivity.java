package tw.org.iii.HelloWorld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView = new TextView( context: this);
        //以下內容在setContentView之後,邏輯才對
        textView = findViewById(R.id.lottery);
        buttonClick = findViewById(R.id.click);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("brad","OK");
                showLottery();
            }
        });

        //委託誰來聽
        //set:只有一個觸發事件; add 可以多個; Listener:有聽才會到
    }

    private  void  showLottery(){
        //textView.setText("Hello, Brad");
        //int temp = (int)(Math.random()*49+1);
        //textView.setText("" + temp);
        //think no repeated num, use "set" st not repeat

        //HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set = new TreeSet<>(); //物件可以放東西,並自動做排序
        while( set.size() < 6){ //只要跑出6個相異整數即可,抽出相異數字跑幾次no care
            set.add((int)(Math.random()*49+1));
        }
        textView.setText(set.toString());
    }
}
