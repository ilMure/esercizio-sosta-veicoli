public class App {
    public static void main(String[] args) throws Exception {
        Parcheggio p = new Parcheggio();
        Automobile audi = new Automobile("Audi", p);
        Automobile bwm = new Automobile("Bmw", p);
        Automobile fiat = new Automobile("Fiat", p);
        Automobile alfaromeo = new Automobile("AlfaRomeo", p);
        Automobile mazda = new Automobile("Mazda", p);
        Automobile renault = new Automobile("Renault", p);
        Automobile citroen = new Automobile("Citroen", p);
        Automobile ferrari = new Automobile("Ferrari", p);

        audi.start();
        bwm.start();
        fiat.start();
        alfaromeo.start();
        mazda.start();
        renault.start();
        citroen.start();
        ferrari.start();

        
    }
}
