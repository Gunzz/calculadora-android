package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView tvOperacoes;  // mostra os valores selecionados pelo usuario
    TextView tvResultado;  // mostra os valores já calculados
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    Button btnC, btnPonto, btnIgual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultados);
        tvOperacoes = findViewById(R.id.tvOperacoes);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnIgual = findViewById(R.id.btnIgual);
        btnC = findViewById(R.id.btnC);
        btnPonto = findViewById(R.id.btnPonto);
    }


    // ========== métodos ==========

    float num1 = 0;
    float num2 = 0;
    String sinal = "";
    float total = 0;
    boolean ponto = false;

    public void mtd0(View view){ // adiciona o numero 0 na "tvOperacoes"

        // se o usuario clicar no "btn0" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 0
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "0");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "0"); // apenas recebe o valor 0
        }
    }


    public void mtd1(View view){ // adiciona o numero 1 na "tvOperacoes"

        // se o usuario clicar no "btn1" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 1
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "1");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "1"); // apenas recebe o valor 1
        }
    }


    public void mtd2(View view){ // adiciona o numero 2 na "tvOperacoes"

        // se o usuario clicar no "btn2" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 2
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "2");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "2"); // apenas recebe o valor 2
        }
    }


    public void mtd3(View view){ // adiciona  numero 3 na "tvOperacoes"

        // se o usuario clicar no "btn3" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 3
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "3");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "3"); // apenas recebe o valor 3
        }
    }


    public void mtd4(View view){ // adiciona o numero 4 na "tvOperacoes"

        // se o usuario clicar no "btn4" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 4
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "4");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "4"); // apenas recebe o valor 4
        }
    }


    public void mtd5(View view){ // adiciona o numero 5 na "tvOperacoes"

        // se o usuario clicar no "btn5" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 5
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "5");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "5"); // apenas recebe o valor 5
        }
    }


    public void mtd6(View view){ // adiciona o numero 6 na "tvOperacoes"

        // se o usuario clicar no "btn6" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 6
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "6");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "6"); // apenas recebe o valor 6
        }
    }


    public void mtd7(View view){ // adiciona o numero 7 na "tvOperacoes"

        // se o usuario clicar no "btn7" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 7
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "7");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "7"); // apeas recebe o valor 7
        }
    }


    public void mtd8(View view){ // adiciona o numero 8 na "tvOperacoes"

        // se o usuario clicar no "btn8" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 8
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "8");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "8"); // apenas recebe o valor 8
        }
    }


    public void mtd9(View view){ // adiciona o numero 9 na "tvOperacoes"

        // se o usuario clicar no "btn9" após ter clicado no "btnIgual" limpará todos os calculos feitos e "tvOperacoes" recebe 9
        if(tvOperacoes.getText().equals(tvResultado.getText()) ){
            mtdC(view);
            tvOperacoes.setText(tvOperacoes.getText() + "9");
        } else {
            tvOperacoes.setText(tvOperacoes.getText() + "9"); // apenas recebe o valor 9
        }
    }


    public void mtdSomar(View view){ // faz o calculo de somar

        // se clicar no "btnSomar" e não tiver selecionando um numero para o "tvOperacoes", retorna o valor "0"
        // OU
        // se o usuario apenas digitar um "." em tvOperecoes, retorna o valor "0"
        if(tvOperacoes.getText().equals("") || tvOperacoes.getText().equals(".")){
            tvOperacoes.setText(String.valueOf(0));
        }

        num1 = Float.parseFloat(tvOperacoes.getText().toString());

        tvOperacoes.setText(""); // esvazia para as proximas inserções do usuario

        // se "tvResultado" estiver vazio, é necessario add o valor 0
        // OU
        // se o usuario somar após ter clicado no "btnIgual", é necessário add o valor 0
        if(tvResultado.getText().equals("") || sinal.equals("=")){
            num2 = 0;
        } else{
            num2 = Float.parseFloat(tvResultado.getText().toString());
        }

        total = num1 + num2;

        // se o usuario havia feito outra operação, irá finalizar o calculo anterior
        if(sinal.equals("-")){
            total = num2 - num1;
        } else if(sinal.equals("*")){
            total = num1 * num2;
        } else if(sinal.equals("/")){
            if(num1 == 0){
                mtdC(view);
                Toast.makeText(this, "NÃO É POSSIVEL DIVIDIR POR 0", Toast.LENGTH_LONG).show();
            } else {
                total = num2 / num1;
            }
        }

        tvResultado.setText(String.valueOf(total));
        total = 0;
        sinal = "+";
        ponto = false;
    }


    public void mtdSubtrair(View view){  // faz o calculo de subtrair

        // se clicar no "btnSubtrair" e não tiver selecionando um numero para o "tvOperacoes", retorna o valor "0"
        // OU
        // se o usuario apenas digitar um "." em tvOperecoes, retorna o valor "0"
        if(tvOperacoes.getText().equals("") || tvOperacoes.getText().equals(".")){
            tvOperacoes.setText(String.valueOf(0));
        }

        num1 = Float.parseFloat(tvOperacoes.getText().toString());

        tvOperacoes.setText(""); // esvazia para as proximas inserções do usuario

        // se "tvResultado" estiver vazio, é necessario add o valor 0
        // OU
        // se o usuario subtrair após ter clicado no "btnIgual", é necessário add o valor 0
        if(tvResultado.getText().equals("") || sinal.equals("=")){
            num2 = 0;
            total =  num1 - num2;
        } else{
            num2 = Float.parseFloat(tvResultado.getText().toString());
            total =  num2 - num1;
        }

        // se o usuario havia feito outra operação, irá finalizar o calculo anterior
        if(sinal.equals("+")){
            total = num1 + num2;
        } else if(sinal.equals("*")){
            total = num1 * num2;
        } else if(sinal.equals("/")){
            if(num1 == 0){
                mtdC(view);
                Toast.makeText(this, "NÃO É POSSIVEL DIVIDIR POR 0", Toast.LENGTH_LONG).show();
            } else {
                total = num2 / num1;
            }
        }

        tvResultado.setText(String.valueOf(total));
        total = 0;
        sinal = "-";
        ponto = false;
    }


    public void mtdMultiplicar(View view){ // irá fazer o calculo de multiplicar

        // se clicar no "btnMultiplicar" e não tiver selecionando um numero para o "tvOperacoes", retorna o valor "0"
        // OU
        // se o usuario apenas digitar um "." em tvOperecoes, retorna o valor "0"
        if(tvOperacoes.getText().equals("") || tvOperacoes.getText().equals(".")){
            tvOperacoes.setText(String.valueOf(0));
        }

        num1 = Float.parseFloat(tvOperacoes.getText().toString());

        tvOperacoes.setText(""); // esvazia para as proximas inserções do usuario

        // se "tvResultado" estiver vazio, é necessario add o valor 1
        // OU
        // se o usuario multiplicar após ter clicado no "btnIgual", é necessário add o valor 1
        if(tvResultado.getText().equals("") || sinal.equals("=")){
            num2 = 1;
        } else{
            num2 = Float.parseFloat(tvResultado.getText().toString());
        }

        total = num1 * num2;

        // se o usuario havia feito outra operação, irá finalizar o calculo anterior
        if(sinal.equals("+")){
            total = num1 + num2;
        } else if(sinal.equals("-")){
            total = num2 - num1;
        } else if(sinal.equals("/")){
            if(num1 == 0){
                mtdC(view);
                Toast.makeText(this, "NÃO É POSSIVEL DIVIDIR POR 0", Toast.LENGTH_LONG).show();
            } else {
                total = num2 / num1;
            }
        }

        tvResultado.setText(String.valueOf(total));
        total = 0;
        sinal = "*";
        ponto = false;
    }


    public void mtdDividir(View view){  // faz o calculo de divisão

        // se clicar no "btnDividir" e não tiver selecionando um numero para o "tvOperacoes", retorn o valor "0"
        // OU
        // se o usuario apenas digitar um "." em tvOperecoes, retorna o valor "0"

        if(tvOperacoes.getText().equals("") || tvOperacoes.getText().equals(".")){
            tvOperacoes.setText(String.valueOf(0));
        }

        num1 = Float.parseFloat(tvOperacoes.getText().toString());

        tvOperacoes.setText(""); // esvazia para as proximas inserções do usuario


        // se "tvResultado" estiver vazio, é necessario add o valor 1
        // OU
        // se o usuario dividir após ter clicado no "btnIgual", é necessário add o valor 1
        if(tvResultado.getText().equals("") || sinal.equals("=")){
            num2 = 1;
            total =  num1 / num2;
        } else {
            num2 = Float.parseFloat(tvResultado.getText().toString());

            // verifica se o usuario digitou 0 para o divisor
            if (num1 == 0) {
                mtdC(view);
                Toast.makeText(this, "NÃO É POSSIVEL DIVIDIR POR 0", Toast.LENGTH_LONG).show();
            } else {
                total = num2 / num1;
            }
        }

        // se o usuario havia feito outra operação, irá finalizar o calculo anterior
        if(sinal.equals("+")){
            total = num1 + num2;
        } else if(sinal.equals("*")){
            total = num1 * num2;
        } else if(sinal.equals("-")){
            total = num2 - num1;
        }

        tvResultado.setText(String.valueOf(total));
        total = 0;
        sinal = "/";
        ponto = false;
    }


    public void mtdPonto(View view){ // permite digitar um "." para numeros decimais

        if (!ponto) { // verifica se o usuario já inseriu um ponto, evitando que insira varíos

            // se clicar no "btnPonto" após ter clicado no "btnIgual" irá esvaziar os calculos feitos, e "tvOperacoes" recebe "."
            if (tvOperacoes.getText().equals(tvResultado.getText())) {
                mtdC(view);
                tvOperacoes.setText(tvOperacoes.getText() + ".");
                ponto = true;
            } else {
                tvOperacoes.setText(tvOperacoes.getText() + "."); // senao apenas recebe "."
                ponto = true;
            }
        }
    }


    public void mtdC(View view){ // limpa as variaveis e calculos feitos
        sinal = "";
        total = 0;
        num1 = 0;
        num2 = 0;
        tvOperacoes.setText("");
        tvResultado.setText("");
        ponto = false;
    }


    public void mtdIgual(View view){

        if(sinal.equals("+")){

            // se clicar no "btnIgual" após ter clicado no "btnSomar", num1 recebe "0" para que o total seja apenas o valor do "tvResultado"
            // OU
            // se clicar no "btnIgual" após ter inserido apenas um ".", num1 recebe "0"
            if(tvOperacoes.getText().equals("") || tvOperacoes.getText().equals(".")){
                num1 = 0;
            }else {
                num1 = Float.parseFloat(tvOperacoes.getText().toString());
            }

            num2 = Float.parseFloat(tvResultado.getText().toString());

            total =  num1 + num2;

            tvResultado.setText(String.valueOf(total));
            tvOperacoes.setText(String.valueOf(total));

            total = 0;
            sinal = "=";
            ponto = false;
        }


        if(sinal.equals("-")){

            // se clicar no "btnIgual" após ter clicado no "btnSubtrair", num1 recebe "0" para que o total seja apenas o valor do "tvResultado"
            // OU
            // se clicar no "btnIgual" após ter inserido apenas um ".", num1 recebe "0"
            if(tvOperacoes.getText().equals("") || tvOperacoes.getText().equals(".")){
                num1 = 0;
            }else {
                num1 = Float.parseFloat(tvOperacoes.getText().toString());
            }

            num2 = Float.parseFloat(tvResultado.getText().toString());

            total =  num2 - num1;

            tvResultado.setText(String.valueOf(total));
            tvOperacoes.setText(String.valueOf(total));

            total = 0;
            sinal = "=";
            ponto = false;
        }


        if(sinal.equals("*")){

            // se clicar no "btnIgual" após ter clicado no "btnMultiplicar", num1 recebe "0" para que o total seja apenas o valor do "tvResultado"
            // OU
            // se clicar no "btnIgual" após ter inserido apenas um ".", num1 recebe "0"
            if(tvOperacoes.getText().equals("") || tvOperacoes.getText().equals(".")){
                num1 = 0;
            }else {
                num1 = Float.parseFloat(tvOperacoes.getText().toString());
            }

            num2 = Float.parseFloat(tvResultado.getText().toString());

            total =  num1 * num2;

            tvResultado.setText(String.valueOf(total));
            tvOperacoes.setText(String.valueOf(total));

            total = 0;
            sinal = "=";
            ponto = false;
        }


        if(sinal.equals("/")){

            // se clicar no "btnIgual" após ter clicado no "btnDividir", num1 recebe "0" para que o total seja apenas o valor do "tvResultado"
            // OU
            // se clicar no "btnIgual" após ter inserido apenas um ".", num1 recebe "1"
            if(tvOperacoes.getText().equals("") || tvOperacoes.getText().equals(".")){
                num1 = 1;
            }else {
                num1 = Float.parseFloat(tvOperacoes.getText().toString());
            }

            num2 = Float.parseFloat(tvResultado.getText().toString());

            if (num1 == 0) {
                mtdC(view);
                Toast.makeText(this, "NÃO É POSSIVEL DIVIDIR POR 0", Toast.LENGTH_LONG).show();
            } else {
                total = num2 / num1;
            }

            tvResultado.setText(String.valueOf(total));
            tvOperacoes.setText(String.valueOf(total));

            total = 0;
            sinal = "=";
            ponto = false;
        }
    }


    public void mtdInfo(View view) { // Informações
        Toast.makeText(this, "Calculadora desenvolvida por Raí Vargas, \nRU: 2239968", Toast.LENGTH_LONG).show();
    }

}
