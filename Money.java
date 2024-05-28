public class Money {
    private long dollars;
    private long cents;

    // Constructors
    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (int) ((amount - this.dollars) * 100);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Getters
    public long getDollars() {
        return dollars;
    }

    public long getCents() {
        return cents;
    }

    // Methods
    @Override
    public boolean equals(Object other) {
        if (other instanceof Money) {
            Money otherMoney = (Money) other;
            return this.dollars == otherMoney.dollars && this.cents == otherMoney.cents;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    public long compareTo(Money other) {
        if (this.dollars == other.dollars) {
            return this.cents - other.cents;
        }
        return (long) (this.dollars - other.dollars);
    }

    public Money add(Money other) {
        long totalCents = this.toCents() + other.toCents();
        return new Money(totalCents / 100, (int) (totalCents % 100));
    }

    public Money subtract(Money other) {
        long totalCents = this.toCents() - other.toCents();
        return new Money(totalCents / 100, (int) (totalCents % 100));
    }

    private long toCents() {
        return this.dollars * 100 + this.cents;
    }
}
