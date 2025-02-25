public class Coffee extends Drink {
    private int typeCoffee;
    private char sizeCoffee;
    private Barista barista;

    public Coffee(int type, char size, int typeCoffee, Barista barista) {
        super(type, size);
        this.typeCoffee = typeCoffee;
        this.sizeCoffee = size;
        this.barista = barista;
    }

    public Coffee(int type, int typeCoffee) {
        super(type, 'S');
        this.typeCoffee = typeCoffee;
        this.barista = new Barista("Unknown", 'U');
    }

    public Barista getBarista() {
        return barista;
    }

    @Override
    public String getTypeName() {
        switch (typeCoffee) {
            case 1: return "Americano";
            case 2: return "Espresso";
            case 3: return "Cappuccino";
            default: return null;
        }
    }

    @Override
    public int getTypePrice() {
        switch (typeCoffee) {
            case 1: return 50;
            case 2: return 55;
            case 3: return 65;
            default: return 0;
        }
    }

    @Override
    public String getSizeName() {
        switch (sizeCoffee) {
            case 'S': return "Short";
            case 'T': return "Tall";
            case 'G': return "Grande";
            case 'V': return "Venti";
            default: return null;
        }
    }

    @Override
    public int getSizePrice() {
        switch (sizeCoffee) {
            case 'S': return 100;
            case 'T': return 150;
            case 'G': return 200;
            case 'V': return 250;
            default: return 0;
        }
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getTypePrice() + getSizePrice();
    }

    @Override
    public String toString() {
        return getTypeName() + " " + getTypeName() + " (" + getSizeName() + ") is " + getTotalPrice() + " baht";
    }

}
