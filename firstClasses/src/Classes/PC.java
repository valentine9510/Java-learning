package Classes;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
