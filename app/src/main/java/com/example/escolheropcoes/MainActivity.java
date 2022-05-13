package com.example.escolheropcoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double vmm,vjujuba,vgranulado,vcalda,vtotal;
    EditText etmm,etjujuba,etgranulado,etcalda;
    CheckBox cbmm,cbjujuba,cbgranulado,cbcalda;
    Button btncalcular;
    TextView tvresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etmm=findViewById(R.id.etmm);
        etjujuba=findViewById(R.id.etjujuba);
        etgranulado=findViewById(R.id.etgranulado);
        etcalda=findViewById((R.id.etcalda));

        cbmm=findViewById(R.id.cbmm);
        cbjujuba=findViewById(R.id.cbjujuba);
        cbgranulado=findViewById(R.id.cbgranulado);
        cbcalda=findViewById(R.id.cbcalda);

        vmm=1.5;
        vjujuba=2.0;
        vgranulado=1.0;
        vcalda=1.5;
        vtotal=0.0;

        btncalcular=findViewById(R.id.btncalcular);
        tvresultado=findViewById(R.id.tvresultado);

        cbmm.setText(cbmm.getText().toString()+vmm);
        cbjujuba.setText(cbjujuba.getText().toString()+vjujuba);
        cbgranulado.setText(cbgranulado.getText().toString()+vgranulado);
        cbcalda.setText(cbcalda.getText().toString()+vcalda);








    }
        public void Calcular(View v){
        vtotal=0.0;
            if(cbmm.isChecked()){
                vtotal+=vmm*Double.parseDouble(etmm.getText().toString());
            }
            if(cbjujuba.isChecked()){
                vtotal+=vjujuba*Double.parseDouble(etjujuba.getText().toString());
            }
            if(cbgranulado.isChecked()){
                vtotal+=vgranulado*Double.parseDouble(etgranulado.getText().toString());
            }
            if(cbcalda.isChecked()){
                vtotal+=vcalda*Double.parseDouble(etcalda.getText().toString());
            }
            tvresultado.setText("Valor total: "+vtotal);
        }


}