public class Automobile extends Thread{
    private Parcheggio p;
    
    public Automobile(String nome, Parcheggio p){
        super(nome);
        this.p = p;
    }

    @Override
    public void run() {
        synchronized(p){
            p.parcheggia();
            System.out.println("<--"+getName()+" ha parcheggiato");
        }
        int parkTime = (int) (Math.random()*5000) + 1;
        try {
            sleep(parkTime);
        } catch (InterruptedException e) {
        }
        synchronized(p){
            p.lasciaParcheggio();
            System.out.println("-->"+getName()+" ha lasciato il parcheggio");
        }
        
    }
    
}
