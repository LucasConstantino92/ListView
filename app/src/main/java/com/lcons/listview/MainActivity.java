package com.lcons.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Aguai", "Campinas", "Caraguatatuba", "Aparecida do Norte", "São João da Boa Vista",
            "Casa Branca", "Mococa", "Pirassununga", "Valinhos", "Paulínia", "Ubatuba",
            "São Paulo", "Aguas da Prata", "Leme", "Limeira", "Araras", "Pedreira",
            "Jaguariuna", "Mogi-Guaçu", "Campestre", "Poços de Caldas", "Caconde"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Criar adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(), //contexto
                android.R.layout.simple_list_item_1, //layout
                android.R.id.text1, //id dos itens no layout
                itens //itens
        );

        //Adiciona adaptador na lista
        listLocais.setAdapter(adapter);

        //Adicionar Clique
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listLocais.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,
                        valorSelecionado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}