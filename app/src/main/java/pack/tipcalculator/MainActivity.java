package pack.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValue;
    private TextView textViewPercent;
    private EditText editTextTip;
    private EditText editTextTotal;
    private SeekBar seekBarTip;

    private double percentage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValue = findViewById(R.id.editTextValue);
        textViewPercent = findViewById(R.id.textViewPercent);
        editTextTip = findViewById(R.id.editTextNumberTip);
        editTextTotal = findViewById(R.id.editTextTotal);
        seekBarTip = findViewById(R.id.seekBar);

        seekBarTip.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                percentage = progress;
                textViewPercent.setText(percentage + " %");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}