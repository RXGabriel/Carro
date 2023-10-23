public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;

    double precoCompra;
    Pessoa proprietario;

    int calculartempoUsoEmAnos(){
        return 2022 - anoFabricacao;
    }

    double valorRevendaMeuCarro= calcularValorRevenda();
    int tempoUsoMeuCarro= calculartempoUsoEmAnos();

    void imprimirResumoDepreciacao(){

        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calculartempoUsoEmAnos();

        if (precoCompra <=0){
            System.out.println("Carro com preco de compra zerado. " +
                    "Nao foi possivel imprimir o resumo de depreciacao.");
        }

        System.out.printf("Tempo de uso (anos): %d%n",tempoUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }


    double calculaIpva(){
        int tempoDeUsoAnos = calculartempoUsoEmAnos();

        if (tempoDeUsoAnos >= 10 ) {
            return 0;
        }

        return calcularValorRevenda() *0.04;
    }


    double calcularValorRevenda() {
      int tempoDeUsoEmAnos =calculartempoUsoEmAnos();
      int vidautilAnos=20;

      double valorRevenda =(precoCompra/vidautilAnos)
              * (vidautilAnos-tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda=0;
        }
        return valorRevenda;
    }
}
