public class SmartTv {

    boolean Ligada=false;
    int canal=13;
    int volume=8;

    public void Ligar(){
        Ligada=true;
    }
    

    public void Desligar(){
        Ligada=false;
    }

    public void AumentaVolume(){
        volume++;
    }

    public void DiminuiVolume(){
        volume--;
    }

    public void AumentaCanal(){
        canal++;
    }

    public void DiminuiCanal(){
        canal--;
    }

    public void ALteraCanal(int NovoCanal){
        canal=NovoCanal;
    }
}

