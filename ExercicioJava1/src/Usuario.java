public class Usuario {
    public static void main(String[] args) throws Exception {
SmartTv smartTv= new SmartTv();

       System.out.println("A Tv está Ligada? " + smartTv.Ligada);
       System.out.println("O Canal é " + smartTv.canal);
       System.out.println("O Volume é  " + smartTv.volume);

       smartTv.Ligar();
       System.out.println(" Novo Status da TV ----> Ligou?  " + smartTv.Ligada);
       smartTv.AumentaVolume();
       System.out.println(" Novo Status do Volume ----> Aumentou?  " + smartTv.volume);
       smartTv.DiminuiVolume();
       System.out.println(" Novo Status do Volume ----> Diminuiu?  " + smartTv.volume);
       smartTv.AumentaCanal();
       System.out.println(" Novo Status do Canal----> Aumentou?  " + smartTv.canal);
       smartTv.DiminuiCanal();
       System.out.println(" Novo Status do Canal ----> Diminuiu?  " + smartTv.canal);
       smartTv.ALteraCanal(20);
       System.out.println(" Novo Status do Canal ----> Alterou?  " + smartTv.canal);
       smartTv.Desligar();
       System.out.println(" Novo Status do TV ----> Desligou?  " + smartTv.Ligada);

    }
}
