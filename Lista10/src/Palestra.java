public class Palestra {
    private LUZ l;
    
    public Palestra(LUZ l){
        this.l = l;
    }

    public LUZ getL() {
        return l;
    }
public void acessa(){
    switch(l){
        case VERMELHO:
            System.out.println("Vermelho - Palestra esta indisponivel");
            break;
        case AMBAR:
            System.out.println("Ambar - Palestra esta sendo liberada");
            break;
        case VERDE:
            System.out.println(("Verde - Palestra esta disponivel"));
            break;
    }
}
   
}
