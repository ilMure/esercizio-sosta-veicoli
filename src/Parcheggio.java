public class Parcheggio {
    private int liberi = 4;

    public synchronized void parcheggia(){
        if (liberi == 0){
            System.out.println("---"+Thread.currentThread().getName()+" è in attesa");
        }
        while(liberi == 0){     
            try {
                wait((int) Math.random()*10000 +1);
            } catch (InterruptedException e) {
            }
        }
        liberi--;
    }

    public synchronized void lasciaParcheggio(){
        liberi++;
        notifyAll();
    }
}
