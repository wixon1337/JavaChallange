public final class RefactorTelescope extends Telescope {
    private int numberOfLenses;

    public int getNumberOfLenses() {
        return numberOfLenses;
    }

    public void setNumberOfLenses(int numberOfLenses) throws NotPositiveNumberException {
        if (numberOfLenses < 0) {
            throw new NotPositiveNumberException("Pozitiv kell");
        } else {
            this.numberOfLenses = numberOfLenses;
        }
    }

    public RefactorTelescope(double diameter, int fLength, int numberOfLenses) throws NotPositiveNumberException {
        super(diameter, fLength);
        if (numberOfLenses < 0) {
            throw new NotPositiveNumberException("Pozitiv kell");
        } else {
            this.numberOfLenses = numberOfLenses;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Number of lenses: " + this.numberOfLenses;
    }

    @Override
    public boolean hasColorError() {
        return true;
    }
}
