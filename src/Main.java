public class Main {
    public static void main(String[] args) {
        Pessoa eu= new Pessoa();
        eu.nome="Thiago Faria";
        eu.cpf="111.222.333-44";
        eu.anoNascimento=1981;

        Pessoa voce = new Pessoa();
        voce.nome="Joao";
        voce.cpf="999.999.999-99";
        voce.anoNascimento=1992;

        Carro meuCarro=new Carro();
        meuCarro.anoFabricacao=2021;
        meuCarro.cor="Preto";
        meuCarro.fabricante="Honda";
        meuCarro.modelo="HR-V";
        meuCarro.precoCompra= 0;
        meuCarro.proprietario=eu;

        Carro seuCarro=new Carro();
        seuCarro.anoFabricacao=2022;
        seuCarro.cor="Branco";
        seuCarro.fabricante="BMW";
        seuCarro.modelo="X6";
        seuCarro.precoCompra= 980000;
        seuCarro.proprietario=voce;

//        double ipva =meuCarro.calculartempoUsoEmAnos();
//        System.out.println(ipva);

        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();











//        double valorRevendaMeuCarro= meuCarro.calcularValorRevenda();
//        int tempoUsoMeuCarro= meuCarro.calculartempoUsoEmAnos();
//
//
//

//        System.out.println("Meu carro");
//        System.out.println("------");
//        System.out.printf("Modelo:%s%n",meuCarro.modelo);
//        System.out.printf("Ano:%d%n",meuCarro.anoFabricacao);
//        System.out.printf("Proprietario:%s%n",meuCarro.proprietario.nome);
//
//        System.out.println();
//
//        System.out.println("Seu carro");
//        System.out.println("------");
//        System.out.printf("Modelo:%s%n",seuCarro.modelo);
//        System.out.printf("Ano:%d%n",seuCarro.anoFabricacao);
//        System.out.printf("Proprietario:%s%n",seuCarro.proprietario.nome);
    }
}