package com.example.bruna.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button  botaoNovaFrase;

    private String[] frases = {
            "Vencedor não é aquele que sempre vence, mas sim aquele que nunca para de lutar.",
            "Não tenha medo da mudança. Coisas  boas se vão para que melhores possam vir.",
            "Não chore porque acabou, sorria porque aconteceu.",
            "Nunca diga eu não consigo. Você consegue sim, basta ter força de vontade e fé.",
            "Tudo é possível. O impossível apenas demora mais...",
            "No fim tudo dá certo, e se não deu certo é porque ainda não chegou ao fim.",
            "Esquece, levanta a cabeça. Segue em frente. Amanhã é um novo dia.",
            "Não é com desculpas que irá atingir os seus objetivos!",
            "Jamais desista de ser feliz."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        //textoNovaFrase.setText(frases [0]);
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases [numeroAleatorio]);
            }
        });
    }
}
