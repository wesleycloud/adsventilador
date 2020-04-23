package segunda.aep;

public class ventilador{
    private String modelo;
    private String cor;
    private String PaisDeOrigem;

    boolean ligada;



    public ventilador(String cor, String modelo, String PaisDeOrigem ){
        this.cor = "preta";
        this.modelo = "simples";
        this.PaisDeOrigem = "Brasil";
    }

    public ventilador( ){

    }
    public void liga(){ 
    this.ligada = true; 
    } 
    public void desliga(){ 
    ligada = false; 
    } 


    public String observa(){ 
    if(ligada){
    return "ligada" ; 
    }else{ 
    return "desligada"; 
    } 
    }     
    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getcor() {
        return cor;
    }

    public void setPaisDeOrigem(String PaisDeOrigem) {
        this.PaisDeOrigem = PaisDeOrigem;
    }

    public String getPaisDeOrigem() {
        return PaisDeOrigem;
    }
}
