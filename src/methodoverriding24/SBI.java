package methodoverriding24;

class SBI extends Bank{
    @Override
    public int getRateOfInterest() {   //Creating child classes.
        return 8;
    }
}
